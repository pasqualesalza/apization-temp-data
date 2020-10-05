package com.stackoverflow.api;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Java reading a file into an ArrayList?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/5343727">https://stackoverflow.com/a/5343727</a>
 */
public class APIzator5343727 {

  public static void readFile() throws RuntimeException {
    Scanner s = new Scanner(new File("filepath"));
    ArrayList<String> list = new ArrayList<String>();
    while (s.hasNext()) {
      list.add(s.next());
    }
    s.close();
  }
}
