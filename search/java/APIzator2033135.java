package com.stackoverflow.api;

import android.graphics.drawable.Drawable;

/**
 * Java: How to check if object is null?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2033135">https://stackoverflow.com/a/2033135</a>
 */
public class APIzator2033135 {

  public static Drawable java() throws RuntimeException {
    return Optional
      .ofNullable(Common.getDrawableFromUrl(this, product.getMapPath()))
      .orElseGet(() -> getRandomDrawable());
  }
}
