package com.stackoverflow.api;

/**
 * How to sum a list of integers with java streams?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/30125523">https://stackoverflow.com/a/30125523</a>
 */
public class APIzator30125523 {

  public static void sumList() throws RuntimeException {
    integers.values().stream().mapToInt(i -> i.intValue()).sum();
    integers.values().stream().mapToInt(Integer::intValue).sum();
  }
}
