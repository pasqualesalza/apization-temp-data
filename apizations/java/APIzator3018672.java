package com.stackoverflow.api;

import com.gargoylesoftware.htmlunit.javascript.host.Set;

/**
 * Get a List of all Threads currently running in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/3018672">https://stackoverflow.com/a/3018672</a>
 */
public class APIzator3018672 {

  public static Thread[] getList() throws RuntimeException {
    Set<Thread> threadSet = Thread.getAllStackTraces().keySet();
    return threadSet.toArray(new Thread[threadSet.size()]);
  }
}
