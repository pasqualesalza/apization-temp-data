package com.stackoverflow.api;

import java.io.IOException;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

/**
 * Deprecated Java HttpClient - How hard can it be?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/15336796">https://stackoverflow.com/a/15336796</a>
 */
public class APIzator15336796 {

  public static void be() throws RuntimeException {
    HttpClient httpClient = HttpClientBuilder.create().build();
    try (CloseableHttpClient httpClient = HttpClientBuilder.create().build()) {
      // use httpClient (no need to close it explicitly)
    } catch (IOException e) {
      // handle
    }
  }
}
