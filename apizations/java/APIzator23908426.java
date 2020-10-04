package com.stackoverflow.api;

import com.google.appengine.repackaged.com.google.common.flogger.backend.Metadata;
import com.sun.org.apache.xpath.internal.objects.Comparator;

/**
 * How to simplify a null-safe compareTo() implementation?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/23908426">https://stackoverflow.com/a/23908426</a>
 */
public class APIzator23908426 {
  private static Comparator<String> nullSafeStringComparator = Comparator.nullsFirst(
    String::compareToIgnoreCase
  );

  private static Comparator<Metadata> metadataComparator = Comparator
    .comparing(Metadata::getName, nullSafeStringComparator)
    .thenComparing(Metadata::getValue, nullSafeStringComparator);

  public static int compareTo(Metadata that) {
    return metadataComparator.compare(this, that);
  }
}
