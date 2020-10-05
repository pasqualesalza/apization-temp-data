package com.stackoverflow.api;

import java.net.Authenticator;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;

/**
 * How do I make HttpURLConnection use a proxy?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1433296">https://stackoverflow.com/a/1433296</a>
 */
public class APIzator1433296 {

  public static void make() throws RuntimeException {
    // Proxy instance, proxy ip = 10.0.0.1 with port 8080
    Proxy proxy = new Proxy(
      Proxy.Type.HTTP,
      new InetSocketAddress("10.0.0.1", 8080)
    );
    conn = new URL(urlString).openConnection(proxy);
    Authenticator authenticator = new Authenticator() {

      public PasswordAuthentication getPasswordAuthentication() {
        return (new PasswordAuthentication("user", "password".toCharArray()));
      }
    };
    Authenticator.setDefault(authenticator);
  }
}
