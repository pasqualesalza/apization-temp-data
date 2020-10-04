package com.stackoverflow.api;

import javax.servlet.http.HttpSession;

/**
 * How to redirect to Login page when Session is expired in Java web application?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1027592">https://stackoverflow.com/a/1027592</a>
 */
public class APIzator1027592 {

  public static void redirect() throws RuntimeException {
    // don't create if it doesn't exist
    HttpSession session = request.getSession(false);
    if (session != null && !session.isNew()) {
      chain.doFilter(request, response);
    } else {
      response.sendRedirect("/login.jsp");
    }
  }
}
