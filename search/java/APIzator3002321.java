package com.stackoverflow.api;

import android.widget.Button;
import android.widget.LinearLayout;

/**
 * Set margins in a LinearLayout programmatically
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/3002321">https://stackoverflow.com/a/3002321</a>
 */
public class APIzator3002321 {

  public static void setMargin() throws RuntimeException {
    LinearLayout ll = new LinearLayout(this);
    ll.setOrientation(LinearLayout.VERTICAL);
    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
      LinearLayout.LayoutParams.MATCH_PARENT,
      LinearLayout.LayoutParams.WRAP_CONTENT
    );
    layoutParams.setMargins(30, 20, 30, 0);
    Button okButton = new Button(this);
    okButton.setText("some text");
    ll.addView(okButton, layoutParams);
  }
}
