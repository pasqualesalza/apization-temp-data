package com.stackoverflow.api;

import com.google.appengine.repackaged.org.joda.time.LocalDate;
import com.google.appengine.repackaged.org.joda.time.format.DateTimeFormatter;

/**
 * String to LocalDate
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/8746203">https://stackoverflow.com/a/8746203</a>
 */
public class APIzator8746203 {

  public static LocalDate string() throws RuntimeException {
    final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MMM-dd");
    return dtf.parseLocalDate(yourinput);
  }
}
