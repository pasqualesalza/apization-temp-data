package com.stackoverflow.api;

import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

/**
 * Using Mockito with multiple calls to the same method with the same arguments
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/8088220">https://stackoverflow.com/a/8088220</a>
 */
public class APIzator8088220 {

  public static void useMockito() throws RuntimeException {
    when(someMock.someMethod())
      .thenAnswer(
        new Answer() {
          private int count = 0;

          public Object answer(InvocationOnMock invocation) {
            if (count++ == 1) return 1;
            return 2;
          }
        }
      );
    doAnswer(
      new Answer() {
        private int count = 0;

        public Object answer(InvocationOnMock invocation) {
          if (count++ == 1) return 1;
          return 2;
        }
      }
    )
      .when(someMock)
      .someMethod();
  }
}
