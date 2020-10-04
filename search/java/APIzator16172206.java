package com.stackoverflow.api;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;
import org.postgresql.core.Field;

/**
 * Java reflection: how to get field value from an object, not knowing its class
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/16172206">https://stackoverflow.com/a/16172206</a>
 */
public class APIzator16172206 {

  public static void reflection() throws RuntimeException {
    // from your method
    List list;
    for (Object x : list) {
      Class<?> clazz = x.getClass();
      // Note, this can throw an exception if the field doesn't exist.
      Field field = clazz.getField("fieldName");
      Object fieldValue = field.get(x);
    }
    // From your method
    List<Foo> list;
    for (Foo foo : list) {
      Object fieldValue = foo.fieldName;
    }
    List list;
    for (Object x : list) {
      if (x instanceof Foo) {
        Object fieldValue = ((Foo) x).fieldName;
      }
    }
  }
}
