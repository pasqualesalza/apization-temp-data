package com.stackoverflow.api;

import com.sun.deploy.net.URLEncoder;

/**
 * java.net.URLEncoder.encode(String) is deprecated, what should I use instead?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/213519">https://stackoverflow.com/a/213519</a>
 */
public class APIzator213519 {

  public static String javanet() throws RuntimeException {
    return URLEncoder.encode(
      "urlParameterString",
      java.nio.charset.StandardCharsets.UTF_8.toString()
    );
  }
}
