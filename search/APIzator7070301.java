package com.stackoverflow.api;

import com.gargoylesoftware.htmlunit.javascript.host.intl.NumberFormat;
import java.util.Locale;

/**
 * Converting Integer to String with comma for thousands
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/7070301">https://stackoverflow.com/a/7070301</a>
 */
public class APIzator7070301 {

  public static String convertInteger() throws RuntimeException {
    return NumberFormat.getNumberInstance(Locale.US).format(35634646);
  }
}
