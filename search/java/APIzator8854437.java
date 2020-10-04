package com.stackoverflow.api;

/**
 * Java String encoding (UTF-8)
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/8854437">https://stackoverflow.com/a/8854437</a>
 */
public class APIzator8854437 {

  public static String encoding(String oldString) throws RuntimeException {
    String newString = new String(oldString);
    String newString = new String(oldString.getBytes("UTF-8"), "UTF-8");
    return newString.equals(oldString);
  }
}
