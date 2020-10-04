package com.stackoverflow.api;

import com.google.appengine.repackaged.com.google.type.proto1api.Date;
import java.text.SimpleDateFormat;

/**
 * Extract time from date String
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/3505010">https://stackoverflow.com/a/3505010</a>
 */
public class APIzator3505010 {

  public static String extractTime(String originalString)
    throws RuntimeException {
    Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
    .parse(originalString);
    return new SimpleDateFormat("H:mm").format(date);
  }
}
