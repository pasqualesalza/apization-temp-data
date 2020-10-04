package com.stackoverflow.api;

import com.gargoylesoftware.htmlunit.javascript.host.Set;
import org.reflections.Reflections;

/**
 * Can you find all classes in a package using reflection?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/520339">https://stackoverflow.com/a/520339</a>
 */
public class APIzator520339 {

  public static Set<Class<? extends Object>> findClass()
    throws RuntimeException {
    Reflections reflections = new Reflections("my.project.prefix");
    return reflections.getSubTypesOf(Object.class);
  }
}
