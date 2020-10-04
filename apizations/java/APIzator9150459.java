package com.stackoverflow.api;

/**
 * compareTo with primitives -> Integer / int
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/9150459">https://stackoverflow.com/a/9150459</a>
 */
public class APIzator9150459 {

  public static int compareto() throws RuntimeException {
    int cmp = a > b ? +1 : a < b ? -1 : 0;
    int cmp;
    if (a > b) cmp = +1; else if (a < b) cmp = -1; else cmp = 0;
    // in Java 7
    int cmp = Integer.compare(a, b);
    // before Java 7
    int cmp = Double.compare(a, b);
    return a - b;
  }
}
