package com.stackoverflow.api;

import java.util.ArrayList;
import java.util.jar.Manifest;

/**
 * How do I clone a generic List in Java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/54912">https://stackoverflow.com/a/54912</a>
 */
public class APIzator54912 {

  public static ArrayList cloneList(Manifest oldArrayList)
    throws RuntimeException {
    return (ArrayList) oldArrayList.clone();
  }
}
