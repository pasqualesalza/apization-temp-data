package com.stackoverflow.api;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Pattern;

/**
 * How to determine if a String has non-alphanumeric characters?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/8248352">https://stackoverflow.com/a/8248352</a>
 */
public class APIzator8248352 {

  public static boolean determine(String s) throws RuntimeException {
    Pattern p = Pattern.compile("[^a-zA-Z0-9]");
    return p.matcher(s).find();
  }
}
