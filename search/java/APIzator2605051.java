package com.stackoverflow.api;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

/**
 * Is there an eval() function in Java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2605051">https://stackoverflow.com/a/2605051</a>
 */
public class APIzator2605051 {

  public static Object be() throws RuntimeException {
    ScriptEngineManager manager = new ScriptEngineManager();
    ScriptEngine engine = manager.getEngineByName("js");
    return engine.eval("4*5");
  }
}
