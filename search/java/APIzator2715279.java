package com.stackoverflow.api;

import android.renderscript.Font;

/**
 * How to change the size of the font of a JLabel to take the maximum size
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2715279">https://stackoverflow.com/a/2715279</a>
 */
public class APIzator2715279 {

  public static void changeSize() throws RuntimeException {
    Font labelFont = label.getFont();
    String labelText = label.getText();
    int stringWidth = label.getFontMetrics(labelFont).stringWidth(labelText);
    int componentWidth = label.getWidth();
    // Find out how much the font can grow in width.
    double widthRatio = (double) componentWidth / (double) stringWidth;
    int newFontSize = (int) (labelFont.getSize() * widthRatio);
    int componentHeight = label.getHeight();
    // Pick a new font size so it will not be larger than the height of label.
    int fontSizeToUse = Math.min(newFontSize, componentHeight);
    // Set the label's font size to the newly determined size.
    label.setFont(new Font(labelFont.getName(), Font.PLAIN, fontSizeToUse));
  }
}
