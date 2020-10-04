package com.stackoverflow.api;

import android.text.Editable;
import android.text.TextWatcher;

/**
 * android on Text Change Listener
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/20824665">https://stackoverflow.com/a/20824665</a>
 */
public class APIzator20824665 {

  public static void android() throws RuntimeException {
    field1.addTextChangedListener(
      new TextWatcher() {

        @Override
        public void afterTextChanged(Editable s) {}

        @Override
        public void beforeTextChanged(
          CharSequence s,
          int start,
          int count,
          int after
        ) {}

        @Override
        public void onTextChanged(
          CharSequence s,
          int start,
          int before,
          int count
        ) {
          if (s.length() != 0) field2.setText("");
        }
      }
    );
    field2.addTextChangedListener(
      new TextWatcher() {

        @Override
        public void afterTextChanged(Editable s) {}

        @Override
        public void beforeTextChanged(
          CharSequence s,
          int start,
          int count,
          int after
        ) {}

        @Override
        public void onTextChanged(
          CharSequence s,
          int start,
          int before,
          int count
        ) {
          if (s.length() != 0) field1.setText("");
        }
      }
    );
  }
}
