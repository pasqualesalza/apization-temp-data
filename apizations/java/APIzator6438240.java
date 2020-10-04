package com.stackoverflow.api;

import android.widget.ScrollView;

/**
 * Can I scroll a ScrollView programmatically in Android?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/6438240">https://stackoverflow.com/a/6438240</a>
 */
public class APIzator6438240 {

  public static void scrollScrollview() throws RuntimeException {
    ScrollView sv = (ScrollView) findViewById(R.id.scrl);
    sv.scrollTo(0, sv.getBottom());
  }
}
