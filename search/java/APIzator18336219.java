package com.stackoverflow.api;

import android.view.View;
import android.widget.CheckBox;

/**
 * How to check if android checkbox is checked within its onClick method (declared in XML)?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/18336219">https://stackoverflow.com/a/18336219</a>
 */
public class APIzator18336219 {

  public static void itemClicked(View v) {
    // code to check if this checkbox is checked!
    CheckBox checkBox = (CheckBox) v;
    if (checkBox.isChecked()) {}
  }
}
