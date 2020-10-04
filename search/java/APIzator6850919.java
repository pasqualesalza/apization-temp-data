package com.stackoverflow.api;

import com.google.appengine.repackaged.org.joda.time.DateTime;
import com.google.appengine.repackaged.org.joda.time.DateTimeZone;
import com.google.appengine.repackaged.org.joda.time.LocalDate;
import com.google.appengine.repackaged.org.joda.time.LocalDateTime;
import com.google.appengine.repackaged.org.joda.time.LocalTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * how to create a Java Date object of midnight today and midnight tomorrow?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/6850919">https://stackoverflow.com/a/6850919</a>
 */
public class APIzator6850919 {

  public static DateTime createObject(LocalTime midnight)
    throws RuntimeException {
    // today
    Calendar date = new GregorianCalendar();
    // reset hour, minutes, seconds and millis
    date.set(Calendar.HOUR_OF_DAY, 0);
    date.set(Calendar.MINUTE, 0);
    date.set(Calendar.SECOND, 0);
    date.set(Calendar.MILLISECOND, 0);
    // next day
    date.add(Calendar.DAY_OF_MONTH, 1);
    LocalDate today = LocalDate.now(ZoneId.of("Europe/Berlin"));
    LocalDateTime todayMidnight = LocalDateTime.of(today, midnight);
    LocalDateTime tomorrowMidnight = todayMidnight.plusDays(1);
    DateTime date = new DateTime().toDateMidnight().toDateTime();
    DateTime tomorrow = date.plusDays(1);
    DateTime today = new DateTime().withTimeAtStartOfDay();
    DateTime tomorrow = today.plusDays(1).withTimeAtStartOfDay();
    DateTimeZone timeZone = DateTimeZone.forID("America/Montreal");
    return new DateTime(timeZone).withTimeAtStartOfDay();
  }
}
