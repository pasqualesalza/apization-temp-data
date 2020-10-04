package com.stackoverflow.api;

import java.util.Calendar;
import java.util.TimeZone;

/**
 * How to change TIMEZONE for a java.util.Calendar/Date
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/13472173">https://stackoverflow.com/a/13472173</a>
 */
public class APIzator13472173 {

  public static void changeTimezone() throws RuntimeException {
    Calendar cSchedStartCal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    long gmtTime = cSchedStartCal.getTime().getTime();
    long timezoneAlteredTime =
      gmtTime + TimeZone.getTimeZone("Asia/Calcutta").getRawOffset();
    Calendar cSchedStartCal1 = Calendar.getInstance(
      TimeZone.getTimeZone("Asia/Calcutta")
    );
    cSchedStartCal1.setTimeInMillis(timezoneAlteredTime);
    // instantiates a calendar using the current time in the specified timezone
    Calendar cSchedStartCal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    // change the timezone
    cSchedStartCal.setTimeZone(TimeZone.getTimeZone("Asia/Calcutta"));
    // get the current hour of the day in the new timezone
    cSchedStartCal.get(Calendar.HOUR_OF_DAY);
  }
}
