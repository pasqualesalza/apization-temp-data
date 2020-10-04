package com.stackoverflow.api;

import clojure.asm.Item;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;

/**
 * How do I use a custom Serializer with Jackson?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/7168386">https://stackoverflow.com/a/7168386</a>
 */
public class APIzator7168386 {

  public static void serialize(
    Item value,
    JsonGenerator jgen,
    SerializerProvider provider
  )
    throws IOException, JsonProcessingException {
    jgen.writeNumber(id);
  }
}
