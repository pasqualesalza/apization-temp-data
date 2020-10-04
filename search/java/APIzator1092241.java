package com.stackoverflow.api;

import com.vividsolutions.jts.util.Assert;
import org.hamcrest.CoreMatchers;

/**
 * AssertContains on strings in jUnit
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1092241">https://stackoverflow.com/a/1092241</a>
 */
public class APIzator1092241 {

  public static void assertcontains(String x) throws RuntimeException {
    Assert.assertThat(x, CoreMatchers.containsString("foo"));
    assertThat(x, containsString("foo"));
  }
}
