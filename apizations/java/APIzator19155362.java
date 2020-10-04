package com.stackoverflow.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Simple way to compare 2 ArrayLists
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/19155362">https://stackoverflow.com/a/19155362</a>
 */
public class APIzator19155362 {

  public static Collection<String> way() throws RuntimeException {
    Collection<String> listOne = new ArrayList(
      Arrays.asList("a", "b", "c", "d", "e", "f", "g")
    );
    Collection<String> listTwo = new ArrayList(
      Arrays.asList("a", "b", "d", "e", "f", "gg", "h")
    );
    List<String> sourceList = new ArrayList<String>(listOne);
    List<String> destinationList = new ArrayList<String>(listTwo);
    sourceList.removeAll(listTwo);
    destinationList.removeAll(listOne);
    System.out.println(sourceList);
    System.out.println(destinationList);
    Collection<String> list = new ArrayList(
      Arrays.asList("a", "b", "c", "d", "e", "f", "g")
    );
    List<String> sourceList = new ArrayList<String>(list);
    List<String> destinationList = new ArrayList<String>(list);
    list.add("boo");
    list.remove("b");
    sourceList.removeAll(list);
    list.removeAll(destinationList);
    System.out.println(sourceList);
    return list;
  }
}
