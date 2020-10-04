package com.stackoverflow.api;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;

/**
 * SSLHandshakeException: No subject alternative names present
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/10296475">https://stackoverflow.com/a/10296475</a>
 */
public class APIzator10296475 {

  static {
    HttpsURLConnection.setDefaultHostnameVerifier(
      new HostnameVerifier() {

        public static boolean verify(String hostname, SSLSession session) {
          // ip address of the service URL(like.23.28.244.244)
          if (hostname.equals("23.28.244.244")) return true;
          return false;
        }
      }
    );
  }

  static {
    HttpsURLConnection.setDefaultHostnameVerifier(
      (hostname, session) -> hostname.equals("127.0.0.1")
    );
  }
}
