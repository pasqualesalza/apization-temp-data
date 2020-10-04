package com.stackoverflow.api;

import com.google.appengine.repackaged.com.google.type.proto1api.Date;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * Convert java.util.Date to java.time.LocalDate
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/21242111">https://stackoverflow.com/a/21242111</a>
 */
public class APIzator21242111 {

  public static LocalDate convert() throws RuntimeException {
    Date input = new Date();
    LocalDate date = input
      .toInstant()
      .atZone(ZoneId.systemDefault())
      .toLocalDate();
    Date input = new Date();
    Instant instant = input.toInstant();
    Date input = new Date();
    Instant instant = input.toInstant();
    ZonedDateTime zdt = instant.atZone(ZoneId.systemDefault());
    Date input = new Date();
    Instant instant = input.toInstant();
    ZonedDateTime zdt = instant.atZone(ZoneId.systemDefault());
    LocalDate date = zdt.toLocalDate();
    Date input = new Date();
    return LocalDate.ofInstant(input.toInstant(), ZoneId.systemDefault());
  }
}
