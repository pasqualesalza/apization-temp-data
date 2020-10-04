package com.stackoverflow.api;

import com.google.appengine.repackaged.com.google.common.base.CaseFormat;

/**
 * What is the simplest way to convert a Java string from all caps (words separated by underscores) to CamelCase (no word separators)?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/16667311">https://stackoverflow.com/a/16667311</a>
 */
public class APIzator16667311 {

  public static void be() throws RuntimeException {
    CaseFormat.UPPER_UNDERSCORE.to(
      CaseFormat.UPPER_CAMEL,
      "THIS_IS_AN_EXAMPLE_STRING"
    );
  }
}
