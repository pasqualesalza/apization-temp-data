package com.stackoverflow.api;

import com.sun.xml.internal.fastinfoset.sax.Properties;
import java.io.InputStream;

/**
 * Loading a properties file from Java package
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/333385">https://stackoverflow.com/a/333385</a>
 */
public class APIzator333385 {

  public static InputStream loadFile() throws RuntimeException {
    Properties prop = new Properties();
    InputStream in = getClass().getResourceAsStream("foo.properties");
    prop.load(in);
    in.close();
    return getClass()
      .getResourceAsStream("/com/al/common/email/templates/foo.properties");
  }
}
