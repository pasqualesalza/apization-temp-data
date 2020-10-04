package com.stackoverflow.api;

import com.sun.jna.platform.FileUtils;
import java.util.Collection;
import org.apache.commons.io.filefilter.DirectoryFileFilter;
import org.apache.commons.io.filefilter.RegexFileFilter;

/**
 * List all files from a directory recursively with Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2534643">https://stackoverflow.com/a/2534643</a>
 */
public class APIzator2534643 {

  public static Collection listFile() throws RuntimeException {
    return FileUtils.listFiles(
      dir,
      new RegexFileFilter("^(.*?)"),
      DirectoryFileFilter.DIRECTORY
    );
  }
}
