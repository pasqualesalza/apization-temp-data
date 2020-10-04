package com.stackoverflow.api;

import org.apache.tomcat.jni.File;

/**
 * How to get the path of running java program
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/17540996">https://stackoverflow.com/a/17540996</a>
 */
public class APIzator17540996 {

  public static File getPath() throws RuntimeException {
    return new File(
      MyClass.class.getProtectionDomain()
        .getCodeSource()
        .getLocation()
        .getPath()
    );
  }
}
