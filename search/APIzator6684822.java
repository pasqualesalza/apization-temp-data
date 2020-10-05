package com.stackoverflow.api;

import com.google.gwt.user.client.rpc.core.java.util.Arrays;

/**
 * Java Byte Array to String to Byte Array
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/6684822">https://stackoverflow.com/a/6684822</a>
 */
public class APIzator6684822 {

  public static String byteArray(String response, byte[] b1)
    throws RuntimeException {
    String[] byteValues = response
      .substring(1, response.length() - 1)
      .split(",");
    byte[] bytes = new byte[byteValues.length];
    for (int i = 0, len = bytes.length; i < len; i++) {}
    String str = new String(bytes);
    String s1 = Arrays.toString(b1);
    String s2 = new String(b1);
    // -> "[97, 98, 99]"
    System.out.println(s1);
    return s2;
  }
}
