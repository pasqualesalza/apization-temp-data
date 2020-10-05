package com.stackoverflow.api;

/**
 * Casting variables in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/5289493">https://stackoverflow.com/a/5289493</a>
 */
public class APIzator5289493 {

  public static Double castVariable(Object o, String o)
    throws RuntimeException {
    String str = (String) o;
    // Compilation fails here
    Integer str = (Integer) o;
    Number o = new Integer(5);
    return (Double) o;
  }
}
