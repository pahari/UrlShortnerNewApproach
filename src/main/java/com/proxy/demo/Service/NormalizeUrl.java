package com.proxy.demo.Service;

public class NormalizeUrl {

    public String urlnormalize(String lurl){
        if (lurl.substring(0, 7).equals("http://"))
            lurl = lurl.substring(7);
        if (lurl.substring(0, 8).equals("https://"))
            lurl = lurl.substring(8);
        if (lurl.charAt(lurl.length() - 1) == '/')
            lurl = lurl.substring(0, lurl.length() - 1);
        return lurl;
    }
}
