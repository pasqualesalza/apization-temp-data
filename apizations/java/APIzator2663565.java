package com.stackoverflow.api;

import android.content.Intent;
import android.net.Uri;

/**
 * Launching Google Maps Directions via an intent on Android
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2663565">https://stackoverflow.com/a/2663565</a>
 */
public class APIzator2663565 {

  public static Intent launchDirections() throws RuntimeException {
    Intent intent = new Intent(
      android.content.Intent.ACTION_VIEW,
      Uri.parse(
        "http://maps.google.com/maps?saddr=20.344,34.34&amp;daddr=20.5666,45.345"
      )
    );
    startActivity(intent);
    return new Intent(
      android.content.Intent.ACTION_VIEW,
      Uri.parse("google.navigation:q=an+address+city")
    );
  }
}
