package com.stackoverflow.api;

import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.Node;
import com.google.gwt.dom.client.NodeList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

/**
 * Loop through all elements in XML using NodeList
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/14566924">https://stackoverflow.com/a/14566924</a>
 */
public class APIzator14566924 {

  public static void loop() throws RuntimeException {
    DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
    DocumentBuilder db = dbf.newDocumentBuilder();
    Document dom = db.parse("file.xml");
    Element docEle = dom.getDocumentElement();
    NodeList nl = docEle.getChildNodes();
    if (nl != null) {
      int length = nl.getLength();
      for (int i = 0; i < length; i++) {
        if (nl.item(i).getNodeType() == Node.ELEMENT_NODE) {
          Element el = (Element) nl.item(i);
          if (el.getNodeName().contains("staff")) {
            String name = el
              .getElementsByTagName("name")
              .item(0)
              .getTextContent();
            String phone = el
              .getElementsByTagName("phone")
              .item(0)
              .getTextContent();
            String email = el
              .getElementsByTagName("email")
              .item(0)
              .getTextContent();
            String area = el
              .getElementsByTagName("area")
              .item(0)
              .getTextContent();
            String city = el
              .getElementsByTagName("city")
              .item(0)
              .getTextContent();
          }
        }
      }
    }
    el.getElementsByTagName("name").item(0).getTextContent();
  }
}
