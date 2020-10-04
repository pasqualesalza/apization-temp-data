package com.stackoverflow.api;

import com.sun.corba.se.impl.ior.ByteBuffer;

/**
 * String to char array Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/10048969">https://stackoverflow.com/a/10048969</a>
 */
public class APIzator10048969 {

  public static void java(String str) throws RuntimeException {
    char[] charArray = str.toCharArray();
    byte[] bytes = ByteBuffer.allocate(4).putInt(1695609641).array();
    for (byte b : bytes) {
      System.out.format("0x%x ", b);
    }
  }
}
