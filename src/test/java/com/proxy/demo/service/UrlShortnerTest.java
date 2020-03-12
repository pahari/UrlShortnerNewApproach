package com.proxy.demo.service;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.proxy.demo.Service.KeyValue;
import com.proxy.demo.Service.NormalizeUrl;
import com.proxy.demo.Service.UrlShortner;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class UrlShortnerTest {
    @Mock
    private NormalizeUrl normalizeUrl;
    @Mock
    private KeyValue keyValue;
    private UrlShortner urlShortner;

    @Before
    public void  init(){
        MockitoAnnotations.initMocks(this);
      urlShortner = new UrlShortner(normalizeUrl,keyValue);
    }

    @Test
    public void test_verifygetshorturl() {
        when(normalizeUrl.urlnormalize(any())).thenReturn("www.google.com");
        when(keyValue.getkey(any())).thenReturn("MGDSu67");
        String surl = urlShortner.getshorturl("http://www.google.com");
        assertEquals("http://www.localhost:8080/MGDSu67", surl);
    }

    @Test
    public void test_getlurl() {
        String surl = urlShortner.getlurl("asdf");
        assertEquals(null, surl);
    }
}
