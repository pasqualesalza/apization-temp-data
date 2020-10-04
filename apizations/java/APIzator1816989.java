package com.stackoverflow.api;

import com.amazonaws.util.StringUtils;

/**
 * Java: How do I count the number of occurrences of a char in a String?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1816989">https://stackoverflow.com/a/1816989</a>
 */
public class APIzator1816989 {

  public static int java() throws RuntimeException {
    int count = StringUtils.countMatches("a.b.c.d", ".");
    return StringUtils.countOccurrencesOf("a.b.c.d", ".");
  }
}
