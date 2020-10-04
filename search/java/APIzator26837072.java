package com.stackoverflow.api;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/**
 * How to change color of the back arrow in the new material theme?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/26837072">https://stackoverflow.com/a/26837072</a>
 */
public class APIzator26837072 {

  public static void changeColor() throws RuntimeException {
    final Drawable upArrow = getResources()
      .getDrawable(R.drawable.abc_ic_ab_back_mtrl_am_alpha);
    upArrow.setColorFilter(
      getResources().getColor(R.color.grey),
      PorterDuff.Mode.SRC_ATOP
    );
    getSupportActionBar().setHomeAsUpIndicator(upArrow);
    toolbar
      .getNavigationIcon()
      .setColorFilter(
        getResources().getColor(R.color.blue_gray_15),
        PorterDuff.Mode.SRC_ATOP
      );
  }
}
