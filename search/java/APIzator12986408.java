package com.stackoverflow.api;

import com.google.gwt.user.client.rpc.core.java.util.Arrays;

/**
 * Why does my sorting loop seem to append an element where it shouldn't?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/12986408">https://stackoverflow.com/a/12986408</a>
 */
public class APIzator12986408 {

  public static void seem(String[] strings) throws RuntimeException {
    Arrays.sort(strings);
  }
}
