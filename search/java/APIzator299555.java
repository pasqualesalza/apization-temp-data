package com.stackoverflow.api;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 * How to add an image to a JPanel?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/299555">https://stackoverflow.com/a/299555</a>
 */
public class APIzator299555 {

  public class ImagePanel extends JPanel {
    private BufferedImage image;

    public ImagePanel() {
      try {
        image = ImageIO.read(new File("image name and path"));
      } catch (IOException ex) {
        // handle exception...
      }
    }

    @Override
    public protected static void paintComponent(Graphics g) {
      super.paintComponent(g);
      // see javadoc for more info on the parameters
      g.drawImage(image, 0, 0, this);
    }
  }
}
