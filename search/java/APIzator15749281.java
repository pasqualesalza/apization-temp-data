package com.stackoverflow.api;

import org.omg.CORBA.portable.InputStream;

/**
 * How do I load a file from resource folder?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/15749281">https://stackoverflow.com/a/15749281</a>
 */
public class APIzator15749281 {

  public static void loadFile() throws RuntimeException {
    ClassLoader classloader = Thread.currentThread().getContextClassLoader();
    InputStream is = classloader.getResourceAsStream("test.csv");
    // java.net.URL
    URL url = ClassLoaderUtil.getResource("test.csv", YourCallingClass.class);
    Path path = Paths.get(url.toURI());
    List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
    // java.io.InputStream
    InputStream inputStream = ClassLoaderUtil.getResourceAsStream(
      "test.csv",
      YourCallingClass.class
    );
    InputStreamReader streamReader = new InputStreamReader(
      inputStream,
      StandardCharsets.UTF_8
    );
    BufferedReader reader = new BufferedReader(streamReader);
    for (String line; (line = reader.readLine()) != null;) {
      // Process line
    }
  }
}
