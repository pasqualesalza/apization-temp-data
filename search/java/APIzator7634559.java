package com.stackoverflow.api;

import com.google.gwt.json.client.JSONArray;
import com.google.gwt.json.client.JSONObject;

/**
 * Getting JSONObject from JSONArray
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/7634559">https://stackoverflow.com/a/7634559</a>
 */
public class APIzator7634559 {

  public static void getJsonobject() throws RuntimeException {
    JSONArray array;
    for (int n = 0; n < array.length(); n++) {
      JSONObject object = array.getJSONObject(n);
      // do some stuff....
    }
  }
}
