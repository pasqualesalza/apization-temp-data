package com.stackoverflow.api;

import java.util.Calendar;
import java.util.Date;

/**
 * How to get today's Date?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/5046816">https://stackoverflow.com/a/5046816</a>
 */
public class APIzator5046816 {

  public static void getDate() throws RuntimeException {
    Date today = new Date();
    // same for minutes and seconds
    today.setHours(0);
    Calendar today = Calendar.getInstance();
    // same for minutes and seconds
    today.set(Calendar.HOUR_OF_DAY, 0);
  }
}
