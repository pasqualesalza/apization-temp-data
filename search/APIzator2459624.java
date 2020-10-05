package com.stackoverflow.api;

import android.content.Intent;

/**
 * How can I pass a Bitmap object from one activity to another
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2459624">https://stackoverflow.com/a/2459624</a>
 */
public class APIzator2459624 {

  public static Bitmap passObject() throws RuntimeException {
    Intent intent = new Intent(this, NewActivity.class);
    intent.putExtra("BitmapImage", bitmap);
    Intent intent = getIntent();
    return (Bitmap) intent.getParcelableExtra("BitmapImage");
  }
}
