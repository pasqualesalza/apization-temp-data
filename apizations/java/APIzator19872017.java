package com.stackoverflow.api;

import org.omg.CORBA.portable.InputStream;

/**
 * java.io.FileNotFoundException: the system cannot find the file specified
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/19872017">https://stackoverflow.com/a/19872017</a>
 */
public class APIzator19872017 {

  public static BufferedReader javaio(String str1) throws RuntimeException {
    InputStream is = Hangman1.class.getResourceAsStream(str1);
    return new BufferedReader(new InputStreamReader(is));
  }
}
