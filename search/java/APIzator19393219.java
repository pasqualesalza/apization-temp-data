package com.stackoverflow.api;

import javax.xml.soap.Name;

/**
 * How can I add a space in between two outputs?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/19393219">https://stackoverflow.com/a/19393219</a>
 */
public class APIzator19393219 {

  public static void displayCustomerInfo() {
    System.out.println(Name + " " + Income);
    // or a tab
    System.out.println(Name + "\t" + Income);
  }
}
