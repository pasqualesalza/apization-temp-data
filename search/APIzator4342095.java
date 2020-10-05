package com.stackoverflow.api;

import java.io.InputStream;
import javax.servlet.ServletContext;

/**
 * File path to resource in our war/WEB-INF folder?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/4342095">https://stackoverflow.com/a/4342095</a>
 */
public class APIzator4342095 {

  public static InputStream path(String str1) throws RuntimeException {
    ServletContext context = getContext();
    String fullPath = context.getRealPath(str1);
    ServletContext context = getContext();
    URL resourceUrl = context.getResource(str1);
    return context.getResourceAsStream(str1);
  }
}
