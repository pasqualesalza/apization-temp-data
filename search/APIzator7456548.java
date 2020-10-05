package com.stackoverflow.api;

/**
 * What does the "+=" operator do in Java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/7456548">https://stackoverflow.com/a/7456548</a>
 */
public class APIzator7456548 {

  public static void do_(int x) throws RuntimeException {
    // just fine; hidden cast, x == 1 after assignment
    x += 1.1;
    // won't compile! 'cannot convert from double to int'
    x = x + 1.1;
  }
}
