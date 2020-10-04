package com.stackoverflow.api;

import android.view.View;

/**
 * How to set background color of an Activity to white programmatically?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/4761825">https://stackoverflow.com/a/4761825</a>
 */
public class APIzator4761825 {

  public static void setColor() throws RuntimeException {
    setContentView(R.layout.main);
    // Now get a handle to any View contained
    // within the main layout you are using
    View someView = findViewById(R.id.randomViewInMainLayout);
    // Find the root view
    View root = someView.getRootView();
    // Set the color
    root.setBackgroundColor(getResources().getColor(android.R.color.red));
  }
}
