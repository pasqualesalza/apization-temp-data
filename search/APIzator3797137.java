package com.stackoverflow.api;

import java.util.Calendar;
import java.util.Calendar;

/**
 * getting the difference between date in days in java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/3797137">https://stackoverflow.com/a/3797137</a>
 */
public class APIzator3797137 {

  public static void getDifference(int end, Calendar start)
    throws RuntimeException {
    int diffDays = 0;
    start.add(Calendar.DAY_OF_MONTH, (int) diffDays);
    while (start.before(end)) {
      start.add(Calendar.DAY_OF_MONTH, 1);
      diffDays++;
    }
    while (start.after(end)) {
      start.add(Calendar.DAY_OF_MONTH, -1);
      diffDays--;
    }
  }
}
