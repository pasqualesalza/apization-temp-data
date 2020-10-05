package com.stackoverflow.api;

/**
 * Getting the class name from a static method in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/936696">https://stackoverflow.com/a/936696</a>
 */
public class APIzator936696 {

  public static void getName() throws RuntimeException {
    // full name with package
    MyClass.class.getName();
    // class name and no more
    MyClass.class.getSimpleName();
  }
}
