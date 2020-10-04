package com.stackoverflow.api;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;

/**
 * Get generic type of java.util.List
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1942680">https://stackoverflow.com/a/1942680</a>
 */
public class APIzator1942680 {

  public class Test {
    List<String> stringList = new ArrayList<String>();

    List<Integer> integerList = new ArrayList<Integer>();

    public static Class<?> getType() throws Exception {
      Field stringListField = Test.class.getDeclaredField("stringList");
      ParameterizedType stringListType = (ParameterizedType) stringListField.getGenericType();
      Class<?> stringListClass = (Class<?>) stringListType.getActualTypeArguments()[0];
      // class java.lang.String.
      System.out.println(stringListClass);
      Field integerListField = Test.class.getDeclaredField("integerList");
      ParameterizedType integerListType = (ParameterizedType) integerListField.getGenericType();
      Class<?> integerListClass = (Class<?>) integerListType.getActualTypeArguments()[0];
      return integerListClass;
    }
  }
}
