package com.stackoverflow.api;

import java.util.List;

/**
 * How to use subList()
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/12099759">https://stackoverflow.com/a/12099759</a>
 */
public class APIzator12099759 {

  public static void use(List dataList) throws RuntimeException {
    dataList =
      dataList.subList(30, 38 > dataList.size() ? dataList.size() : 38);
  }
}
