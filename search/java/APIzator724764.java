package com.stackoverflow.api;

/**
 * HTTP URL Address Encoding in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/724764">https://stackoverflow.com/a/724764</a>
 */
public class APIzator724764 {

  public static void encoding(String str1) throws RuntimeException {
    URI uri = new URI("http", "search.barnesandnoble.com", str1, null);
    URL url = uri.toURL();
    // or String request = uri.toString();
    URI uri = new URI(
      "http",
      "search.barnesandnoble.com",
      "/booksearch/é",
      null
    );
    String request = uri.toASCIIString();
    URI uri = new URI(
      "http",
      "www.google.com",
      "/ig/api",
      "weather=São Paulo",
      null
    );
    String request = uri.toASCIIString();
  }
}
