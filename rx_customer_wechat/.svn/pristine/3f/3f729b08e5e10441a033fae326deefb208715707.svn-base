package com.cxt.wechat.util;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.entity.mime.content.StringBody;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.ssl.SSLContexts;
import org.apache.http.util.EntityUtils;

import javax.net.ssl.SSLContext;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * http工具类
 * Created by cccxt on 2016/7/5.
 */
public class HttpUtil {
    /*ssl配置*/
    protected SSLContext sslcontext = SSLContexts.createSystemDefault();

    /*request配置*/
    protected RequestConfig requestConfig = RequestConfig.custom().setConnectionRequestTimeout(10000).setConnectTimeout(10000).setSocketTimeout(10000).build();

    /**
     * 发送get请求
     *
     * @param url 网址路径
     * @return string返回值
     * @throws IOException
     */
    public String getHttpsGet(String url) throws IOException {
        CloseableHttpClient httpClient;
        if (isHttps(url)) {
            httpClient = HttpClients.custom().setSSLContext(sslcontext).build();
        } else {
            httpClient = HttpClients.createDefault();
        }
        HttpGet httpGet = new HttpGet(url);
        httpGet.setConfig(requestConfig);
        CloseableHttpResponse response = httpClient.execute(httpGet);
        String result;
        int stateCode = response.getStatusLine().getStatusCode();
        //如果状态码属于正常的范围
        if (stateCode >= 200 && stateCode < 400) {
            result = EntityUtils.toString(response.getEntity(), "utf-8");
        } else {
            throw new ClientProtocolException("Unexpected response status: " + stateCode);
        }
        httpClient.close();
        return result;
    }


    public byte[] getHttpsGet_byte(String url) throws IOException {
        CloseableHttpClient httpClient;
        if (isHttps(url)) {
            httpClient = HttpClients.custom().setSSLContext(sslcontext).build();
        } else {
            httpClient = HttpClients.createDefault();
        }
        HttpGet httpGet = new HttpGet(url);
        httpGet.setConfig(requestConfig);
        CloseableHttpResponse response = httpClient.execute(httpGet);
        byte[] result;
        int stateCode = response.getStatusLine().getStatusCode();
        //如果状态码属于正常的范围
        if (stateCode >= 200 && stateCode < 400) {
            result = EntityUtils.toByteArray(response.getEntity());
        } else {
            throw new ClientProtocolException("Unexpected response status: " + stateCode);
        }
        httpClient.close();
        return result;
    }

    /**
     * 发送post请求
     *
     * @param url  网址路径
     * @param data 数据字符串
     * @return string返回值
     * @throws IOException
     */
    public String getHttpsPost(String url, String data) throws IOException {
        CloseableHttpClient httpClient;
        if (isHttps(url)) {
            httpClient = HttpClients.custom().setSSLContext(sslcontext).build();
        } else {
            httpClient = HttpClients.createDefault();
        }
        HttpPost post = new HttpPost(url);
        post.setConfig(requestConfig);
        StringEntity entity = new StringEntity(data, "utf-8");
        post.setEntity(entity);
        CloseableHttpResponse response = httpClient.execute(post);
        String  result = EntityUtils.toString(response.getEntity(), "utf-8");
        httpClient.close();
        return result;
    }

    /**
     * 判断url请求是不是Https
     *
     * @param url url
     * @return 是http请求返回 true 否则返回 false
     */
    public static boolean isHttps(String url) {
        return url.substring(0, 5).equals("https");
    }

    /**
     * 发送post请求（表单形式）
     * @param url url
     * @param data  map类型数据
     * @return 数据
     * @throws IOException
     */
    public String getHttpsPost(String url, Map<String, String[]> data) throws IOException {
        CloseableHttpClient httpClient;
        if (isHttps(url)) {
            httpClient = HttpClients.custom().setSSLContext(sslcontext).build();
        } else {
            httpClient = HttpClients.createDefault();
        }
        HttpPost post = new HttpPost(url);
        post.setConfig(requestConfig);
        List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>();
        for (String keyset : data.keySet()) {
            String[] values = data.get(keyset);
            for (String s : values) {
                nameValuePairs.add(new BasicNameValuePair(keyset, s));
            }
        }
        post.setEntity(new UrlEncodedFormEntity(nameValuePairs));
        CloseableHttpResponse response = httpClient.execute(post);
        String result;
        result = EntityUtils.toString(response.getEntity(), "utf-8");
        httpClient.close();
        return result;
    }

    /**
     * 发送指定加密文件的httpPost请求
     * @param url url
     * @param body 数据体
     * @param keystoreFile 加密文件PKCS12
     * @param password 文件密码
     * @return
     */
    public String getHttpsPostCustom_package12(String url, String body, File keystoreFile, String password) {
        try {
            KeyStore keyStore = KeyStore.getInstance("PKCS12");
            FileInputStream instream = new FileInputStream(keystoreFile);
            keyStore.load(instream, password.toCharArray());//
            instream.close();
            // Trust own CA and all self-signed certs
            SSLContext sslcontext = SSLContexts.custom()
                    .loadKeyMaterial(keyStore, password.toCharArray())
                    .build();
            // Allow TLSv1 protocol only
            SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(
                    sslcontext,
                    new String[]{"TLSv1"},
                    null,
                    SSLConnectionSocketFactory.getDefaultHostnameVerifier());
            CloseableHttpClient httpclient = HttpClients.custom()
                    .setSSLSocketFactory(sslsf)
                    .build();
            HttpPost httpPost = new HttpPost(url);
            httpPost.setConfig(requestConfig);
            httpPost.setEntity(new StringEntity(body, "utf-8"));
            CloseableHttpResponse response = httpclient.execute(httpPost);
            String result;
            result = EntityUtils.toString(response.getEntity(), "utf-8");
            httpclient.close();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 以form-data格式发送文件或字符
     * @param url url
     * @param body 字符数据Map<String, String>
     * @param files 发送的文件Map<String, File>
     * @return 请求结果
     */
    public String getHttpsPostFile(String url, Map<String, String> body, Map<String, File> files) {
        CloseableHttpClient httpClient;
        if (isHttps(url)) {
            httpClient = HttpClients.custom().setSSLContext(sslcontext).build();
        } else {
            httpClient = HttpClients.createDefault();
        }
        HttpPost post = new HttpPost(url);
        MultipartEntityBuilder multipartEntityBuilder = MultipartEntityBuilder.create().setCharset(Charset.forName("utf-8"));
        if (body != null) {
            for (String key : body.keySet()) {
                multipartEntityBuilder.addPart(key, new StringBody(body.get(key), ContentType.TEXT_PLAIN));
            }
        }
        if (files != null) {
            for (String key : files.keySet()) {
                multipartEntityBuilder.addBinaryBody(key, files.get(key));
            }
        }
        HttpEntity reqEntity = multipartEntityBuilder.build();
        post.setConfig(requestConfig);
        post.setEntity(reqEntity);
        CloseableHttpResponse response = null;
        String result = null;
        try {
            response = httpClient.execute(post);
            result = EntityUtils.toString(response.getEntity(), "utf-8");
            httpClient.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 以form-data格式发送文件或字符
     * @param url url
     * @param files 发送的文件Map<String, File>
     * @return 请求结果
     */
    public String getHttpsPostFile(String url, Map<String, File> files) {
        return getHttpsPostFile(url, null, files);
    }
}
