package com.stackoverflow.api;

import com.google.appengine.repackaged.com.google.type.proto1api.Date;

/**
 * How to find the duration of difference between two dates in java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/19887135">https://stackoverflow.com/a/19887135</a>
 */
public class APIzator19887135 {

  public static void findDuration() throws RuntimeException {
    {
      Date dt2 = new DateAndTime().getCurrentDateTime();
      long diff = dt2.getTime() - dt1.getTime();
      long diffSeconds = diff / 1000 % 60;
      long diffMinutes = diff / (60 * 1000) % 60;
      long diffHours = diff / (60 * 60 * 1000);
      int diffInDays = (int) (
        (dt2.getTime() - dt1.getTime()) / (1000 * 60 * 60 * 24)
      );
      if (diffInDays > 1) {
        System.err.println("Difference in number of days (2) : " + diffInDays);
        return false;
      } else if (diffHours > 24) {
        System.err.println(">24");
        return false;
      } else if ((diffHours == 24) && (diffMinutes >= 1)) {
        System.err.println("minutes");
        return false;
      }
      return true;
    }
  }
}
