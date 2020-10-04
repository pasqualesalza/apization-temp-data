package com.stackoverflow.api;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * Evaluating a math expression given in string form
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/3423360">https://stackoverflow.com/a/3423360</a>
 */
public class APIzator3423360 {

  public class Test {

    public static String evaluateExpression(String foo) throws ScriptException {
      ScriptEngineManager mgr = new ScriptEngineManager();
      ScriptEngine engine = mgr.getEngineByName("JavaScript");
      return engine.eval(foo);
    }
  }
}
