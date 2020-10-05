package com.stackoverflow.api;

import java.util.GregorianCalendar;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * java.util.Date to XMLGregorianCalendar
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/835963">https://stackoverflow.com/a/835963</a>
 */
public class APIzator835963 {

  public static XMLGregorianCalendar date() throws RuntimeException {
    GregorianCalendar c = new GregorianCalendar();
    c.setTime(yourDate);
    return DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
  }
}
