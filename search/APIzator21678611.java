package com.stackoverflow.api;

import android.location.Location;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Group a list of objects by an attribute : Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/21678611">https://stackoverflow.com/a/21678611</a>
 */
public class APIzator21678611 {

  public static void group() throws RuntimeException {
    HashMap<Integer, List<Location>> hashMap = new HashMap<Integer, List<Location>>();
    if (!hashMap.containsKey(locationId)) {
      List<Location> list = new ArrayList<Location>();
      list.add(student);
      hashMap.put(locationId, list);
    } else {
      hashMap.get(locationId).add(student);
    }
    hashMap.get(locationId);
  }
}
