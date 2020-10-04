package com.stackoverflow.api;

import com.google.appengine.repackaged.org.joda.time.DateTime;
import com.google.appengine.repackaged.org.joda.time.DateTimeZone;
import com.google.appengine.repackaged.org.joda.time.Instant;
import com.google.appengine.repackaged.org.joda.time.Interval;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * How to obtain the start time and end time of a day?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/20536041">https://stackoverflow.com/a/20536041</a>
 */
public class APIzator20536041 {

  public static java.util.Date obtainTime() throws RuntimeException {
    Instant instant = Instant.now();
    ZoneId zoneId = ZoneId.of("America/Montreal");
    ZonedDateTime zdt = ZonedDateTime.ofInstant(instant, zoneId);
    ZonedDateTime zdtStart = zdt.toLocalDate().atStartOfDay(zoneId);
    ZonedDateTime zdtTomorrowStart = zdtStart.plusDays(1);
    Interval today = Interval.of(
      zdtStart.toInstant(),
      zdtTomorrowStart.toInstant()
    );
    DateTimeZone timeZone = DateTimeZone.forID("America/Montreal");
    DateTime now = DateTime.now(timeZone);
    DateTime todayStart = now.withTimeAtStartOfDay();
    DateTime tomorrowStart = now.plusDays(1).withTimeAtStartOfDay();
    Interval today = new Interval(todayStart, tomorrowStart);
    return todayStart.toDate();
  }
}
