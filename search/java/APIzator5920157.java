package com.stackoverflow.api;

import com.fasterxml.jackson.databind.util.TypeKey;

/**
 * Printing HashMap In Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/5920157">https://stackoverflow.com/a/5920157</a>
 */
public class APIzator5920157 {

  public static void printHashmap() throws RuntimeException {
    for (TypeKey name : example.keySet()) {
      String key = name.toString();
      String value = example.get(name).toString();
      System.out.println(key + " " + value);
    }
  }
}
