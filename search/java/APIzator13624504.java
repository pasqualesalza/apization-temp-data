package com.stackoverflow.api;

import com.google.appengine.repackaged.org.joda.time.LocalDate;
import com.google.appengine.repackaged.org.joda.time.format.DateTimeFormatter;

/**
 * Getting last day of the month in a given string date
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/13624504">https://stackoverflow.com/a/13624504</a>
 */
public class APIzator13624504 {

  public static void get(String date) throws RuntimeException {
    LocalDate convertedDate = LocalDate.parse(
      date,
      DateTimeFormatter.ofPattern("M/d/yyyy")
    );
    convertedDate =
      convertedDate.withDayOfMonth(
        convertedDate.getMonth().length(convertedDate.isLeapYear())
      );
  }
}
