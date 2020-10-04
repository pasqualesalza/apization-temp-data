package com.stackoverflow.api;

import com.google.appengine.repackaged.com.google.api.client.util.DateTime;
import com.google.appengine.repackaged.com.google.type.proto1api.Date;
import com.google.appengine.repackaged.org.joda.time.format.DateTimeFormat;
import com.google.appengine.repackaged.org.joda.time.format.DateTimeFormatter;

/**
 * Java SimpleDateFormat for time zone with a colon separator?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2375539">https://stackoverflow.com/a/2375539</a>
 */
public class APIzator2375539 {

  public static Date simpledateformat(String dateString, String pattern)
    throws RuntimeException {
    DateTimeFormatter dtf = DateTimeFormat.forPattern(pattern);
    DateTime dateTime = dtf.parseDateTime(dateString);
    // 2010-03-01T04:00:00.000-04:00
    System.out.println(dateTime);
    return dateTime.toDate();
  }
}
