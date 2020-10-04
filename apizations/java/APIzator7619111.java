package com.stackoverflow.api;

import com.sun.corba.se.impl.ior.ByteBuffer;

/**
 * Convert a byte array to integer in Java and vice versa
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/7619111">https://stackoverflow.com/a/7619111</a>
 */
public class APIzator7619111 {

  public static byte[] convertArray(byte[] arr) throws RuntimeException {
    // big-endian by default
    ByteBuffer wrapped = ByteBuffer.wrap(arr);
    // 1
    short num = wrapped.getShort();
    ByteBuffer dbuf = ByteBuffer.allocate(2);
    dbuf.putShort(num);
    return dbuf.array();
  }
}
