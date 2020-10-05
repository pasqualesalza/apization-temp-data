package com.stackoverflow.api;

import com.google.gwt.user.client.Random;

/**
 * How to randomly pick an element from an array
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/8065554">https://stackoverflow.com/a/8065554</a>
 */
public class APIzator8065554 {

  public static int getRandom(int[] array) {
    int rnd = new Random().nextInt(array.length);
    return array[rnd];
  }
}
