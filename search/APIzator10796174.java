package com.stackoverflow.api;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Pattern;

/**
 * Splitting a Java String by the pipe symbol using split("|")
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/10796174">https://stackoverflow.com/a/10796174</a>
 */
public class APIzator10796174 {

  public static void splittingString() throws RuntimeException {
    test.split("\\|");
    test.split(Pattern.quote("|"));
  }
}
