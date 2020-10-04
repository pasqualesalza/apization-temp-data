package com.stackoverflow.api;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * How to get a list of current open windows/process with Java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/54950">https://stackoverflow.com/a/54950</a>
 */
public class APIzator54950 {

  public static Process getList() throws RuntimeException {
    try {
      String line;
      Process p = Runtime.getRuntime().exec("ps -e");
      BufferedReader input = new BufferedReader(
        new InputStreamReader(p.getInputStream())
      );
      while ((line = input.readLine()) != null) {
        // <-- Parse data here.
        System.out.println(line);
      }
      input.close();
    } catch (Exception err) {
      err.printStackTrace();
    }
    return Runtime
      .getRuntime()
      .exec(System.getenv("windir") + "\\system32\\" + "tasklist.exe");
  }
}
