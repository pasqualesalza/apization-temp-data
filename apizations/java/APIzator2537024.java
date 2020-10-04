package com.stackoverflow.api;

import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

/**
 * How can I set size of a button?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2537024">https://stackoverflow.com/a/2537024</a>
 */
public class APIzator2537024 {

  public static void setSize() throws RuntimeException {
    JFrame frame = new JFrame("test");
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    JPanel panel = new JPanel(new GridLayout(4, 4, 4, 4));
    for (int i = 0; i < 16; i++) {
      JButton btn = new JButton(String.valueOf(i));
      btn.setPreferredSize(new Dimension(40, 40));
      panel.add(btn);
    }
    frame.setContentPane(panel);
    frame.pack();
    frame.setVisible(true);
    JFrame frame = new JFrame("Colored Trails");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JPanel mainPanel = new JPanel();
    mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
    JPanel firstPanel = new JPanel();
    firstPanel.setLayout(new GridLayout(4, 4));
    firstPanel.setMaximumSize(new Dimension(400, 400));
    JButton btn;
    for (int i = 1; i <= 4; i++) {
      for (int j = 1; j <= 4; j++) {
        btn = new JButton();
        btn.setPreferredSize(new Dimension(100, 100));
        firstPanel.add(btn);
      }
    }
    JPanel secondPanel = new JPanel();
    secondPanel.setLayout(new GridLayout(5, 13));
    secondPanel.setMaximumSize(new Dimension(520, 200));
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= 13; j++) {
        btn = new JButton();
        btn.setPreferredSize(new Dimension(40, 40));
        secondPanel.add(btn);
      }
    }
    mainPanel.add(firstPanel);
    mainPanel.add(secondPanel);
    frame.setContentPane(mainPanel);
    frame.setSize(520, 600);
    frame.setMinimumSize(new Dimension(520, 600));
    frame.setVisible(true);
  }
}
