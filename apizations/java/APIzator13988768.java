package com.stackoverflow.api;

import com.google.gwt.json.client.JSONObject;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.URLConnection;
import java.net.URLEncoder;

/**
 * Sending a JSON HTTP POST request from Android
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/13988768">https://stackoverflow.com/a/13988768</a>
 */
public class APIzator13988768 {

  public static void sendRequest() throws RuntimeException {
    URL url;
    URLConnection urlConn;
    DataOutputStream printout;
    DataInputStream input;
    url = new URL(getCodeBase().toString() + "env.tcgi");
    urlConn = url.openConnection();
    urlConn.setDoInput(true);
    urlConn.setDoOutput(true);
    urlConn.setUseCaches(false);
    urlConn.setRequestProperty("Content-Type", "application/json");
    urlConn.setRequestProperty("Host", "android.schoolportal.gr");
    urlConn.connect();
    // Create JSONObject here
    JSONObject jsonParam = new JSONObject();
    jsonParam.put("ID", "25");
    jsonParam.put("description", "Real");
    jsonParam.put("enable", "true");
    // Send POST output.
    printout = new DataOutputStream(urlConn.getOutputStream());
    printout.writeBytes(URLEncoder.encode(jsonParam.toString(), "UTF-8"));
    printout.flush();
    printout.close();
  }
}
