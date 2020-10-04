package com.stackoverflow.api;

/**
 * Why doesn't JUnit provide assertNotEquals methods?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1464411">https://stackoverflow.com/a/1464411</a>
 */
public class APIzator1464411 {

  public static void provide() throws RuntimeException {
    assertThat(objectUnderTest, is(not(someOtherObject)));
    assertThat(objectUnderTest, not(someOtherObject));
    assertThat(objectUnderTest, not(equalTo(someOtherObject)));
  }
}
