package com.stackoverflow.api;

import scala.reflect.internal.util.Set;

/**
 * Easiest way to convert a List to a Set in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1429869">https://stackoverflow.com/a/1429869</a>
 */
public class APIzator1429869 {

  public static Set<Foo> way() throws RuntimeException {
    return new HashSet<Foo>(myList);
  }
}
