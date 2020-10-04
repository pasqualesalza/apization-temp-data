package com.stackoverflow.api;

import java.io.File;
import java.io.FileInputStream;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.MultipartEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.entity.mime.content.StringBody;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClients;

/**
 * How can I make a multipart/form-data POST request using Java?
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/1379002">https://stackoverflow.com/a/1379002</a>
 */
public class APIzator1379002 {

  public static HttpEntity makeRequest() throws RuntimeException {
    CloseableHttpClient httpClient = HttpClients.createDefault();
    HttpPost uploadFile = new HttpPost("...");
    MultipartEntityBuilder builder = MultipartEntityBuilder.create();
    builder.addTextBody("field1", "yes", ContentType.TEXT_PLAIN);
    // This attaches the file to the POST:
    File f = new File("[/path/to/upload]");
    builder.addBinaryBody(
      "file",
      new FileInputStream(f),
      ContentType.APPLICATION_OCTET_STREAM,
      f.getName()
    );
    HttpEntity multipart = builder.build();
    uploadFile.setEntity(multipart);
    CloseableHttpResponse response = httpClient.execute(uploadFile);
    HttpEntity responseEntity = response.getEntity();
    HttpClient httpclient = new DefaultHttpClient();
    HttpPost httppost = new HttpPost(url);
    FileBody bin = new FileBody(new File(fileName));
    StringBody comment = new StringBody("Filename: " + fileName);
    MultipartEntity reqEntity = new MultipartEntity();
    reqEntity.addPart("bin", bin);
    reqEntity.addPart("comment", comment);
    httppost.setEntity(reqEntity);
    HttpResponse response = httpclient.execute(httppost);
    return response.getEntity();
  }
}
