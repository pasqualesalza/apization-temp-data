package com.stackoverflow.api;

import java.io.StringWriter;

/**
 * Convert Java object to XML string
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/26959543">https://stackoverflow.com/a/26959543</a>
 */
public class APIzator26959543 {

  public static String object() throws RuntimeException {
    StringWriter sw = new StringWriter();
    jaxbMarshaller.marshal(customer, sw);
    return sw.toString();
  }
}
