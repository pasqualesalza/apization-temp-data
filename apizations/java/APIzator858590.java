package com.stackoverflow.api;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;
import java.util.ArrayList;

/**
 * How to make a new List in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/858590">https://stackoverflow.com/a/858590</a>
 */
public class APIzator858590 {

  public static List<MyType> makeList() throws RuntimeException {
    List myList = new ArrayList();
    List<MyType> myList = new ArrayList<>();
    return new ArrayList<MyType>();
  }
}
