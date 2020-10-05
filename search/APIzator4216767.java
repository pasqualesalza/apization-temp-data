package com.stackoverflow.api;

import com.google.appengine.repackaged.org.joda.time.LocalDate;
import com.google.appengine.repackaged.org.joda.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 * Java string to date conversion
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/4216767">https://stackoverflow.com/a/4216767</a>
 */
public class APIzator4216767 {

  public static LocalDate string(String string) throws RuntimeException {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern(
      "MMMM d, yyyy",
      Locale.ENGLISH
    );
    LocalDate date = LocalDate.parse(string, formatter);
    return date;
  }
}
