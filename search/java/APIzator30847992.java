package com.stackoverflow.api;

import com.google.appengine.repackaged.com.google.type.proto1api.Date;
import java.time.LocalDate;
import java.time.ZoneId;

/**
 * Java: Get month Integer from Date
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/30847992">https://stackoverflow.com/a/30847992</a>
 */
public class APIzator30847992 {

  public static int java() throws RuntimeException {
    Date date = new Date();
    LocalDate localDate = date
      .toInstant()
      .atZone(ZoneId.systemDefault())
      .toLocalDate();
    return localDate.getMonthValue();
  }
}
