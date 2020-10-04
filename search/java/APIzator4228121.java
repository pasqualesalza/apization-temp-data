package com.stackoverflow.api;

import android.widget.ArrayAdapter;

/**
 * How to set selected item of Spinner by value, not by position?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/4228121">https://stackoverflow.com/a/4228121</a>
 */
public class APIzator4228121 {

  public static void setItem(String compareValue) throws RuntimeException {
    ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
      this,
      R.array.select_state,
      android.R.layout.simple_spinner_item
    );
    adapter.setDropDownViewResource(
      android.R.layout.simple_spinner_dropdown_item
    );
    mSpinner.setAdapter(adapter);
    if (compareValue != null) {
      int spinnerPosition = adapter.getPosition(compareValue);
      mSpinner.setSelection(spinnerPosition);
    }
  }
}
