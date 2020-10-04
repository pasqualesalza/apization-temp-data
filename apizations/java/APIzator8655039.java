package com.stackoverflow.api;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/**
 * Http Get using Android HttpURLConnection
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/8655039">https://stackoverflow.com/a/8655039</a>
 */
public class APIzator8655039 {

  public static void get() throws RuntimeException {
    URL url;
    HttpURLConnection urlConnection = null;
    try {
      url = new URL("http://www.mysite.se/index.asp?data=99");
      urlConnection = (HttpURLConnection) url.openConnection();
      InputStream in = urlConnection.getInputStream();
      InputStreamReader isw = new InputStreamReader(in);
      int data = isw.read();
      while (data != -1) {
        char current = (char) data;
        data = isw.read();
        System.out.print(current);
      }
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      if (urlConnection != null) {
        urlConnection.disconnect();
      }
    }
  }
}
