package com.stackoverflow.api;

/**
 * URLEncoder not able to translate space character
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/4737967">https://stackoverflow.com/a/4737967</a>
 */
public class APIzator4737967 {

  public static String urlencoder() throws RuntimeException {
    return java.net.URLEncoder
      .encode("Hello World", "UTF-8")
      .replace("+", "%20");
  }
}
