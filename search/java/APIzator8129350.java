package com.stackoverflow.api;

import com.amazonaws.util.NameValuePair;
import java.util.ArrayList;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

/**
 * How to use parameters with HttpPost
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/8129350">https://stackoverflow.com/a/8129350</a>
 */
public class APIzator8129350 {

  public static HttpResponse useParameter() throws RuntimeException {
    HttpClient httpclient;
    HttpPost httppost;
    ArrayList<NameValuePair> postParameters;
    httpclient = new DefaultHttpClient();
    httppost = new HttpPost("your login link");
    postParameters = new ArrayList<NameValuePair>();
    postParameters.add(new BasicNameValuePair("param1", "param1_value"));
    postParameters.add(new BasicNameValuePair("param2", "param2_value"));
    httpPost.setEntity(new UrlEncodedFormEntity(postParameters, "UTF-8"));
    return httpclient.execute(httpPost);
  }
}
