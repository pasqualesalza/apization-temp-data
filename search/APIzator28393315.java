package com.stackoverflow.api;

/**
 * init-param and context-param
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/28393315">https://stackoverflow.com/a/28393315</a>
 */
public class APIzator28393315 {

  public static void param() throws RuntimeException {
    out.println(getInitParameter("Greetings"));
    getServletContext().getInitParameter("Country");
    getServletContext().getInitParameter("Age");
  }
}
