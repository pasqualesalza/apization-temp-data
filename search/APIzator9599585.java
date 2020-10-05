package com.stackoverflow.api;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * How to parse a JSON string into JsonNode in Jackson?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/9599585">https://stackoverflow.com/a/9599585</a>
 */
public class APIzator9599585 {

  public static JsonNode parseString() throws RuntimeException {
    ObjectMapper mapper = new ObjectMapper();
    return mapper.readTree("{\"k1\":\"v1\"}");
  }
}
