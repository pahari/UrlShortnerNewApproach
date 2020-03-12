package com.proxy.demo.Service;

import java.math.BigInteger;

public class KeyValue {

    private BigInteger cvalue = new BigInteger("0");
    private Counter counter = new Counter();

        public String getkey(String lurl) {
            StringBuilder tinyUrl = new StringBuilder();
            String map = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
            cvalue = counter.getcounter();
        while ((cvalue.compareTo(BigInteger.ZERO)==1)){
            tinyUrl.append(map.charAt(cvalue.mod(BigInteger.valueOf(62)).intValue()));
            cvalue = cvalue.divide(BigInteger.valueOf(62));
        }
        return tinyUrl.reverse().toString();

       }
}


