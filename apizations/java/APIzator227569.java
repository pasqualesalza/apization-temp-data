package com.stackoverflow.api;

import java.net.URL;

/**
 * Find where java class is loaded from
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/227569">https://stackoverflow.com/a/227569</a>
 */
public class APIzator227569 {

  public class Test {

    public static URL find() {
      ClassLoader loader = Test.class.getClassLoader();
      return loader.getResource("foo/Test.class");
    }
  }
}
