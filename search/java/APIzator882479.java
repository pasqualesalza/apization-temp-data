package com.stackoverflow.api;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/**
 * Java client certificates over HTTPS/SSL
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/882479">https://stackoverflow.com/a/882479</a>
 */
public class APIzator882479 {

  public static void certificate() throws RuntimeException {
    SSLSocketFactory sslsocketfactory = (SSLSocketFactory) SSLSocketFactory.getDefault();
    URL url = new URL("https://gridserver:3049/cgi-bin/ls.py");
    HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
    conn.setSSLSocketFactory(sslsocketfactory);
    InputStream inputstream = conn.getInputStream();
    InputStreamReader inputstreamreader = new InputStreamReader(inputstream);
    BufferedReader bufferedreader = new BufferedReader(inputstreamreader);
    String string = null;
    while ((string = bufferedreader.readLine()) != null) {
      System.out.println("Received " + string);
    }
  }
}
