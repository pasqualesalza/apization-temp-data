package com.stackoverflow.api;

/**
 * Are "while(true)" loops so bad?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/6850411">https://stackoverflow.com/a/6850411</a>
 */
public class APIzator6850411 {

  public static void be() throws RuntimeException {
    while (true) {
      doStuffNeededAtStartOfLoop();
      int input = getSomeInput();
      if (testCondition(input)) {
        break;
      }
      actOnInput(input);
    }
    boolean running = true;
    while (running) {
      doStuffNeededAtStartOfLoop();
      int input = getSomeInput();
      if (testCondition(input)) {
        running = false;
      } else {
        actOnInput(input);
      }
    }
  }
}
