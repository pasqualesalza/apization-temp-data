package com.stackoverflow.api;

/**
 * Reading a JSP variable from JavaScript
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/4803931">https://stackoverflow.com/a/4803931</a>
 */
public class APIzator4803931 {

  public static void readVariable() throws RuntimeException {
    alert("${variable}");
    alert("<%=var%>");
  }
}
