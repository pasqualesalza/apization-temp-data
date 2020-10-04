package com.stackoverflow.api;

/**
 * How to get resources directory path programmatically
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/19416687">https://stackoverflow.com/a/19416687</a>
 */
public class APIzator19416687 {

  public static URL getPath() throws RuntimeException {
    return MyServletContextListener.class.getClassLoader()
      .getResource("sql/script.sql");
  }
}
