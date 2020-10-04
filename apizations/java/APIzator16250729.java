package com.stackoverflow.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

/**
 * How to respond with HTTP 400 error in a Spring MVC @ResponseBody method returning String?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/16250729">https://stackoverflow.com/a/16250729</a>
 */
public class APIzator16250729 {

  public static void respond() throws RuntimeException {
    return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    return new ResponseEntity<>(json, HttpStatus.OK);
    return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
    return ResponseEntity.ok(json);
  }
}
