package com.stackoverflow.api;

import java.util.ArrayList;

/**
 * Get value (String) of ArrayList<ArrayList<String>>(); in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/15944763">https://stackoverflow.com/a/15944763</a>
 */
public class APIzator15944763 {

  public static void getValue() throws RuntimeException {
    listOfSomething.Clear();
    listOfSomething.Add("first");
    collection.Add(listOfSomething);
    ArrayList<ArrayList<String>> collection = new ArrayList<ArrayList<String>>();
    ArrayList<String> listOfSomething1 = new ArrayList<String>();
    listOfSomething1.Add("first");
    listOfSomething1.Add("second");
    ArrayList<String> listOfSomething2 = new ArrayList<String>();
    listOfSomething2.Add("first");
    collection.Add(listOfSomething1);
    collection.Add(listOfSomething2);
  }
}
