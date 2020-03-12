package com.proxy.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UrlService {
    @Autowired
    UrlShortner urlShortner;
    public String getsurl(String lurl){
        return urlShortner.getshorturl(lurl);
    }

    public String getlurl(String surlkey){
        return urlShortner.getlurl(surlkey);
    }
}
