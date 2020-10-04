package com.stackoverflow.api;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Pattern;

/**
 * How to escape text for regular expression in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/60161">https://stackoverflow.com/a/60161</a>
 */
public class APIzator60161 {

  public static void escapeText() throws RuntimeException {
    Pattern.quote("$5");
  }
}
