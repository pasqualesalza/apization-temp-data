package com.stackoverflow.api;

/**
 * GoTo Next Iteration in For Loop in java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/11160969">https://stackoverflow.com/a/11160969</a>
 */
public class APIzator11160969 {

  public static void iteration() throws RuntimeException {
    continue;
    for (int i = 0; i < 5; i++) {
      if (i == 2) {
        continue;
      }
      System.out.print(i);
    }
  }
}
