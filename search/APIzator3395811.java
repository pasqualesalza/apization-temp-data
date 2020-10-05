package com.stackoverflow.api;

import com.google.gwt.json.client.JSONArray;
import java.util.ArrayList;

/**
 * Convert Json Array to normal Java Array
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/3395811">https://stackoverflow.com/a/3395811</a>
 */
public class APIzator3395811 {

  public static void array() throws RuntimeException {
    ArrayList<String> list = new ArrayList<String>();
    JSONArray jsonArray = (JSONArray) jsonObject;
    if (jsonArray != null) {
      int len = jsonArray.length();
      for (int i = 0; i < len; i++) {
        list.add(jsonArray.get(i).toString());
      }
    }
  }
}
