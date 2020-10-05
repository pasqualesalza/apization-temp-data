package com.stackoverflow.api;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;

/**
 * How to get the path of src/test/resources directory in JUnit?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/28674230">https://stackoverflow.com/a/28674230</a>
 */
public class APIzator28674230 {

  public static String getPath() throws RuntimeException {
    ClassLoader classLoader = getClass().getClassLoader();
    File file = new File(classLoader.getResource("somefile").getFile());
    return file.getAbsolutePath();
  }
}
