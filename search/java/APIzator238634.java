package com.stackoverflow.api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;

/**
 * How do you Programmatically Download a Webpage in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/238634">https://stackoverflow.com/a/238634</a>
 */
public class APIzator238634 {

  public static void downloadWebpage() {
    URL url;
    InputStream is = null;
    BufferedReader br;
    String line;
    try {
      url = new URL("http://stackoverflow.com/");
      // throws an IOException
      is = url.openStream();
      br = new BufferedReader(new InputStreamReader(is));
      while ((line = br.readLine()) != null) {
        System.out.println(line);
      }
    } catch (MalformedURLException mue) {
      mue.printStackTrace();
    } catch (IOException ioe) {
      ioe.printStackTrace();
    } finally {
      try {
        if (is != null) is.close();
      } catch (IOException ioe) {
        // nothing to see here
      }
    }
  }
}
