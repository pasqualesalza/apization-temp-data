package com.stackoverflow.api;

/**
 * Android Split string
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/3732820">https://stackoverflow.com/a/3732820</a>
 */
public class APIzator3732820 {

  public static void string(String currentString) throws RuntimeException {
    String[] separated = currentString.split(":");
    // this will contain "Fruit"
    separated[0];
    // this will contain " they taste good"
    separated[1];
  }
}
