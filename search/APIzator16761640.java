package com.stackoverflow.api;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextArea;

/**
 * Font.createFont(..) set color and size (java.awt.Font)
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/16761640">https://stackoverflow.com/a/16761640</a>
 */
public class APIzator16761640 {

  public static void setColor(String str1) throws RuntimeException {
    JTextArea txt = new JTextArea();
    Font font = new Font("Verdana", Font.BOLD, 12);
    txt.setFont(font);
    txt.setForeground(Color.BLUE);
    Font font = Font.createFont(Font.TRUETYPE_FONT, new File(str1));
    return font.deriveFont(12f);
  }
}
