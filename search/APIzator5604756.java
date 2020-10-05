package com.stackoverflow.api;

/**
 * Java Programming: call an exe from Java and passing parameters
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/5604756">https://stackoverflow.com/a/5604756</a>
 */
public class APIzator5604756 {

  public static Process callExe() throws RuntimeException {
    return new ProcessBuilder("C:\\PathToExe\\MyExe.exe", "param1", "param2")
      .start();
  }
}
