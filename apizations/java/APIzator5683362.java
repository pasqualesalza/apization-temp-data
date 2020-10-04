package com.stackoverflow.api;

import com.google.gwt.user.client.Random;

/**
 * How to generate a random string of 20 characters
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/5683362">https://stackoverflow.com/a/5683362</a>
 */
public class APIzator5683362 {

  public static String generateString() throws RuntimeException {
    char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    StringBuilder sb = new StringBuilder(20);
    Random random = new Random();
    for (int i = 0; i < 20; i++) {
      char c = chars[random.nextInt(chars.length)];
      sb.append(c);
    }
    String output = sb.toString();
    return output;
  }
}
