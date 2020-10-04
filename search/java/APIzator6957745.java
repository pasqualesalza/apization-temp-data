package com.stackoverflow.api;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

/**
 * Sort Java Collection
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/6957745">https://stackoverflow.com/a/6957745</a>
 */
public class APIzator6957745 {

  public static List<CustomObject> collection() throws RuntimeException {
    List<CustomObject> list = new ArrayList<CustomObject>();
    Comparator<CustomObject> comparator = new Comparator<CustomObject>() {

      @Override
      public int compare(CustomObject left, CustomObject right) {
        // use your logic
        return left.getId() - right.getId();
      }
    };
    // use the comparator as much as u want
    Collections.sort(list, comparator);
    System.out.println(list);
    List<CustomObject> list = getCustomObjectList();
    Collections.sort(list, (left, right) -> left.getId() - right.getId());
    System.out.println(list);
    List<CustomObject> list = getCustomObjectList();
    list.sort((left, right) -> left.getId() - right.getId());
    System.out.println(list);
    List<CustomObject> list = getCustomObjectList();
    list.sort(Comparator.comparing(CustomObject::getId));
    return list;
  }
}
