package com.stackoverflow.api;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Pattern;

/**
 * How to check if a string contains only digits in Java
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/15111450">https://stackoverflow.com/a/15111450</a>
 */
public class APIzator15111450 {

  public static String check(String regex, String regex, String regex)
    throws RuntimeException {
    // positive test cases, should all be "true"
    System.out.println("1".matches(regex));
    System.out.println("12345".matches(regex));
    System.out.println("123456789".matches(regex));
    // negative test cases, should all be "false"
    System.out.println("".matches(regex));
    System.out.println("foo".matches(regex));
    System.out.println("aa123bb".matches(regex));
    Pattern pattern = Pattern.compile(regex);
    System.out.println(pattern.matcher("1").matches());
    System.out.println(pattern.matcher("12345").matches());
    return pattern.matcher("123456789").matches();
  }
}
