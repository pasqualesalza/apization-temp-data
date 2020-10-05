package com.stackoverflow.api;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URLConnection;

/**
 * Java: how to use UrlConnection to post request with authorization?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2026299">https://stackoverflow.com/a/2026299</a>
 */
public class APIzator2026299 {

  public static void java() throws RuntimeException {
    URL url = new URL(urlString);
    URLConnection conn = url.openConnection();
    conn.setDoOutput(true);
    conn.setRequestProperty("Authorization", encodedCredentials);
    OutputStreamWriter writer = new OutputStreamWriter(conn.getOutputStream());
    writer.write(data);
    writer.flush();
    String line;
    BufferedReader reader = new BufferedReader(
      new InputStreamReader(conn.getInputStream())
    );
    while ((line = reader.readLine()) != null) {
      System.out.println(line);
    }
    writer.close();
    reader.close();
    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
    conn.setRequestMethod("POST");
    conn.setRequestProperty(
      "Content-type",
      "application/x-www-form-urlencoded"
    );
    conn.setRequestProperty("Accept", "*/*");
  }
}
