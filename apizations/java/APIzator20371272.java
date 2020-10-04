package com.stackoverflow.api;

/**
 * What is the difference between response.sendRedirect() and request.getRequestDispatcher().forward(request,response)
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/20371272">https://stackoverflow.com/a/20371272</a>
 */
public class APIzator20371272 {

  public static void be() throws RuntimeException {
    response.sendRedirect("login.jsp");
    request.getRequestDispathcer("login.jsp").forward(request, response);
  }
}
