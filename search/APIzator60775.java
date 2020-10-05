package com.stackoverflow.api;

import clojure.asm.commons.Method;
import java.net.URLClassLoader;

/**
 * How should I load Jars dynamically at runtime?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/60775">https://stackoverflow.com/a/60775</a>
 */
public class APIzator60775 {

  public static Object loadJar() throws RuntimeException {
    URLClassLoader child = new URLClassLoader(
      myJar.toURL(),
      this.getClass().getClassLoader()
    );
    Class classToLoad = Class.forName("com.MyClass", true, child);
    Method method = classToLoad.getDeclaredMethod("myMethod");
    Object instance = classToLoad.newInstance();
    return method.invoke(instance);
  }
}
