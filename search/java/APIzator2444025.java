package com.stackoverflow.api;

import com.google.gwt.user.client.Random;

/**
 * How do I generate a random integer between min and max in java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2444025">https://stackoverflow.com/a/2444025</a>
 */
public class APIzator2444025 {

  public static int generateInteger() throws RuntimeException {
    Random random = new Random();
    return random.nextInt(max + 1 - min) + min;
  }
}
