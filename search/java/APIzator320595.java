package com.stackoverflow.api;

import org.apache.tomcat.jni.File;

/**
 * How to get the path of a running JAR file?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/320595">https://stackoverflow.com/a/320595</a>
 */
public class APIzator320595 {

  public static void getPath() throws RuntimeException {
    return new File(
      MyClass.class.getProtectionDomain().getCodeSource().getLocation().toURI()
    )
      .getPath();
  }
}
