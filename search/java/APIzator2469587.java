package com.stackoverflow.api;

import com.google.appengine.repackaged.com.google.common.io.Files;
import java.io.File;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URLConnection;

/**
 * Upload files from Java client to a HTTP server
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/2469587">https://stackoverflow.com/a/2469587</a>
 */
public class APIzator2469587 {

  public static int file(
    String url,
    String charset,
    String param,
    String CRLF,
    String str1
  )
    throws RuntimeException {
    File textFile = new File(str1);
    File binaryFile = new File("/path/to/file.bin");
    // Just generate some unique random value.
    String boundary = Long.toHexString(System.currentTimeMillis());
    URLConnection connection = new URL(url).openConnection();
    connection.setDoOutput(true);
    connection.setRequestProperty(
      "Content-Type",
      "multipart/form-data; boundary=" + boundary
    );
    try (
      OutputStream output = connection.getOutputStream();
      PrintWriter writer = new PrintWriter(
        new OutputStreamWriter(output, charset),
        true
      )
    ) {
      // Send normal param.
      writer.append("--" + boundary).append(CRLF);
      writer
        .append("Content-Disposition: form-data; name=\"param\"")
        .append(CRLF);
      writer
        .append("Content-Type: text/plain; charset=" + charset)
        .append(CRLF);
      writer.append(CRLF).append(param).append(CRLF).flush();
      // Send text file.
      writer.append("--" + boundary).append(CRLF);
      writer
        .append(
          "Content-Disposition: form-data; name=\"textFile\"; filename=\"" +
          textFile.getName() +
          "\""
        )
        .append(CRLF);
      // Text file itself must be saved in this charset!
      writer
        .append("Content-Type: text/plain; charset=" + charset)
        .append(CRLF);
      writer.append(CRLF).flush();
      Files.copy(textFile.toPath(), output);
      // Important before continuing with writer!
      output.flush();
      // CRLF is important! It indicates end of boundary.
      writer.append(CRLF).flush();
      // Send binary file.
      writer.append("--" + boundary).append(CRLF);
      writer
        .append(
          "Content-Disposition: form-data; name=\"binaryFile\"; filename=\"" +
          binaryFile.getName() +
          "\""
        )
        .append(CRLF);
      writer
        .append(
          "Content-Type: " +
          URLConnection.guessContentTypeFromName(binaryFile.getName())
        )
        .append(CRLF);
      writer.append("Content-Transfer-Encoding: binary").append(CRLF);
      writer.append(CRLF).flush();
      Files.copy(binaryFile.toPath(), output);
      // Important before continuing with writer!
      output.flush();
      // CRLF is important! It indicates end of boundary.
      writer.append(CRLF).flush();
      // End of multipart/form-data.
      writer.append("--" + boundary + "--").append(CRLF).flush();
    }
    // Request is lazily fired whenever you need to obtain information about response.
    int responseCode = ((HttpURLConnection) connection).getResponseCode();
    return responseCode;
  }
}
