package com.stackoverflow.api;

import org.reflections.Reflections;
import scala.reflect.internal.util.Set;

/**
 * At runtime, find all classes in a Java application that extend a base class
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/9240969">https://stackoverflow.com/a/9240969</a>
 */
public class APIzator9240969 {

  public static Set<Class<? extends MyInterface>> findClass()
    throws RuntimeException {
    Reflections reflections = new Reflections("com.mycompany");
    return reflections.getSubTypesOf(MyInterface.class);
  }
}
