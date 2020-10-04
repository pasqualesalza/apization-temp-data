package com.stackoverflow.api;

import com.sun.corba.se.impl.ior.ByteBuffer;

/**
 * Java integer to byte array
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2183279">https://stackoverflow.com/a/2183279</a>
 */
public class APIzator2183279 {

  public static void integer() throws RuntimeException {
    byte[] bytes = ByteBuffer.allocate(4).putInt(1695609641).array();
    for (byte b : bytes) {
      System.out.format("0x%x ", b);
    }
  }
}
