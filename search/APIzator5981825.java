package com.stackoverflow.api;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;
import org.ajoberstar.grgit.Person;
import org.mockito.ArgumentCaptor;

/**
 * Can Mockito capture arguments of a method called multiple times?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/5981825">https://stackoverflow.com/a/5981825</a>
 */
public class APIzator5981825 {

  public static void captureArgument() throws RuntimeException {
    ArgumentCaptor<Person> peopleCaptor = ArgumentCaptor.forClass(Person.class);
    verify(mock, times(2)).doSomething(peopleCaptor.capture());
    List<Person> capturedPeople = peopleCaptor.getAllValues();
    assertEquals("John", capturedPeople.get(0).getName());
    assertEquals("Jane", capturedPeople.get(1).getName());
  }
}
