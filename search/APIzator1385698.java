package com.stackoverflow.api;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;
import java.util.stream.Collectors;
import org.ajoberstar.grgit.Person;

/**
 * What is the best way to filter a Java Collection?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1385698">https://stackoverflow.com/a/1385698</a>
 */
public class APIzator1385698 {

  public static List<Person> be() throws RuntimeException {
    List<Person> beerDrinkers = persons
      .stream()
      .filter(p -> p.getAge() > 16)
      .collect(Collectors.toList());
    persons.removeIf(p -> p.getAge() <= 16);
    return select(persons, having(on(Person.class).getAge(), greaterThan(16)));
  }
}
