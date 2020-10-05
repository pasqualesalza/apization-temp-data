package com.stackoverflow.api;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;
import com.sun.javaws.Launcher;
import java.net.URISyntaxException;
import java.util.Enumeration;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

/**
 * How can I get a resource "Folder" from inside my jar File?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/20073154">https://stackoverflow.com/a/20073154</a>
 */
public class APIzator20073154 {

  public static void getFolder(String path) throws RuntimeException {
    final File jarFile = new File(
      getClass().getProtectionDomain().getCodeSource().getLocation().getPath()
    );
    if (jarFile.isFile()) {
      // Run with JAR file
      final JarFile jar = new JarFile(jarFile);
      // gives ALL entries in jar
      final Enumeration<JarEntry> entries = jar.entries();
      while (entries.hasMoreElements()) {
        final String name = entries.nextElement().getName();
        if (name.startsWith(path + "/")) {
          // filter according to the path
          System.out.println(name);
        }
      }
      jar.close();
    } else {
      // Run with IDE
      final URL url = Launcher.class.getResource("/" + path);
      if (url != null) {
        try {
          final File apps = new File(url.toURI());
          for (File app : apps.listFiles()) {
            System.out.println(app);
          }
        } catch (URISyntaxException ex) {
          // never happens
        }
      }
    }
  }
}
