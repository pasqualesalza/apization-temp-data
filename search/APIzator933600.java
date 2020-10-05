package com.stackoverflow.api;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

/**
 * How do you cast a List of supertypes to a List of subtypes?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/933600">https://stackoverflow.com/a/933600</a>
 */
public class APIzator933600 {

  public static List<TestB> castList() throws RuntimeException {
    return (List<TestB>) (List<?>) collectionOfListA;
  }
}
