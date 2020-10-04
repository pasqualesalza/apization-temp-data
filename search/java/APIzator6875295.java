package com.stackoverflow.api;

import android.text.format.DateFormat;
import com.google.appengine.repackaged.com.google.gson.Gson;
import com.google.appengine.repackaged.com.google.gson.GsonBuilder;
import com.google.appengine.repackaged.com.google.gson.JsonDeserializationContext;
import com.google.appengine.repackaged.com.google.gson.JsonDeserializer;
import com.google.appengine.repackaged.com.google.gson.JsonElement;
import com.google.appengine.repackaged.com.google.gson.JsonParseException;
import com.google.appengine.repackaged.com.google.gson.JsonPrimitive;
import com.google.appengine.repackaged.com.google.gson.JsonSerializationContext;
import com.google.appengine.repackaged.com.google.gson.JsonSerializer;
import org.apache.tools.ant.types.resources.comparators.Date;
import org.apache.tools.ant.types.resources.comparators.Type;

/**
 * GSON - Date format
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/6875295">https://stackoverflow.com/a/6875295</a>
 */
public class APIzator6875295 {

  public static Gson format() throws RuntimeException {
    Gson gson = new GsonBuilder()
      .setDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz")
      .create();
    Gson gson = new GsonBuilder()
      .setDateFormat(DateFormat.FULL, DateFormat.FULL)
      .create();
    JsonSerializer<Date> ser = new JsonSerializer<Date>() {

      @Override
      public JsonElement serialize(
        Date src,
        Type typeOfSrc,
        JsonSerializationContext context
      ) {
        return src == null ? null : new JsonPrimitive(src.getTime());
      }
    };
    JsonDeserializer<Date> deser = new JsonDeserializer<Date>() {

      @Override
      public Date deserialize(
        JsonElement json,
        Type typeOfT,
        JsonDeserializationContext context
      )
        throws JsonParseException {
        return json == null ? null : new Date(json.getAsLong());
      }
    };
    return new GsonBuilder()
      .registerTypeAdapter(Date.class, ser)
      .registerTypeAdapter(Date.class, deser)
      .create();
  }
}
