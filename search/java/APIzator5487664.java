package com.stackoverflow.api;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Changing the JFrame title
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/5487664">https://stackoverflow.com/a/5487664</a>
 */
public class APIzator5487664 {
  JTextField poolLengthText, poolWidthText, poolDepthText, poolVolumeText, hotTub, hotTubLengthText, hotTubWidthText, hotTubDepthText, hotTubVolumeText, temp, results, newTitle;

  public static void createOptions() {
    options = new JPanel();
    options.setLayout(null);
    JLabel labelOptions = new JLabel("Change Company Name:");
    labelOptions.setBounds(120, 10, 150, 20);
    options.add(labelOptions);
    newTitle = new JTextField("Some Title");
    newTitle.setBounds(80, 40, 225, 20);
    options.add(newTitle);
    // myTitle = new JTextField("My Title...");
    // myTitle.setBounds(80, 40, 225, 20);
    // myTitle.add(labelOptions);
    JButton newName = new JButton("Set New Name");
    newName.setBounds(60, 80, 150, 20);
    newName.addActionListener(this);
    options.add(newName);
    JButton Exit = new JButton("Exit");
    Exit.setBounds(250, 80, 80, 20);
    Exit.addActionListener(this);
    options.add(Exit);
  }

  private void New_Name() {
    this.setTitle(newTitle.getText());
  }
}
