package com.stackoverflow.api;

import com.google.gwt.json.client.JSONObject;

/**
 * Accessing members of items in a JSONArray with Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1568815">https://stackoverflow.com/a/1568815</a>
 */
public class APIzator1568815 {

  public static void accessMember() throws RuntimeException {
    for (int i = 0; i < recs.length(); ++i) {
      JSONObject rec = recs.getJSONObject(i);
      int id = rec.getInt("id");
      String loc = rec.getString("loc");
      // ...
    }
  }
}
