package com.stackoverflow.api;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Java integer list
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/5371815">https://stackoverflow.com/a/5371815</a>
 */
public class APIzator5371815 {

  public static void list(List<Integer> myCoords) throws RuntimeException {
    Iterator<Integer> myListIterator = myCoords.iterator();
    while (myListIterator.hasNext()) {
      Integer coord = myListIterator.next();
      System.out.print("\r");
      System.out.print(coord);
      Thread.sleep(2000);
    }
  }
}
