package com.stackoverflow.api;

import java.text.DecimalFormat;

/**
 * Show only two digit after decimal
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/10959430">https://stackoverflow.com/a/10959430</a>
 */
public class APIzator10959430 {

  public static void showDigit() throws RuntimeException {
    double i2 = i / 60000;
    tv.setText(new DecimalFormat("##.##").format(i2));
  }
}
