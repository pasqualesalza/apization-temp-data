package com.stackoverflow.api;

import com.google.appengine.repackaged.com.google.gson.JsonObject;
import com.google.appengine.repackaged.com.google.gson.JsonParser;

/**
 * Gson: Directly convert String to JsonObject (no POJO)
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/4527044">https://stackoverflow.com/a/4527044</a>
 */
public class APIzator4527044 {

  public static JsonObject convertString() throws RuntimeException {
    JsonParser parser = new JsonParser();
    return parser.parse("{\"a\": \"A\"}").getAsJsonObject();
  }
}
