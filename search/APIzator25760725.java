package com.stackoverflow.api;

import com.google.appengine.repackaged.org.joda.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 * Java 8: Calculate difference between two LocalDateTime
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/25760725">https://stackoverflow.com/a/25760725</a>
 */
public class APIzator25760725 {

  public static void java() throws RuntimeException {
    LocalDateTime fromDateTime = LocalDateTime.of(1984, 12, 16, 7, 45, 55);
    LocalDateTime toDateTime = LocalDateTime.of(2014, 9, 10, 6, 40, 45);
    LocalDateTime tempDateTime = LocalDateTime.from(fromDateTime);
    long years = tempDateTime.until(toDateTime, ChronoUnit.YEARS);
    tempDateTime = tempDateTime.plusYears(years);
    long months = tempDateTime.until(toDateTime, ChronoUnit.MONTHS);
    tempDateTime = tempDateTime.plusMonths(months);
    long days = tempDateTime.until(toDateTime, ChronoUnit.DAYS);
    tempDateTime = tempDateTime.plusDays(days);
    long hours = tempDateTime.until(toDateTime, ChronoUnit.HOURS);
    tempDateTime = tempDateTime.plusHours(hours);
    long minutes = tempDateTime.until(toDateTime, ChronoUnit.MINUTES);
    tempDateTime = tempDateTime.plusMinutes(minutes);
    long seconds = tempDateTime.until(toDateTime, ChronoUnit.SECONDS);
    System.out.println(
      years +
      " years " +
      months +
      " months " +
      days +
      " days " +
      hours +
      " hours " +
      minutes +
      " minutes " +
      seconds +
      " seconds."
    );
    // prints: 29 years 8 months 24 days 22 hours 54 minutes 50 seconds.
  }
}
