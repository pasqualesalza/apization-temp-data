package com.stackoverflow.api;

import com.google.gwt.json.client.JSONObject;

/**
 * Java String to JSON conversion
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/20070532">https://stackoverflow.com/a/20070532</a>
 */
public class APIzator20070532 {

  public static String string() throws RuntimeException {
    // json
    JSONObject jObject = new JSONObject(output);
    // get data object
    JSONObject data = jObject.getJSONObject("data");
    // get the name from data.
    String projectname = data.getString("name");
    JSONObject jsonObject = (JSONObject) obj;
    return (String) jsonObject.get("name");
  }
}
