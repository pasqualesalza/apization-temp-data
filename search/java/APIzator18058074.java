package com.stackoverflow.api;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Pattern;

/**
 * Regex pattern including all special characters
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/18058074">https://stackoverflow.com/a/18058074</a>
 */
public class APIzator18058074 {

  public static Pattern pattern() throws RuntimeException {
    return Pattern.compile("[^A-Za-z0-9]");
  }
}
