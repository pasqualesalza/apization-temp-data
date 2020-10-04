package com.stackoverflow.api;

import com.google.gwt.json.client.JSONArray;
import com.google.gwt.user.client.rpc.core.java.util.Arrays;

/**
 * Convert normal Java Array or ArrayList to Json Array in android
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/5166890">https://stackoverflow.com/a/5166890</a>
 */
public class APIzator5166890 {

  public static JSONArray convertArray(String[] mStringArray)
    throws RuntimeException {
    return new JSONArray(Arrays.asList(mStringArray));
  }
}
