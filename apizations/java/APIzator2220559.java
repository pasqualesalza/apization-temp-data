package com.stackoverflow.api;

import jline.internal.Log;

/**
 * Why doesn't "System.out.println" work in Android?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2220559">https://stackoverflow.com/a/2220559</a>
 */
public class APIzator2220559 {

  public static void work() throws RuntimeException {
    Log.d("MyApp", "I am here");
    Log.d(MyActivity.LOG_TAG, "Application started");
  }
}
