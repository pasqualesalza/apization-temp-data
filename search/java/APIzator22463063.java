package com.stackoverflow.api;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

/**
 * How to parse/format dates with LocalDateTime? (Java 8)
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/22463063">https://stackoverflow.com/a/22463063</a>
 */
public class APIzator22463063 {

  public static String date(String str) throws RuntimeException {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern(
      "yyyy-MM-dd HH:mm"
    );
    LocalDateTime dateTime = LocalDateTime.parse(str, formatter);
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern(
      "yyyy-MM-dd HH:mm"
    );
    LocalDateTime dateTime = LocalDateTime.of(1986, Month.APRIL, 8, 12, 30);
    return dateTime.format(formatter);
  }
}
