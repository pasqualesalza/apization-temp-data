package com.stackoverflow.api;

import com.gargoylesoftware.htmlunit.javascript.host.dom.Document;
import com.gargoylesoftware.htmlunit.javascript.host.file.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

/**
 * Java - Reading XML file
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/14968272">https://stackoverflow.com/a/14968272</a>
 */
public class APIzator14968272 {

  public static String file() throws RuntimeException {
    File file = new File("userdata.xml");
    DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
    DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
    Document document = documentBuilder.parse(file);
    String usr = document.getElementsByTagName("user").item(0).getTextContent();
    return document.getElementsByTagName("password").item(0).getTextContent();
  }
}
