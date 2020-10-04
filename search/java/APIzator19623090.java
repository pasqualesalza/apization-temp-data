package com.stackoverflow.api;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;

/**
 * CreateProcess error=2, The system cannot find the file specified
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/19623090">https://stackoverflow.com/a/19623090</a>
 */
public class APIzator19623090 {

  public static Process find() throws RuntimeException {
    p = r.exec("C:/Program Files/WinRAR/winrar x h:\\myjar.jar *.* h:\\new");
    ProcessBuilder pb = new ProcessBuilder(
      "C:/Program Files/WinRAR/winrar",
      "x",
      "myjar.jar",
      "*.*",
      "new"
    );
    pb.directory(new File("H:/"));
    pb.redirectErrorStream(true);
    return pb.start();
  }
}
