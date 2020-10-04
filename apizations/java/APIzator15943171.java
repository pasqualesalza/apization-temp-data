package com.stackoverflow.api;

import aj.org.objectweb.asm.Type;
import com.gargoylesoftware.htmlunit.javascript.host.Map;
import com.google.appengine.repackaged.com.google.gson.reflect.TypeToken;

/**
 * How can I convert JSON to a HashMap using Gson?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/15943171">https://stackoverflow.com/a/15943171</a>
 */
public class APIzator15943171 {

  public static Map<String, String> convertJson() throws RuntimeException {
    Type type = new TypeToken<Map<String, String>>() {}.getType();
    return gson.fromJson("{'k1':'apple','k2':'orange'}", type);
  }
}
