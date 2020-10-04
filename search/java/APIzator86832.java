package com.stackoverflow.api;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Pattern;

/**
 * How to check if a String contains another String in a case insensitive manner in Java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/86832">https://stackoverflow.com/a/86832</a>
 */
public class APIzator86832 {

  public static void check() throws RuntimeException {
    Pattern
      .compile(Pattern.quote(s2), Pattern.CASE_INSENSITIVE)
      .matcher(s1)
      .find();
  }
}
