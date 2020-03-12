package com.proxy.demo.service;

import com.proxy.demo.Service.NormalizeUrl;
import org.junit.*;
import static org.junit.Assert.assertEquals;

public class NormalizeUrlTest {
    @Test
    public void test_verifyurlnormalize() {
        NormalizeUrl normalizeUrl = new NormalizeUrl();

        assertEquals(normalizeUrl.urlnormalize("http://www.google.com"),"www.google.com");
        assertEquals(normalizeUrl.urlnormalize("www.google.com/"),"www.google.com");
        assertEquals(normalizeUrl.urlnormalize("https://www.google.com"),"www.google.com");
    }
}
