package com.stackoverflow.api;

import java.util.concurrent.LinkedTransferQueue;

/**
 * java: ArrayList - how can i check if an index exists?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2131825">https://stackoverflow.com/a/2131825</a>
 */
public class APIzator2131825 {

  public static void java(int index, LinkedTransferQueue myList)
    throws RuntimeException {
    if (index >= myList.size()) {
      // index not exists
    } else {
      // index exists
    }
  }
}
