package com.stackoverflow.api;

import com.google.gwt.user.client.rpc.core.java.util.Arrays;
import java.io.File;
import java.io.FilenameFilter;

/**
 * Java, List only subdirectories from a directory, not files
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/5125258">https://stackoverflow.com/a/5125258</a>
 */
public class APIzator5125258 {

  public static String subdirectorie() throws RuntimeException {
    File file = new File("/path/to/directory");
    String[] directories = file.list(
      new FilenameFilter() {

        @Override
        public boolean accept(File current, String name) {
          return new File(current, name).isDirectory();
        }
      }
    );
    return Arrays.toString(directories);
  }
}
