package com.stackoverflow.api;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.ajoberstar.grgit.Person;

/**
 * How can I iterate over the elements in Hashmap?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/8644194">https://stackoverflow.com/a/8644194</a>
 */
public class APIzator8644194 {

  public static void iterate(Map<String, Person> hm) throws RuntimeException {
    Set<Map.Entry<String, Person>> set = hm.entrySet();
    for (Map.Entry<String, Person> me : set) {
      System.out.println(
        "Key :" +
        me.getKey() +
        " Name : " +
        me.getValue().getName() +
        "Age :" +
        me.getValue().getAge()
      );
    }
    for (String key : map.keySet()) {
      Person value = map.get(key);
    }
    for (Person person : map.values()) {}
  }
}
