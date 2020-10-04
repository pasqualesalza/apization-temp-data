package com.stackoverflow.api;

/**
 * Get keys from HashMap in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/10462838">https://stackoverflow.com/a/10462838</a>
 */
public class APIzator10462838 {

  public static void getKey() throws RuntimeException {
    team1.put("foo", 1);
    team1.put("bar", 2);
    for (String key : team1.keySet()) {
      System.out.println(key);
    }
  }
}
