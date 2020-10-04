package com.stackoverflow.api;

import com.google.appengine.repackaged.com.google.type.proto1api.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.aspectj.weaver.ast.Test;

/**
 * Java: unparseable date exception
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2009224">https://stackoverflow.com/a/2009224</a>
 */
public class APIzator2009224 {

  private String modifyDateLayout(String inputDate) throws ParseException {
    Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z").parse(inputDate);
    return new SimpleDateFormat("dd.MM.yyyy HH:mm:ss").format(date);
  }

  public static String java(String inputDate) throws Exception {
    String newDate = new Test().modifyDateLayout(inputDate);
    return newDate;
  }
}
