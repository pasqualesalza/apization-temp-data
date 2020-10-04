package com.stackoverflow.api;

/**
 * list.clear() vs list = new ArrayList<Integer>();
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/6961394">https://stackoverflow.com/a/6961394</a>
 */
public class APIzator6961394 {

  public static void clear() {
    modCount++;
    // Let gc do its work
    for (int i = 0; i < size; i++) elementData[i] = null;
    size = 0;
  }
}
