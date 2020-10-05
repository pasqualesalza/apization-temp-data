package com.stackoverflow.api;

import com.google.gwt.json.client.JSONArray;
import com.google.gwt.json.client.JSONObject;

/**
 * How to parse JSON Array (Not Json Object) in Android
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/18977220">https://stackoverflow.com/a/18977220</a>
 */
public class APIzator18977220 {

  public static void parseArray() throws RuntimeException {
    JSONArray jsonarray = new JSONArray(jsonStr);
    for (int i = 0; i < jsonarray.length(); i++) {
      JSONObject jsonobject = jsonarray.getJSONObject(i);
      String name = jsonobject.getString("name");
      String url = jsonobject.getString("url");
    }
  }
}
