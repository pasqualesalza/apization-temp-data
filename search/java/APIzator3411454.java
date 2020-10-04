package com.stackoverflow.api;

import com.google.gwt.json.client.JSONArray;
import java.util.HashMap;

/**
 * JSON Array iteration in Android/Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/3411454">https://stackoverflow.com/a/3411454</a>
 */
public class APIzator3411454 {

  public static void iteration() throws RuntimeException {
    HashMap<String, String> applicationSettings = new HashMap<String, String>();
    for (int i = 0; i < settings.length(); i++) {
      String value = settings.getJSONObject(i).getString("value");
      String name = settings.getJSONObject(i).getString("name");
      applicationSettings.put(name, value);
    }
    JSONArray names = json.names();
    JSONArray values = json.toJSONArray(names);
    for (int i = 0; i < values.length(); i++) {
      if (names.getString(i).equals("description")) {
        setDescription(values.getString(i));
      } else if (names.getString(i).equals("expiryDate")) {
        String dateString = values.getString(i);
        setExpiryDate(stringToDateHelper(dateString));
      } else if (names.getString(i).equals("id")) {
        setId(values.getLong(i));
      } else if (names.getString(i).equals("offerCode")) {
        setOfferCode(values.getString(i));
      } else if (names.getString(i).equals("startDate")) {
        String dateString = values.getString(i);
        setStartDate(stringToDateHelper(dateString));
      } else if (names.getString(i).equals("title")) {
        setTitle(values.getString(i));
      }
    }
  }
}
