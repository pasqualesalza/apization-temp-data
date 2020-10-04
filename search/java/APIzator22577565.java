package com.stackoverflow.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.ajoberstar.grgit.Person;

/**
 * Java: convert List<String> to a String
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/22577565">https://stackoverflow.com/a/22577565</a>
 */
public class APIzator22577565 {

  public static String convertList() throws RuntimeException {
    List<String> list = Arrays.asList("foo", "bar", "baz");
    // "foo and bar and baz"
    String joined = String.join(" and ", list);
    List<Person> list = Arrays.asList(
      new Person("John", "Smith"),
      new Person("Anna", "Martinez"),
      new Person("Paul", "Watson ")
    );
    return list
      .stream()
      .map(Person::getFirstName)
      .collect( // "John, Anna, Paul"
        Collectors.joining(", ")
      );
  }
}
