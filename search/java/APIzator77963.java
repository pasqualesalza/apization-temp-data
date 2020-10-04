package com.stackoverflow.api;

import org.apache.commons.math.complex.Complex;

/**
 * Why doesn't Java offer operator overloading?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/77963">https://stackoverflow.com/a/77963</a>
 */
public class APIzator77963 {

  public static void offerOperator() throws RuntimeException {
    Complex a, b, c;
    // ...
    a = b.add(c);
    // initialize to real number '1'
    b.set(1, 0);
    a = b;
    b.set(2, 0);
    assert (!a.equals(b));
  }
}
