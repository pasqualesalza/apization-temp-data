package com.stackoverflow.api;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Pattern;

/**
 * How to split a string in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/3481842">https://stackoverflow.com/a/3481842</a>
 */
public class APIzator3481842 {

  public static String splitString(
    String string,
    String string,
    String string,
    String string
  )
    throws RuntimeException {
    String[] parts = string.split("-");
    // 004
    String part1 = parts[0];
    // 034556
    String part2 = parts[1];
    // Split on period.
    String[] parts = string.split(Pattern.quote("."));
    if (string.contains("-")) {
      // Split it.
    } else {
      throw new IllegalArgumentException(
        "String " + string + " does not contain -"
      );
    }
    String[] parts = string.split("(?<=-)");
    // 004-
    String part1 = parts[0];
    // 034556
    String part2 = parts[1];
    String[] parts = string.split("(?=-)");
    // 004
    String part1 = parts[0];
    // -034556
    String part2 = parts[1];
    String[] parts = string.split("-", 2);
    // 004
    String part1 = parts[0];
    return parts[1];
  }
}
