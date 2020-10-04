package com.stackoverflow.api;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

/**
 * What's the best mock framework for Java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/23048">https://stackoverflow.com/a/23048</a>
 */
public class APIzator23048 {

  public static void be() throws RuntimeException {
    List mockedList = mock(List.class);
    mockedList.clear();
    verify(mockedList).clear();
  }
}
