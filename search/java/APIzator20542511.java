package com.stackoverflow.api;

/**
 * Compare non-primitive Long values 127 and 128
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/20542511">https://stackoverflow.com/a/20542511</a>
 */
public class APIzator20542511 {

  public static String compareValue(Long val1, Long val2, Long val3, Long val4)
    throws RuntimeException {
    System.out.println(val1 == val2);
    System.out.println(val3 == val4);
    // true
    System.out.println(val3.equals(val4));
    // true
    System.out.println(val3.longValue() == val4.longValue());
    return (long) val3 == (long) val4;
  }
}
