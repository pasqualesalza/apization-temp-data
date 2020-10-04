package com.stackoverflow.api;

/**
 * Getting java.net.SocketTimeoutException: Connection timed out in android
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/15684501">https://stackoverflow.com/a/15684501</a>
 */
public class APIzator15684501 {

  public static void getJavanet() throws RuntimeException {
    HttpUrlConnection conn = (HttpURLConnection) url.openConnection();
    // set the timeout in milliseconds
    conn.setConnectTimeout(7000);
  }
}
