package com.stackoverflow.api;

import java.security.SecureRandom;

/**
 * How to solve slow Java `SecureRandom`?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/137288">https://stackoverflow.com/a/137288</a>
 */
public class APIzator137288 {

  public static void solveJava() throws RuntimeException {
    SecureRandom.getInstance("SHA1PRNG");
  }
}
