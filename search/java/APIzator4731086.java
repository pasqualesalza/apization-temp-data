package com.stackoverflow.api;

import java.util.regex.Matcher;

/**
 * Whitespace Matching Regex - Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/4731086">https://stackoverflow.com/a/4731086</a>
 */
public class APIzator4731086 {

  public static String java(Matcher matcher) throws RuntimeException {
    String result = matcher.replaceAll(" ");
    return result;
  }
}
