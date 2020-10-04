package com.stackoverflow.api;

import com.typesafe.config.Optional;

/**
 * Break or return from Java 8 stream forEach?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/23308251">https://stackoverflow.com/a/23308251</a>
 */
public class APIzator23308251 {

  public static boolean break_() throws RuntimeException {
    Optional<SomeObject> result = someObjects
      .stream()
      .filter(obj -> some_condition_met)
      .findFirst();
    return someObjects.stream().anyMatch(obj -> some_condition_met);
  }
}
