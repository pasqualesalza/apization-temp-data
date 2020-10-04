package com.stackoverflow.api;

import java.io.FileOutputStream;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

/**
 * How to download and save a file from Internet using Java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/921400">https://stackoverflow.com/a/921400</a>
 */
public class APIzator921400 {

  public static void download() throws RuntimeException {
    URL website = new URL("http://www.website.com/information.asp");
    ReadableByteChannel rbc = Channels.newChannel(website.openStream());
    FileOutputStream fos = new FileOutputStream("information.html");
    fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
  }
}
