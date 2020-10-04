package com.stackoverflow.api;

import com.google.gwt.json.client.JSONObject;

/**
 * Converting JSON to XML in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/19978281">https://stackoverflow.com/a/19978281</a>
 */
public class APIzator19978281 {

  public static String convertJson() throws RuntimeException {
    JSONObject json = new JSONObject(str);
    return XML.toString(json);
  }
}
