package com.stackoverflow.api;

import java.util.Calendar;
import java.util.Calendar;
import java.util.Calendar;

/**
 * How to compare dates in Java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2592513">https://stackoverflow.com/a/2592513</a>
 */
public class APIzator2592513 {

  public static void compareDate(Calendar todayDate) throws RuntimeException {
    Calendar futureDate = null;
    Calendar historyDate = null;
    if (todayDate.after(historyDate) && todayDate.before(futureDate)) {
      // In between
    }
    if (!historyDate.after(todayDate) && !futureDate.before(todayDate)) {
      /* historyDate <= todayDate <= futureDate */
    }
  }
}
