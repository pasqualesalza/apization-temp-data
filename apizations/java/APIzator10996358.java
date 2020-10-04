package com.stackoverflow.api;

import org.apache.tomcat.jni.File;

/**
 * Driver executable must be set by the webdriver.ie.driver system property
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/10996358">https://stackoverflow.com/a/10996358</a>
 */
public class APIzator10996358 {

  public static WebDriver set() throws RuntimeException {
    File file = new File("C:/Selenium/iexploredriver.exe");
    System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
    return new InternetExplorerDriver();
  }
}
