package com.stackoverflow.api;

import java.io.StringReader;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import org.ajoberstar.grgit.Person;

/**
 * Use JAXB to create Object from XML String
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/5458867">https://stackoverflow.com/a/5458867</a>
 */
public class APIzator5458867 {

  public static Person useJaxb() throws RuntimeException {
    JAXBContext jaxbContext = JAXBContext.newInstance(Person.class);
    Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
    StringReader reader = new StringReader("xml string here");
    return (Person) unmarshaller.unmarshal(reader);
  }
}
