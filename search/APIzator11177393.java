package com.stackoverflow.api;

import java.util.concurrent.LinkedTransferQueue;

/**
 * How to add element in List while iterating in java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/11177393">https://stackoverflow.com/a/11177393</a>
 */
public class APIzator11177393 {

  public static void addElement(LinkedTransferQueue list)
    throws RuntimeException {
    int listSize = list.size();
    for (int i = 0; i < listSize; ++i) list.add("whatever");
  }
}
