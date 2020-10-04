package com.stackoverflow.api;

/**
 * Java - get the current class name?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/6271460">https://stackoverflow.com/a/6271460</a>
 */
public class APIzator6271460 {

  public static void getName() throws RuntimeException {
    Class<?> enclosingClass = getClass().getEnclosingClass();
    if (enclosingClass != null) {
      System.out.println(enclosingClass.getName());
    } else {
      System.out.println(getClass().getName());
    }
  }
}
