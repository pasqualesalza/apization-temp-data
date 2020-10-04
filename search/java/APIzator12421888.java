package com.stackoverflow.api;

import android.os.Environment;
import android.widget.TextView;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * How can I read a text file in Android?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/12421888">https://stackoverflow.com/a/12421888</a>
 */
public class APIzator12421888 {

  public static void readFile(String str1) throws RuntimeException {
    // Find the directory for the SD Card using the API
    // *Don't* hardcode "/sdcard"
    File sdcard = Environment.getExternalStorageDirectory();
    // Get the text file
    File file = new File(sdcard, str1);
    // Read text from file
    StringBuilder text = new StringBuilder();
    try {
      BufferedReader br = new BufferedReader(new FileReader(file));
      String line;
      while ((line = br.readLine()) != null) {
        text.append(line);
        text.append('\n');
      }
      br.close();
    } catch (IOException e) {
      // You'll need to add proper error handling here
    }
    // Find the view by its id
    TextView tv = (TextView) findViewById(R.id.text_view);
    // Set the text
    tv.setText(text.toString());
  }
}
