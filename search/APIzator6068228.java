package com.stackoverflow.api;

import android.content.res.Resources;
import com.google.appengine.repackaged.com.google.api.client.util.Charsets;

/**
 * Utils to read resource text file to String (Java)
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/6068228">https://stackoverflow.com/a/6068228</a>
 */
public class APIzator6068228 {

  public static String util(String str1) throws RuntimeException {
    URL url = Resources.getResource(str1);
    return Resources.toString(url, Charsets.UTF_8);
  }
}
