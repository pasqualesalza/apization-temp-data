package com.stackoverflow.api;

/**
 * Get a resource using getResource()
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2593175">https://stackoverflow.com/a/2593175</a>
 */
public class APIzator2593175 {

  public static void getResource(String str1) throws RuntimeException {
    TestGameTable.class.getResource(str1);
  }
}
