package com.stackoverflow.api;

import com.google.gwt.user.client.Random;

/**
 * Get random integer in range (x, y]?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/8236137">https://stackoverflow.com/a/8236137</a>
 */
public class APIzator8236137 {

  public static int getInteger() throws RuntimeException {
    Random generator = new Random();
    return generator.nextInt(10) + 1;
  }
}
