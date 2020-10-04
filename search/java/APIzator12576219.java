package com.stackoverflow.api;

import com.google.appengine.repackaged.org.joda.time.LocalDateTime;
import com.google.appengine.repackaged.org.joda.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 * Calendar date to yyyy-MM-dd format in java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/12576219">https://stackoverflow.com/a/12576219</a>
 */
public class APIzator12576219 {

  public static void date() throws RuntimeException {
    LocalDateTime ldt = LocalDateTime.now().plusDays(1);
    DateTimeFormatter formmat1 = DateTimeFormatter.ofPattern(
      "yyyy-MM-dd",
      Locale.ENGLISH
    );
    System.out.println(ldt);
    // Output "2018-05-12T17:21:53.658"
    String formatter = formmat1.format(ldt);
    System.out.println(formatter);
    // 2018-05-12
  }
}
