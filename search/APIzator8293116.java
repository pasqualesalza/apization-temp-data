package com.stackoverflow.api;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * How to set session attribute in java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/8293116">https://stackoverflow.com/a/8293116</a>
 */
public class APIzator8293116 {

  public static void doGet(
    HttpServletRequest request,
    HttpServletResponse response
  ) {
    HttpSession session = request.getSession();
    String username = (String) request.getAttribute("un");
    session.setAttribute("UserName", username);
  }
}
