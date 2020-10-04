package com.stackoverflow.api;

import clojure.reflect.Field;
import java.util.Hashtable;

/**
 * How to read the value of a private field from a different class in Java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1196207">https://stackoverflow.com/a/1196207</a>
 */
public class APIzator1196207 {

  public static void readValue() throws RuntimeException {
    // NoSuchFieldException
    Field f = obj.getClass().getDeclaredField("stuffIWant");
    f.setAccessible(true);
    // IllegalAccessException
    Hashtable iWantThis = (Hashtable) f.get(obj);
    // will throw NoSuchFieldException
    obj.getClass().getDeclaredField("misspelled");
    // will throw IllegalArgumentException, as String is of the wrong type
    f.get("BOB");
  }
}
