package com.stackoverflow.api;

import com.google.appengine.repackaged.com.google.type.proto1api.Date;
import java.time.ZoneId;

/**
 * Convert java.time.LocalDate into java.util.Date type
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/22929420">https://stackoverflow.com/a/22929420</a>
 */
public class APIzator22929420 {

  public static Date convert() throws RuntimeException {
    return Date.from(
      localDate.atStartOfDay(ZoneId.systemDefault()).toInstant()
    );
  }
}
