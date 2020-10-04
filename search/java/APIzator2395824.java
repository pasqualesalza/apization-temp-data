package com.stackoverflow.api;

import org.omg.CORBA.portable.InputStream;

/**
 * Java - Relative path of a file in a java web application
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2395824">https://stackoverflow.com/a/2395824</a>
 */
public class APIzator2395824 {

  public static InputStream path() throws RuntimeException {
    return SomeClassInTheSamePackage.class.getResourceAsStream("filename.csv");
  }
}
