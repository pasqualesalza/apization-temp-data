package com.stackoverflow.api;

/**
 * How to implement infinity in Java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/12952069">https://stackoverflow.com/a/12952069</a>
 */
public class APIzator12952069 {

  public static String implementInfinity(double inf) throws RuntimeException {
    System.out.println(inf + 5);
    // same as Double.NaN
    System.out.println(inf - inf);
    return inf * -1;
  }
}
