package com.cxt.wechat.media;

import com.cxt.wechat.util.HttpUtil;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * Created by cccxt on 2016/8/3.
 */
public class MediaUtil extends HttpUtil {
    Log log = LogFactory.getLog("MEDIA");

    String GETMEDIA = "https://api.weixin.qq.com/cgi-bin/media/get?access_token=ACCESS_TOKEN&media_id=MEDIA_ID";

    public InputStream getMedia(String ACCESS_TOKEN, String MEDIA_ID) {
        String url = GETMEDIA.replace("MEDIA_ID",MEDIA_ID).replace("ACCESS_TOKEN",ACCESS_TOKEN);
        CloseableHttpClient httpClient;
        if (isHttps(url)) {
            httpClient = HttpClients.custom().setSSLContext(sslcontext).build();
        } else {
            httpClient = HttpClients.createDefault();
        }
        HttpGet httpGet = new HttpGet(url);
        httpGet.setConfig(requestConfig);
        CloseableHttpResponse response = null;
        InputStream inputStream = null;
        try {
            response = httpClient.execute(httpGet);
            String result;
            int stateCode = response.getStatusLine().getStatusCode();
            //如果状态码属于正常的范围
            if (stateCode >= 200 && stateCode < 400) {
                inputStream=response.getEntity().getContent();
            } else {
                throw new ClientProtocolException("Unexpected response status: " + stateCode);
            }
            httpClient.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return inputStream;
    }

    public void getMedia(String ACCESS_TOKEN, String MEDIA_ID,MediaOperate operate){
        String url = GETMEDIA.replace("MEDIA_ID",MEDIA_ID).replace("ACCESS_TOKEN",ACCESS_TOKEN);
        CloseableHttpClient httpClient;
        if (isHttps(url)) {
            httpClient = HttpClients.custom().setSSLContext(sslcontext).build();
        } else {
            httpClient = HttpClients.createDefault();
        }
        HttpGet httpGet = new HttpGet(url);
        httpGet.setConfig(requestConfig);
        CloseableHttpResponse response = null;
        InputStream inputStream = null;
        try {
            response = httpClient.execute(httpGet);
            String result;
            int stateCode = response.getStatusLine().getStatusCode();
            //如果状态码属于正常的范围
            if (stateCode >= 200 && stateCode < 400) {
                inputStream=response.getEntity().getContent();
                operate.InputstreamOperate(inputStream);
            } else {
                throw new ClientProtocolException("Unexpected response status: " + stateCode);
            }
            httpClient.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void saveTo(InputStream in, OutputStream out) throws Exception {
        byte[] data = new byte[1024*1024];
        int index =0;
        while ((index=in.read(data) )!= -1) {
            out.write(data,0,index);
        }
        in.close();
        out.close();
    }
}
