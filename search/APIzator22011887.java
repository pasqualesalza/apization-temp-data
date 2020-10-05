package com.stackoverflow.api;

import com.google.gwt.json.client.JSONException;
import com.google.gwt.json.client.JSONObject;
import java.util.HashMap;
import java.util.Iterator;

/**
 * creating Hashmap from a JSON String
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/22011887">https://stackoverflow.com/a/22011887</a>
 */
public class APIzator22011887 {

  public static void jsonToMap(String t) throws JSONException {
    HashMap<String, String> map = new HashMap<String, String>();
    JSONObject jObject = new JSONObject(t);
    Iterator<?> keys = jObject.keys();
    while (keys.hasNext()) {
      String key = (String) keys.next();
      String value = jObject.getString(key);
      map.put(key, value);
    }
    System.out.println("json : " + jObject);
    System.out.println("map : " + map);
  }
}
