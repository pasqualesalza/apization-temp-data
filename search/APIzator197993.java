package com.stackoverflow.api;

import java.util.ArrayList;
import java.util.List;

/**
 * What causes javac to issue the "uses unchecked or unsafe operations" warning
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/197993">https://stackoverflow.com/a/197993</a>
 */
public class APIzator197993 {

  public static List<String> cause() throws RuntimeException {
    List myList = new ArrayList();
    List<String> myList = new ArrayList<String>();
    return new ArrayList<>();
  }
}
