package com.stackoverflow.api;

/**
 * What is the syntax of enhanced for loop in Java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/11685345">https://stackoverflow.com/a/11685345</a>
 */
public class APIzator11685345 {

  public static void be() throws RuntimeException {
    for (String element : array) {
      // Do something with element of type String
      System.out.println(element);
    }
    for (int i = 0; i < array.length; i++) {
      // Reference to the item in array[position]
      String element = array[i];
      // More code using String element
    }
  }
}
