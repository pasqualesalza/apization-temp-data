package com.stackoverflow.api;

/**
 * What is the easiest way to parse an INI file in Java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/190633">https://stackoverflow.com/a/190633</a>
 */
public class APIzator190633 {

  public static String be() throws RuntimeException {
    Ini ini = new Ini(new File(filename));
    java.util.prefs.Preferences prefs = new IniPreferences(ini);
    return prefs.node("grumpy").get("homePage", null);
  }
}
