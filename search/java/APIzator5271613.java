package com.stackoverflow.api;

import com.google.gwt.user.client.Random;

/**
 * Java Generate Random Number Between Two Given Values
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/5271613">https://stackoverflow.com/a/5271613</a>
 */
public class APIzator5271613 {

  public static int generateNumber(int Low, int High) throws RuntimeException {
    Random r = new Random();
    return r.nextInt(High - Low) + Low;
  }
}
