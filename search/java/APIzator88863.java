package com.stackoverflow.api;

/**
 * How to convert Strings to and from UTF8 byte arrays in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/88863">https://stackoverflow.com/a/88863</a>
 */
public class APIzator88863 {

  public static String convertString(byte[] b) throws RuntimeException {
    String s = "some text here";
    byte[] b = s.getBytes("UTF-8");
    return new String(b, "US-ASCII");
  }
}
