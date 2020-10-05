package com.stackoverflow.api;

import java.util.Scanner;

/**
 * java.util.NoSuchElementException: No line found
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/7209487">https://stackoverflow.com/a/7209487</a>
 */
public class APIzator7209487 {

  public static void javautil(Scanner sc, String str) throws RuntimeException {
    while (sc.hasNextLine()) {
      str = sc.nextLine();
      // ...
    }
  }
}
