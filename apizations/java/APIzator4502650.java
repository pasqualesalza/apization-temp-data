package com.stackoverflow.api;

import android.graphics.drawable.Drawable;

/**
 * How to programmatically set drawableLeft on Android button?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/4502650">https://stackoverflow.com/a/4502650</a>
 */
public class APIzator4502650 {

  public static void set() throws RuntimeException {
    Drawable img = getContext().getResources().getDrawable(R.drawable.smiley);
    img.setBounds(0, 0, 60, 60);
    txtVw.setCompoundDrawables(img, null, null, null);
    Drawable img = getContext().getResources().getDrawable(R.drawable.smiley);
    txtVw.setCompoundDrawablesWithIntrinsicBounds(img, null, null, null);
    txtVw.setCompoundDrawablesWithIntrinsicBounds(R.drawable.smiley, 0, 0, 0);
  }
}
