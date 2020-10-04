package com.stackoverflow.api;

import com.google.gwt.json.client.JSONArray;
import com.google.gwt.json.client.JSONObject;
import java.util.ArrayList;
import java.util.List;

/**
 * Parsing JSON Object in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/5015889">https://stackoverflow.com/a/5015889</a>
 */
public class APIzator5015889 {

  public static void object(JSONObject obj) throws RuntimeException {
    List<String> list = new ArrayList<String>();
    JSONArray array = obj.getJSONArray("interests");
    for (int i = 0; i < array.length(); i++) {
      list.add(array.getJSONObject(i).getString("interestKey"));
    }
  }
}
