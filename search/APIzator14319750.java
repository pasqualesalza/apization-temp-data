package com.stackoverflow.api;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

/**
 * How to copy a java.util.List into another java.util.List
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/14319750">https://stackoverflow.com/a/14319750</a>
 */
public class APIzator14319750 {

  public static List<SomeBean> copyJavautil() throws RuntimeException {
    return new ArrayList<SomeBean>(otherList);
  }
}
