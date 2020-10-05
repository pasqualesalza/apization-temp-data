package com.stackoverflow.api;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 * How to add row in JTable?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/3549341">https://stackoverflow.com/a/3549341</a>
 */
public class APIzator3549341 {

  public static void addRow(JTable table) throws RuntimeException {
    DefaultTableModel model = (DefaultTableModel) table.getModel();
    model.addRow(new Object[] { "Column 1", "Column 2", "Column 3" });
  }
}
