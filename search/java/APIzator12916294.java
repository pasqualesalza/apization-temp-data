package com.stackoverflow.api;

import java.net.HttpURLConnection;
import org.eclipse.persistence.jaxb.JAXBContext;

/**
 * How to consume REST in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/12916294">https://stackoverflow.com/a/12916294</a>
 */
public class APIzator12916294 {

  public static void consumeRest(String uri) throws RuntimeException {
    URL url = new URL(uri);
    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
    connection.setRequestMethod("GET");
    connection.setRequestProperty("Accept", "application/xml");
    JAXBContext jc = JAXBContext.newInstance(Customer.class);
    InputStream xml = connection.getInputStream();
    Customer customer = (Customer) jc.createUnmarshaller().unmarshal(xml);
    connection.disconnect();
  }
}
