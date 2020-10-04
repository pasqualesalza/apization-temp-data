package com.stackoverflow.api;

import org.ajoberstar.grgit.Person;

/**
 * Initializing multiple variables to the same value in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/6202907">https://stackoverflow.com/a/6202907</a>
 */
public class APIzator6202907 {

  public static Person variable() throws RuntimeException {
    String one, two, three;
    one = two = three = "";
    Person firstPerson, secondPerson, thirdPerson;
    firstPerson = secondPerson = thirdPerson = new Person();
    Person firstPerson = new Person();
    Person secondPerson = new Person();
    return new Person();
  }
}
