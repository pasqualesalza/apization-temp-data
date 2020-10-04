package com.stackoverflow.api;

import clojure.asm.commons.Method;

/**
 * What is reflection and why is it useful?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/37632">https://stackoverflow.com/a/37632</a>
 */
public class APIzator37632 {

  public static void be() throws RuntimeException {
    Method method = foo.getClass().getMethod("doSomething", null);
    method.invoke(foo, null);
  }
}
