package com.stackoverflow.api;

import com.google.gwt.user.client.rpc.core.java.util.Arrays;

/**
 * List<String> to ArrayList<String> conversion issue
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/13135054">https://stackoverflow.com/a/13135054</a>
 */
public class APIzator13135054 {

  public static void string() throws RuntimeException {
    allWords = Arrays.asList(strTemp.toLowerCase().split("\\s+"));
    allWords.addAll(Arrays.asList(strTemp.toLowerCase().split("\\s+")));
  }
}
