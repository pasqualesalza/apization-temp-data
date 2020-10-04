package com.stackoverflow.api;

/**
 * How to cast Object to boolean?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2206604">https://stackoverflow.com/a/2206604</a>
 */
public class APIzator2206604 {

  public static boolean castObject() throws RuntimeException {
    boolean di = (Boolean) someObject;
    return ((Boolean) someObject).booleanValue();
  }
}
