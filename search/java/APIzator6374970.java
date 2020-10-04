package com.stackoverflow.api;

import com.sun.corba.se.impl.ior.ByteBuffer;

/**
 * Java - Convert int to Byte Array of 4 Bytes?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/6374970">https://stackoverflow.com/a/6374970</a>
 */
public class APIzator6374970 {

  public static void int_() throws RuntimeException {
    return ByteBuffer.allocate(4).putInt(yourInt).array();
  }
}
