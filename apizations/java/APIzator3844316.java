package com.stackoverflow.api;

import com.sun.xml.internal.fastinfoset.sax.Properties;
import java.io.File;
import java.io.InputStream;

/**
 * How to read file from relative path in Java project? java.io.File cannot find the path specified
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/3844316">https://stackoverflow.com/a/3844316</a>
 */
public class APIzator3844316 {

  public static void readFile(String str1) throws RuntimeException {
    URL url = getClass().getResource(str1);
    File file = new File(url.getPath());
    InputStream input = getClass().getResourceAsStream(str1);
    Properties properties = new Properties();
    properties.load(getClass().getResourceAsStream(str1));
  }
}
