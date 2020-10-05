package com.stackoverflow.api;

import org.hibernate.type.AnyType;

/**
 * Test if object implements interface
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/766144">https://stackoverflow.com/a/766144</a>
 */
public class APIzator766144 {

  public static void test() throws RuntimeException {
    if ("" instanceof java.io.Serializable) {
      // it's true
    }
    if (null instanceof AnyType) {
      // never reached
    }
  }
}
