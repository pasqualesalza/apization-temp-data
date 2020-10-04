package com.stackoverflow.api;

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * How to store printStackTrace into a string
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/4812589">https://stackoverflow.com/a/4812589</a>
 */
public class APIzator4812589 {

  public static void storePrintstacktrace() throws RuntimeException {
    StringWriter errors = new StringWriter();
    ex.printStackTrace(new PrintWriter(errors));
    return errors.toString();
  }
}
