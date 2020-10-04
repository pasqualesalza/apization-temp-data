package com.stackoverflow.api;

/**
 * How do I pass multiple parameter in URL?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/10943694">https://stackoverflow.com/a/10943694</a>
 */
public class APIzator10943694 {

  public static void passParameter() throws RuntimeException {
    url =
      new URL(
        "http://10.0.2.2:8080/HelloServlet/PDRS?param1=" +
        lat +
        "&amp;param2=" +
        lon
      );
    url =
      new URL(
        "http://10.0.2.2:8080/HelloServlet/PDRS?param1=" + lat + "_" + lon
      );
  }
}
