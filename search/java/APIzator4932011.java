package com.stackoverflow.api;

import java.util.Calendar;
import java.util.Calendar;

/**
 * Why Java Calendar set(int year, int month, int date) not returning correct date?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/4932011">https://stackoverflow.com/a/4932011</a>
 */
public class APIzator4932011 {

  public static void returnDate(Calendar c1) throws RuntimeException {
    c1.set(2000, Calendar.JANUARY, 30);
  }
}
