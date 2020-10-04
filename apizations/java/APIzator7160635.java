package com.stackoverflow.api;

/**
 * iterating through Enumeration of hastable keys throws NoSuchElementException error
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/7160635">https://stackoverflow.com/a/7160635</a>
 */
public class APIzator7160635 {

  public static void throwError() throws RuntimeException {
    while (e.hasMoreElements()) {
      String param = e.nextElement();
      System.out.println(param);
    }
  }
}
