package com.stackoverflow.api;

/**
 * Java/ JUnit - AssertTrue vs AssertFalse
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/3241151">https://stackoverflow.com/a/3241151</a>
 */
public class APIzator3241151 {

  public static void asserttrue() throws RuntimeException {
    assertTrue("This will succeed.", true);
    assertTrue("This will fail!", false);
    assertFalse("This will succeed.", false);
    assertFalse("This will fail!", true);
  }
}
