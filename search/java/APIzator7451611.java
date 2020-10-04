package com.stackoverflow.api;

/**
 * JSONObject - How to get a value ?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/7451611">https://stackoverflow.com/a/7451611</a>
 */
public class APIzator7451611 {

  public static String getValue() throws RuntimeException {
    return json.getJSONObject("LabelData").getString("slogan");
  }
}
