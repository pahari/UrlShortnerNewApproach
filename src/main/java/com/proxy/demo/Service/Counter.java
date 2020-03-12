package com.proxy.demo.Service;

import java.math.BigInteger;

public class Counter {

   // BigInteger c = new BigInteger("6132423423423423423423");
    BigInteger c = new BigInteger("0");
   static BigInteger increment = new BigInteger("1");

    public BigInteger getcounter(){
      c =  c.add(increment) ;
      return c;

   }

}
