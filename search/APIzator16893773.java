package com.stackoverflow.api;

import android.graphics.drawable.Drawable;

/**
 * How to Customize a Progress Bar In Android
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/16893773">https://stackoverflow.com/a/16893773</a>
 */
public class APIzator16893773 {

  public static void customizeBar() throws RuntimeException {
    // Get the Drawable custom_progressbar
    Drawable draw = res.getDrawable(R.drawable.custom_progressbar);
    // set the drawable as progress drawable
    progressBar.setProgressDrawable(draw);
  }
}
