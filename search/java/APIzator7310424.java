package com.stackoverflow.api;

import com.google.appengine.repackaged.com.google.gson.Gson;
import com.google.appengine.repackaged.com.google.gson.GsonBuilder;
import com.google.appengine.repackaged.com.google.gson.JsonElement;
import com.google.appengine.repackaged.com.google.gson.JsonParser;

/**
 * Pretty-Print JSON in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/7310424">https://stackoverflow.com/a/7310424</a>
 */
public class APIzator7310424 {

  public static String json(String uglyJSONString) throws RuntimeException {
    Gson gson = new GsonBuilder().setPrettyPrinting().create();
    JsonParser jp = new JsonParser();
    JsonElement je = jp.parse(uglyJSONString);
    return gson.toJson(je);
  }
}
