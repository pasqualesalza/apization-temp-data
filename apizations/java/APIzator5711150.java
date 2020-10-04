package com.stackoverflow.api;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * java runtime.getruntime() getting output from executing a command line program
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/5711150">https://stackoverflow.com/a/5711150</a>
 */
public class APIzator5711150 {

  public static void getOutput(String[] commands) throws RuntimeException {
    Runtime rt = Runtime.getRuntime();
    Process proc = rt.exec(commands);
    BufferedReader stdInput = new BufferedReader(
      new InputStreamReader(proc.getInputStream())
    );
    BufferedReader stdError = new BufferedReader(
      new InputStreamReader(proc.getErrorStream())
    );
    // read the output from the command
    System.out.println("Here is the standard output of the command:\n");
    String s = null;
    while ((s = stdInput.readLine()) != null) {
      System.out.println(s);
    }
    // read any errors from the attempted command
    System.out.println("Here is the standard error of the command (if any):\n");
    while ((s = stdError.readLine()) != null) {
      System.out.println(s);
    }
  }
}
