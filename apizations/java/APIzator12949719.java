package com.stackoverflow.api;

import java.util.ArrayList;
import org.apache.commons.collections4.queue.CircularFifoQueue;

/**
 * Java Arrays how to add elements at the beginning
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/12949719">https://stackoverflow.com/a/12949719</a>
 */
public class APIzator12949719 {

  public static CircularFifoQueue arrays(ArrayList list, int yourObject)
    throws RuntimeException {
    list.add(0, yourObject);
    if (list.size() > 10) list.remove(list.size() - 1);
    return new CircularFifoQueue(10);
  }
}
