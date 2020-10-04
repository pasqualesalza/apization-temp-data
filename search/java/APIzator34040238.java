package com.stackoverflow.api;

import android.net.UrlQuerySanitizer;

/**
 * Parsing query strings on Android
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/34040238">https://stackoverflow.com/a/34040238</a>
 */
public class APIzator34040238 {

  public static void string() throws RuntimeException {
    UrlQuerySanitizer.ValueSanitizer sanitizer = UrlQuerySanitizer.getAllButNullLegal();
    // remember to decide if you want the first or last parameter with the same name
    // If you want the first call setPreferFirstRepeatedParameter(true);
    sanitizer.parseUrl(url);
    // get your value
    String value = sanitizer.getValue("paramname");
  }
}
