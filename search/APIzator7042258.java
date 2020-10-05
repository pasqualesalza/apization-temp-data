package com.stackoverflow.api;

import org.ajoberstar.grgit.Person;

/**
 * How to make a deep copy of Java ArrayList
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/7042258">https://stackoverflow.com/a/7042258</a>
 */
public class APIzator7042258 {

  public static void makeCopy() throws RuntimeException {
    for (Person p : oldList) {
      newList.add(p.clone());
    }
  }
}
