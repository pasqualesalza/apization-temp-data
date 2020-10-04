package com.stackoverflow.api;

import java.util.Comparator;

/**
 * Function Pointers in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1073427">https://stackoverflow.com/a/1073427</a>
 */
public class APIzator1073427 {

  public static void pointers() throws RuntimeException {
    Collections.sort(
      list,
      new Comparator<MyClass>() {

        public int compare(MyClass a, MyClass b) {
          // compare objects
        }
      }
    );
    list.sort((a, b) -> a.isGreaterThan(b));
    list.sort(MyClass::isGreaterThan);
  }
}
