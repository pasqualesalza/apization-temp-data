package com.stackoverflow.api;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

/**
 * How to clone ArrayList and also clone its contents?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/715660">https://stackoverflow.com/a/715660</a>
 */
public class APIzator715660 {

  public static List<Dog> cloneList(List<Dog> list) {
    List<Dog> clone = new ArrayList<Dog>(list.size());
    for (Dog item : list) clone.add(item.clone());
    return clone;
  }
}
