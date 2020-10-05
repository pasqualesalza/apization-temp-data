package com.stackoverflow.api;

import org.springframework.web.context.WebApplicationContext;

/**
 * Loading context in Spring using web.xml
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/6451410">https://stackoverflow.com/a/6451410</a>
 */
public class APIzator6451410 {

  public static SomeBean context() throws RuntimeException {
    WebApplicationContext ctx = WebApplicationContextUtils.getRequiredWebApplicationContext(
      servlet.getServletContext()
    );
    return (SomeBean) ctx.getBean("someBean");
  }
}
