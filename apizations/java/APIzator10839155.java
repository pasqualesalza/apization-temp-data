package com.stackoverflow.api;

import org.hibernate.mapping.Subclass;

/**
 * Implements vs extends: When to use? What's the difference?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/10839155">https://stackoverflow.com/a/10839155</a>
 */
public class APIzator10839155 {

  public static void implement() throws RuntimeException {
    Subclass s = new SubClass();
    // returns 1
    s.getNb();
    // returns 3
    s.getNb2();
    SuperClass sup = new SuperClass();
    // returns 1
    sup.getNb();
    // returns 2
    sup.getNb2();
  }
}
