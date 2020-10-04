package com.stackoverflow.api;

import com.google.gwt.json.client.JSONArray;
import java.util.ArrayList;
import java.util.List;

/**
 * Convert JSONArray to String Array
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/15871355">https://stackoverflow.com/a/15871355</a>
 */
public class APIzator15871355 {

  public static void jsonarray() throws RuntimeException {
    JSONArray arr = new JSONArray(yourJSONresponse);
    List<String> list = new ArrayList<String>();
    for (int i = 0; i < arr.length(); i++) {
      list.add(arr.getJSONObject(i).getString("name"));
    }
  }
}
