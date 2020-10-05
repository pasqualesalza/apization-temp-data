package com.stackoverflow.api;

import android.util.JsonReader;
import com.google.appengine.repackaged.com.google.gson.Gson;
import java.io.StringReader;

/**
 * gson throws MalformedJsonException
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/11488385">https://stackoverflow.com/a/11488385</a>
 */
public class APIzator11488385 {

  public static Userinfo throwMalformedjsonexception() throws RuntimeException {
    Gson gson = new Gson();
    JsonReader reader = new JsonReader(new StringReader(result1));
    reader.setLenient(true);
    return gson.fromJson(reader, Userinfo.class);
  }
}
