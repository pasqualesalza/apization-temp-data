package com.stackoverflow.api;

import com.google.appengine.repackaged.com.google.gson.Gson;
import com.google.appengine.repackaged.com.google.gson.JsonElement;
import com.google.appengine.repackaged.com.google.gson.reflect.TypeToken;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

/**
 * Parsing JSON array into java.util.List with Gson
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/18547661">https://stackoverflow.com/a/18547661</a>
 */
public class APIzator18547661 {

  public static List<String> array() throws RuntimeException {
    JsonElement yourJson = mapping.get("servers");
    Type listType = new TypeToken<List<String>>() {}.getType();
    return new Gson().fromJson(yourJson, listType);
  }
}
