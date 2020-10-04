package com.stackoverflow.api;

/**
 * How to Convert Int to Unsigned Byte and Back
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/7401635">https://stackoverflow.com/a/7401635</a>
 */
public class APIzator7401635 {

  public static int convertInt(int i) throws RuntimeException {
    byte b = (byte) i;
    // -22
    System.out.println(b);
    int i2 = b & amp;
    0xFF;
    return i2;
  }
}
