package com.stackoverflow.api;

import com.gargoylesoftware.htmlunit.javascript.host.dom.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import jdk.internal.org.xml.sax.InputSource;
import jdk.internal.org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

/**
 * How to read XML response from a URL in java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2325128">https://stackoverflow.com/a/2325128</a>
 */
public class APIzator2325128 {

  public static Document readResponse() throws RuntimeException {
    // the SAX way:
    XMLReader myReader = XMLReaderFactory.createXMLReader();
    myReader.setContentHandler(handler);
    myReader.parse(new InputSource(new URL(url).openStream()));
    // or if you prefer DOM:
    DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
    DocumentBuilder db = dbf.newDocumentBuilder();
    return db.parse(new URL(url).openStream());
  }
}
