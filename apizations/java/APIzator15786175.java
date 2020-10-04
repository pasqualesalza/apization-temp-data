package com.stackoverflow.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

/**
 * Converting Java objects to JSON with Jackson
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/15786175">https://stackoverflow.com/a/15786175</a>
 */
public class APIzator15786175 {

  public static String convert() throws RuntimeException {
    ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
    return ow.writeValueAsString(object);
  }
}
