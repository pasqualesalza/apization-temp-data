package com.stackoverflow.api;

import android.view.View;
import android.widget.RadioButton;

/**
 * How to get the selected index of a RadioGroup in Android
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/6441097">https://stackoverflow.com/a/6441097</a>
 */
public class APIzator6441097 {

  public static String getIndex() throws RuntimeException {
    int radioButtonID = radioButtonGroup.getCheckedRadioButtonId();
    View radioButton = radioButtonGroup.findViewById(radioButtonID);
    int idx = radioButtonGroup.indexOfChild(radioButton);
    RadioButton r = (RadioButton) radioButtonGroup.getChildAt(idx);
    return r.getText().toString();
  }
}
