package com.stackoverflow.api;

import java.io.DataOutputStream;
import java.net.HttpURLConnection;
import java.nio.charset.StandardCharsets;

/**
 * Java - sending HTTP parameters via POST method easily
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/4206094">https://stackoverflow.com/a/4206094</a>
 */
public class APIzator4206094 {

  public static void parameter(String urlParameters, String request)
    throws RuntimeException {
    byte[] postData = urlParameters.getBytes(StandardCharsets.UTF_8);
    int postDataLength = postData.length;
    URL url = new URL(request);
    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
    conn.setDoOutput(true);
    conn.setInstanceFollowRedirects(false);
    conn.setRequestMethod("POST");
    conn.setRequestProperty(
      "Content-Type",
      "application/x-www-form-urlencoded"
    );
    conn.setRequestProperty("charset", "utf-8");
    conn.setRequestProperty("Content-Length", Integer.toString(postDataLength));
    conn.setUseCaches(false);
    try (DataOutputStream wr = new DataOutputStream(conn.getOutputStream())) {
      wr.write(postData);
    }
  }
}
