package com.stackoverflow.api;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;

/**
 * Android load from URL to Bitmap
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/8993175">https://stackoverflow.com/a/8993175</a>
 */
public class APIzator8993175 {

  public static Bitmap getBitmapFromURL(String src) {
    try {
      URL url = new URL(src);
      HttpURLConnection connection = (HttpURLConnection) url.openConnection();
      connection.setDoInput(true);
      connection.connect();
      InputStream input = connection.getInputStream();
      Bitmap myBitmap = BitmapFactory.decodeStream(input);
      return myBitmap;
    } catch (IOException e) {
      // Log exception
      return null;
    }
  }
}
