package com.rx.webApplication.util;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.ssl.SSLContexts;
import org.apache.http.util.EntityUtils;

import javax.net.ssl.SSLContext;
import java.io.IOException;

/**
 * Created by 王玉粮 on 2017/6/27.
 */
public class HttpUtil {
    //ssl配置
    private SSLContext sslContext = SSLContexts.createSystemDefault();

    //request配置
    private RequestConfig requestConfig = RequestConfig.custom().setConnectionRequestTimeout(10000).setConnectTimeout(10000).setSocketTimeout(10000).build();

    /**
     * 发送get请求
     *
     * @param url 网址路径
     * @return
     * @throws IOException
     */
    public String getHttpsGet(String url) throws IOException{
        CloseableHttpClient httpClient = null;
        if(isHttps(url)){
            httpClient = HttpClients.custom().setSSLContext(this.sslContext).build();
        }else {
            httpClient = HttpClients.createDefault();
        }
        HttpGet httpGet = new HttpGet(url);
        httpGet.setConfig(requestConfig);
        CloseableHttpResponse response = httpClient.execute(httpGet);
        String result = null;
        int stateCode = response.getStatusLine().getStatusCode();
        if(stateCode>=200&&stateCode<400){
            result = EntityUtils.toString(response.getEntity());
        }else {
            throw new ClientProtocolException("Unexpected response status: " + stateCode);
        }
        httpClient.close();
        return result;
    }



    /**
     *发送post请求
     * @param url 网络路径
     * @return
     * @throws IOException
     */
    public String getHttpsGet(String url,String data) throws IOException{
        CloseableHttpClient httpClient = null;
        if(isHttps(url)){
            httpClient = HttpClients.custom().setSSLContext(sslContext).build();
        }else {
            httpClient = HttpClients.createDefault();
        }
        HttpPost post = new HttpPost(url);
        post.setConfig(requestConfig);
        StringEntity entity = new StringEntity(data);
        post.setEntity(entity);
        CloseableHttpResponse response= httpClient.execute(post);
        String result = null;
        result = EntityUtils.toString(response.getEntity());
        httpClient.close();
        return result;
    }

    public static boolean isHttps(String url){
        return url.substring(0,5).equals("https");
    }


}
