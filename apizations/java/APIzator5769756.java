package com.stackoverflow.api;

import com.amazonaws.util.IOUtils;
import java.io.InputStream;
import java.net.URLConnection;

/**
 * How can I get an http response body as a string in Java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/5769756">https://stackoverflow.com/a/5769756</a>
 */
public class APIzator5769756 {

  public static String getBody() throws RuntimeException {
    URL url = new URL("http://www.example.com/");
    URLConnection con = url.openConnection();
    InputStream in = con.getInputStream();
    String encoding = con.getContentEncoding();
    encoding = encoding == null ? "UTF-8" : encoding;
    String body = IOUtils.toString(in, encoding);
    return body;
  }
}
