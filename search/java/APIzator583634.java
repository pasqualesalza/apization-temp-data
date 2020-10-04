package com.stackoverflow.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.HashMap;

/**
 * Convert JSON to Map
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/583634">https://stackoverflow.com/a/583634</a>
 */
public class APIzator583634 {

  public static HashMap<String, Object> convertJson() throws RuntimeException {
    return new ObjectMapper().readValue(JSON_SOURCE, HashMap.class);
  }
}
