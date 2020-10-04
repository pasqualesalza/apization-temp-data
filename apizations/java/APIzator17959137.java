package com.stackoverflow.api;

import com.google.appengine.repackaged.org.joda.time.DateTime;
import com.google.appengine.repackaged.org.joda.time.DateTimeZone;

/**
 * Number of days between two dates in Joda-Time
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/17959137">https://stackoverflow.com/a/17959137</a>
 */
public class APIzator17959137 {

  public static void number() throws RuntimeException {
    // 5am on the 20th to 1pm on the 21st, October 2013, Brazil
    DateTimeZone BRAZIL = DateTimeZone.forID("America/Sao_Paulo");
    DateTime start = new DateTime(2013, 10, 20, 5, 0, 0, BRAZIL);
    DateTime end = new DateTime(2013, 10, 21, 13, 0, 0, BRAZIL);
    System.out.println(
      daysBetween(start.withTimeAtStartOfDay(), end.withTimeAtStartOfDay())
        .getDays()
    );
    // prints 0
    System.out.println(
      daysBetween(start.toLocalDate(), end.toLocalDate()).getDays()
    );
    // prints 1
  }
}
