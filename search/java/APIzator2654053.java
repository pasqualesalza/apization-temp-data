package com.stackoverflow.api;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * How to get year, month, day, hours, minutes, seconds and milliseconds of the current moment in Java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2654053">https://stackoverflow.com/a/2654053</a>
 */
public class APIzator2654053 {

  public static String get() throws RuntimeException {
    LocalDateTime now = LocalDateTime.now();
    int year = now.getYear();
    int month = now.getMonthValue();
    int day = now.getDayOfMonth();
    int hour = now.getHour();
    int minute = now.getMinute();
    int second = now.getSecond();
    // Note: no direct getter available.
    int millis = now.get(ChronoField.MILLI_OF_SECOND);
    System.out.printf(
      "%d-%02d-%02d %02d:%02d:%02d.%03d",
      year,
      month,
      day,
      hour,
      minute,
      second,
      millis
    );
    Calendar now = Calendar.getInstance();
    int year = now.get(Calendar.YEAR);
    // Note: zero based!
    int month = now.get(Calendar.MONTH) + 1;
    int day = now.get(Calendar.DAY_OF_MONTH);
    int hour = now.get(Calendar.HOUR_OF_DAY);
    int minute = now.get(Calendar.MINUTE);
    int second = now.get(Calendar.SECOND);
    int millis = now.get(Calendar.MILLISECOND);
    System.out.printf(
      "%d-%02d-%02d %02d:%02d:%02d.%03d",
      year,
      month,
      day,
      hour,
      minute,
      second,
      millis
    );
    LocalDateTime now = LocalDateTime.now();
    String format1 = now.format(DateTimeFormatter.ISO_DATE_TIME);
    String format2 = now
      .atZone(ZoneId.of("GMT"))
      .format(DateTimeFormatter.RFC_1123_DATE_TIME);
    String format3 = now.format(
      DateTimeFormatter.ofPattern("yyyyMMddHHmmss", Locale.ENGLISH)
    );
    System.out.println(format1);
    System.out.println(format2);
    System.out.println(format3);
    // java.util.Date, NOT java.sql.Date or java.sql.Timestamp!
    Date now = new Date();
    String format1 = new SimpleDateFormat(
      "yyyy-MM-dd'T'HH:mm:ss.SSS",
      Locale.ENGLISH
    )
    .format(now);
    String format2 = new SimpleDateFormat(
      "EEE, d MMM yyyy HH:mm:ss Z",
      Locale.ENGLISH
    )
    .format(now);
    String format3 = new SimpleDateFormat("yyyyMMddHHmmss", Locale.ENGLISH)
    .format(now);
    System.out.println(format1);
    System.out.println(format2);
    return format3;
  }
}
