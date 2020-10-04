package com.stackoverflow.api;

import com.google.gwt.user.client.Random;

/**
 * How can I generate random number in specific range in Android?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/6029519">https://stackoverflow.com/a/6029519</a>
 */
public class APIzator6029519 {

  public static int generateNumber() throws RuntimeException {
    Random r = new Random();
    return r.nextInt(80 - 65) + 65;
  }
}
