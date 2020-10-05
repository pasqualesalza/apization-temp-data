package com.stackoverflow.api;

import com.google.appengine.repackaged.org.joda.time.LocalDateTime;
import com.google.appengine.repackaged.org.joda.time.format.DateTimeFormatter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * java.util.Date format conversion yyyy-mm-dd to mm-dd-yyyy
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/18480709">https://stackoverflow.com/a/18480709</a>
 */
public class APIzator18480709 {

  public static Date execute() throws RuntimeException {
    LocalDateTime ldt = LocalDateTime.now();
    System.out.println(
      DateTimeFormatter.ofPattern("MM-dd-yyyy", Locale.ENGLISH).format(ldt)
    );
    System.out.println(
      DateTimeFormatter.ofPattern("yyyy-MM-dd", Locale.ENGLISH).format(ldt)
    );
    System.out.println(ldt);
    Date myDate = new Date();
    System.out.println(myDate);
    System.out.println(new SimpleDateFormat("MM-dd-yyyy").format(myDate));
    System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(myDate));
    return myDate;
  }
}
