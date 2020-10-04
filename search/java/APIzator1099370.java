package com.stackoverflow.api;

import com.impossibl.postgres.system.procs.Paths;

/**
 * What's the difference between getPath(), getAbsolutePath(), and getCanonicalPath() in Java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1099370">https://stackoverflow.com/a/1099370</a>
 */
public class APIzator1099370 {

  public static String be(
    String canonical_path_string,
    String absolute_path_string
  )
    throws RuntimeException {
    System.out.println(Paths.get(canonical_path_string).getParent());
    return Paths.get(absolute_path_string).getParent();
  }
}
