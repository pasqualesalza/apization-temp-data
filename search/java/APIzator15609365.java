package com.stackoverflow.api;

import com.google.gwt.json.client.JSONArray;
import com.google.gwt.json.client.JSONObject;

/**
 * Convert string to JSON array
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/15609365">https://stackoverflow.com/a/15609365</a>
 */
public class APIzator15609365 {

  public static void convertString() throws RuntimeException {
    JSONArray jsonArray = new JSONArray(readlocationFeed);
    JSONObject jsnobject = new JSONObject(readlocationFeed);
    JSONArray jsonArray = jsnobject.getJSONArray("locations");
    for (int i = 0; i < jsonArray.length(); i++) {
      JSONObject explrObject = jsonArray.getJSONObject(i);
    }
  }
}
