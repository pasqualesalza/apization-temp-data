package com.stackoverflow.api;

import com.gargoylesoftware.htmlunit.javascript.host.Map;
import java.io.Serializable;

/**
 * When do Java generics require <? extends T> instead of <T> and is there any downside of switching?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/897973">https://stackoverflow.com/a/897973</a>
 */
public class APIzator897973 {

  public static void require(
    Map<String, Class<? extends Serializable>> expected,
    Map<String, Class<java.util.Date>> result
  )
    throws RuntimeException {
    assertThat(result, is(expected));
  }
}
