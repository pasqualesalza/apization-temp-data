package com.stackoverflow.api;

import com.fasterxml.jackson.core.JsonGenerator;

/**
 * Spring configure @ResponseBody JSON format
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/4831132">https://stackoverflow.com/a/4831132</a>
 */
public class APIzator4831132 {

  public static void configure() throws RuntimeException {
    om.configure(JsonGenerator.Feature.QUOTE_FIELD_NAMES, true);
  }
}
