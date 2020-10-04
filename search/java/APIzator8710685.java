package com.stackoverflow.api;

/**
 * Why don't Java's +=, -=, *=, /= compound assignment operators require casting?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/8710685">https://stackoverflow.com/a/8710685</a>
 */
public class APIzator8710685 {

  public static void requireCast(short x, short x) throws RuntimeException {
    x += 4.6;
    x = (short) (x + 4.6);
  }
}
