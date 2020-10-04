package com.stackoverflow.api;

import com.google.appengine.repackaged.com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;

/**
 * How to convert List to Json in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/14229020">https://stackoverflow.com/a/14229020</a>
 */
public class APIzator14229020 {

  public static String convertList(List<String> foo) throws RuntimeException {
    return new Gson().toJson(foo);
  }
}
