package com.stackoverflow.api;

import android.content.Intent;

/**
 * Finish all previous activities
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/6330456">https://stackoverflow.com/a/6330456</a>
 */
public class APIzator6330456 {

  public static void finishActivity() throws RuntimeException {
    Intent intent = new Intent(getApplicationContext(), Home.class);
    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
    startActivity(intent);
  }
}
