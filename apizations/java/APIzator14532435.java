package com.stackoverflow.api;

/**
 * Convert JSON String to Pretty Print JSON output using Jackson
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/14532435">https://stackoverflow.com/a/14532435</a>
 */
public class APIzator14532435 {

  public static String convertString() throws RuntimeException {
    Object json = mapper.readValue(input, Object.class);
    return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(json);
  }
}
