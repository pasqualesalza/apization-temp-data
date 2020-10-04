package com.stackoverflow.api;

/**
 * What is InputStream & Output Stream? Why and when do we use them?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1830783">https://stackoverflow.com/a/1830783</a>
 */
public class APIzator1830783 {

  public static void be() throws RuntimeException {
    int i;
    while ((i = instr.read()) != -1) {
      osstr.write(i);
    }
    instr.close();
    osstr.close();
  }
}
