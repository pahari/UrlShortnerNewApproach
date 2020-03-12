package com.proxy.demo.Service;

import java.util.HashMap;

public class UrlShortner {
    private NormalizeUrl longurl;
    private KeyValue key;

    public  UrlShortner(NormalizeUrl longurl,KeyValue key){
        this.longurl = longurl;
        this.key = key;
    }
    //ValueMap is used to store Key as Index and Lurl as Value
    public static HashMap<String,String> valuemap = new HashMap<String, String>();
    //chekmap is used to store Key as Lurl and key as Value
    public static HashMap<String,String> checkmap = new HashMap<String, String>();
    public  static String  host = "http://www.localhost:8080/";

    public String getshorturl(String lurl){
        lurl = lurl.trim();
        lurl = lurl.toLowerCase();
      // Normalize method will remove Http,Https and leading / from url
      lurl = longurl.urlnormalize(lurl);
        if(checkmap.containsKey(lurl))
            return host+checkmap.get(lurl);
        String surlkey =   key.getkey(lurl);
        if (valuemap.containsKey(surlkey))
            surlkey = key.getkey(lurl);
        valuemap.put(surlkey,lurl);
        checkmap.put(lurl,surlkey);
        return  host+ surlkey;
    }

    public String getlurl(String surlkey){
        surlkey = surlkey.trim();
        if(!valuemap.containsKey(surlkey))
                    return null;
        return  valuemap.get(surlkey);
    }


}
