package com.stackoverflow.api;

import com.google.appengine.repackaged.com.google.api.client.util.DateTime;
import com.google.appengine.repackaged.org.joda.time.format.DateTimeFormat;
import com.google.appengine.repackaged.org.joda.time.format.DateTimeFormatter;

/**
 * Converting a date string to a DateTime object using Joda Time library
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/6252782">https://stackoverflow.com/a/6252782</a>
 */
public class APIzator6252782 {

  public static DateTime convertDate() throws RuntimeException {
    DateTimeFormatter formatter = DateTimeFormat.forPattern(
      "dd/MM/yyyy HH:mm:ss"
    );
    return formatter.parseDateTime(string);
  }
}
