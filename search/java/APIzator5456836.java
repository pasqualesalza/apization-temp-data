package com.stackoverflow.api;

import java.io.StringWriter;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

/**
 * XML Document to String
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/5456836">https://stackoverflow.com/a/5456836</a>
 */
public class APIzator5456836 {

  public static String document() throws RuntimeException {
    TransformerFactory tf = TransformerFactory.newInstance();
    Transformer transformer = tf.newTransformer();
    transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
    StringWriter writer = new StringWriter();
    transformer.transform(new DOMSource(doc), new StreamResult(writer));
    return writer.getBuffer().toString().replaceAll("\n|\r", "");
  }
}
