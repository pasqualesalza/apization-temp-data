package com.stackoverflow.api;

import com.google.appengine.repackaged.org.antlr.runtime.IntStream;

/**
 * How can I test if an array contains a certain value?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1128728">https://stackoverflow.com/a/1128728</a>
 */
public class APIzator1128728 {

  public static boolean test(int[] a) throws RuntimeException {
    return IntStream.of(a).anyMatch(x -> x == 4);
  }
}
