package com.stackoverflow.api;

/**
 * Get full URL and query string in Servlet for both HTTP and HTTPS requests
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/16675399">https://stackoverflow.com/a/16675399</a>
 */
public class APIzator16675399 {

  public static void getUrl() throws RuntimeException {
    // Example: http://myhost:8080/people?lastname=Fox&amp;age=30
    String uri = // "http" + "://
      request.getScheme() +
      "://" + // "myhost"
      request.getServerName() + // ":"
      ":" + // "8080"
      request.getServerPort() + // "/people"
      request.getRequestURI() + // "?"
      "?" + // "lastname=Fox&amp;age=30"
      request.getQueryString();
    String uri =
      request.getScheme() +
      "://" +
      request.getServerName() +
      (
        "http".equals(request.getScheme()) &&
          request.getServerPort() == 80 ||
          "https".equals(request.getScheme()) &&
          request.getServerPort() == 443
          ? ""
          : ":" + request.getServerPort()
      ) +
      request.getRequestURI() +
      (request.getQueryString() != null ? "?" + request.getQueryString() : "");
  }
}
