package com.stackoverflow.api;

import android.util.Base64;
import java.net.HttpURLConnection;

/**
 * Adding header for HttpURLConnection
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/15555952">https://stackoverflow.com/a/15555952</a>
 */
public class APIzator15555952 {

  public static void addHeader(String userCredentials) throws RuntimeException {
    URL myURL = new URL(serviceURL);
    HttpURLConnection myURLConnection = (HttpURLConnection) myURL.openConnection();
    String basicAuth =
      "Basic " + new String(new Base64().encode(userCredentials.getBytes()));
    myURLConnection.setRequestProperty("Authorization", basicAuth);
    myURLConnection.setRequestMethod("POST");
    myURLConnection.setRequestProperty(
      "Content-Type",
      "application/x-www-form-urlencoded"
    );
    myURLConnection.setRequestProperty(
      "Content-Length",
      "" + postData.getBytes().length
    );
    myURLConnection.setRequestProperty("Content-Language", "en-US");
    myURLConnection.setUseCaches(false);
    myURLConnection.setDoInput(true);
    myURLConnection.setDoOutput(true);
  }
}
