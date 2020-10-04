package com.stackoverflow.api;

import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONParser;

/**
 * Convert a JSON string to object in Java ME?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1396087">https://stackoverflow.com/a/1396087</a>
 */
public class APIzator1396087 {

  public static String convertString() throws RuntimeException {
    JSONObject json = (JSONObject) new JSONParser()
    .parse("{\"name\":\"MyNode\", \"width\":200, \"height\":100}");
    System.out.println("name=" + json.get("name"));
    return json.get("width");
  }
}
