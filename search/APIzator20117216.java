package com.stackoverflow.api;

import com.google.gwt.json.client.JSONArray;
import com.google.gwt.json.client.JSONObject;

/**
 * How to create JSON Object using String?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/20117216">https://stackoverflow.com/a/20117216</a>
 */
public class APIzator20117216 {

  public static void createObject() throws RuntimeException {
    String message;
    JSONObject json = new JSONObject();
    json.put("name", "student");
    JSONArray array = new JSONArray();
    JSONObject item = new JSONObject();
    item.put("information", "test");
    item.put("id", 3);
    item.put("name", "course1");
    array.add(item);
    json.put("course", array);
    message = json.toString();
    // message
    // {"course":[{"id":3,"information":"test","name":"course1"}],"name":"student"}
  }
}
