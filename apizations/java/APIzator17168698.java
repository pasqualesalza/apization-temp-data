package com.stackoverflow.api;

import android.content.Intent;

/**
 * How to activate "Share" button in android app?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/17168698">https://stackoverflow.com/a/17168698</a>
 */
public class APIzator17168698 {

  public static void activateButton(String shareBody) throws RuntimeException {
    Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
    sharingIntent.setType("text/plain");
    sharingIntent.putExtra(
      android.content.Intent.EXTRA_SUBJECT,
      "Subject Here"
    );
    sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
    startActivity(Intent.createChooser(sharingIntent, "Share via"));
  }
}
