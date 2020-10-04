package com.stackoverflow.api;

/**
 * Java sending and receiving file (byte[]) over sockets
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/9526674">https://stackoverflow.com/a/9526674</a>
 */
public class APIzator9526674 {

  public static void java(byte[] buffer) throws RuntimeException {
    int count;
    while ((count = in.read(buffer)) > 0) {
      out.write(buffer, 0, count);
    }
  }
}
