package com.stackoverflow.api;

/**
 * Converting from byte to int in java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/9581563">https://stackoverflow.com/a/9581563</a>
 */
public class APIzator9581563 {

  public static void convert() throws RuntimeException {
    int i = rno[0];
    // Boxing conversion converts `byte` to `Byte`
    Byte b = rno[0];
    int i = b.intValue();
    Byte b = new Byte(rno[0]);
    int i = b.intValue();
    int i;
    byte b;
    i = 5;
    b = (byte) i;
  }
}
