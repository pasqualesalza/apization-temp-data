package com.stackoverflow.api;

import com.gargoylesoftware.htmlunit.javascript.host.dom.Document;
import java.io.StringReader;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import jdk.internal.org.xml.sax.InputSource;

/**
 * In Java, how do I parse XML as a String instead of a file?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/562207">https://stackoverflow.com/a/562207</a>
 */
public class APIzator562207 {

  public static Document loadXMLFromString(String xml) throws Exception {
    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
    DocumentBuilder builder = factory.newDocumentBuilder();
    InputSource is = new InputSource(new StringReader(xml));
    return builder.parse(is);
  }
}
