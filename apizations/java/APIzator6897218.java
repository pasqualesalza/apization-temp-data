package com.stackoverflow.api;

import javax.swing.ImageIcon;

/**
 * How to correctly get image from 'Resources' folder in NetBeans
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/6897218">https://stackoverflow.com/a/6897218</a>
 */
public class APIzator6897218 {

  public static ImageIcon getImage(
    String pathToImageSortBy,
    String pathToImageSortBy
  )
    throws RuntimeException {
    ImageIcon SortByIcon = new ImageIcon(
      getClass().getClassLoader().getResource(pathToImageSortBy)
    );
    return new ImageIcon(
      getClass().getClassLoader().getResource(pathToImageSortBy)
    );
  }
}
