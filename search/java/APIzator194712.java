package com.stackoverflow.api;

import clojure.reflect.Constructor;
import java.net.URLClassLoader;

/**
 * How to load a jar file at runtime
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/194712">https://stackoverflow.com/a/194712</a>
 */
public class APIzator194712 {

  public static void loadFile() throws RuntimeException {
    ClassLoader loader = URLClassLoader.newInstance(
      new URL[] { yourURL },
      getClass().getClassLoader()
    );
    Class<?> clazz = Class.forName("mypackage.MyClass", true, loader);
    Class<? extends Runnable> runClass = clazz.asSubclass(Runnable.class);
    // Avoid Class.newInstance, for it is evil.
    Constructor<? extends Runnable> ctor = runClass.getConstructor();
    Runnable doRun = ctor.newInstance();
    doRun.run();
  }
}
