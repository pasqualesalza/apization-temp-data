package com.stackoverflow.api;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Collection;

/**
 * How to scan a folder in Java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/189739">https://stackoverflow.com/a/189739</a>
 */
public class APIzator189739 {

  public static Collection<File> scanFolder() {
    Collection<File> all = new ArrayList<File>();
    addTree(new File("."), all);
    return all;
  }

  static void addTree(File file, Collection<File> all) {
    File[] children = file.listFiles();
    if (children != null) {
      for (File child : children) {
        all.add(child);
        addTree(child, all);
      }
    }
  }

  static void addTree(Path directory, Collection<Path> all) throws IOException {
    try (DirectoryStream<Path> ds = Files.newDirectoryStream(directory)) {
      for (Path child : ds) {
        all.add(child);
        if (Files.isDirectory(child)) {
          addTree(child, all);
        }
      }
    }
  }

  static void addTree(Path directory, final Collection<Path> all)
    throws IOException {
    Files.walkFileTree(
      directory,
      new SimpleFileVisitor<Path>() {

        @Override
        public FileVisitResult visitFile(Path file, BasicFileAttributes attrs)
          throws IOException {
          all.add(file);
          return FileVisitResult.CONTINUE;
        }
      }
    );
  }
}
