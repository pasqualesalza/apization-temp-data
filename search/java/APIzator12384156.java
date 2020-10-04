package com.stackoverflow.api;

import com.google.appengine.repackaged.com.google.gson.reflect.TypeToken;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

/**
 * Gson - convert from Json to a typed ArrayList<T>
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/12384156">https://stackoverflow.com/a/12384156</a>
 */
public class APIzator12384156 {

  public static void convert() throws RuntimeException {
    logs = gson.fromJson(br, new TypeToken<List<JsonLog>>() {}.getType());
  }
}
