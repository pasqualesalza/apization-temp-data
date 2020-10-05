package com.stackoverflow.api;

import com.google.gwt.user.client.rpc.core.java.util.Arrays;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Execute external program in java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/13991171">https://stackoverflow.com/a/13991171</a>
 */
public class APIzator13991171 {

  public static void executeProgram() throws RuntimeException {
    Process process = new ProcessBuilder(
      "C:\\PathToExe\\MyExe.exe",
      "param1",
      "param2"
    )
      .start();
    InputStream is = process.getInputStream();
    InputStreamReader isr = new InputStreamReader(is);
    BufferedReader br = new BufferedReader(isr);
    String line;
    System.out.printf("Output of running %s is:", Arrays.toString(args));
    while ((line = br.readLine()) != null) {
      System.out.println(line);
    }
  }
}
