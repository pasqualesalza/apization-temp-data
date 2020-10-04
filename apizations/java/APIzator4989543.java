package com.stackoverflow.api;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;

/**
 * converting Java bitmap to byte array
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/4989543">https://stackoverflow.com/a/4989543</a>
 */
public class APIzator4989543 {

  public static void convert() throws RuntimeException {
    Bitmap bmp = intent.getExtras().get("data");
    ByteArrayOutputStream stream = new ByteArrayOutputStream();
    bmp.compress(Bitmap.CompressFormat.PNG, 100, stream);
    byte[] byteArray = stream.toByteArray();
    bmp.recycle();
  }
}
