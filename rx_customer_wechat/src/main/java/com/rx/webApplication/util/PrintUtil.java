package com.rx.webApplication.util;

import com.google.gson.Gson;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

/**
 * Created by 王玉粮 on 2017/6/27.
 * servlet输出工具类
 */
public class PrintUtil {
    Log log = LogFactory.getLog("REQUEST");
    public final String encoding = "UTF-8";
    Gson gson = new Gson();

    //输出字符砖
    public void StringPrint(HttpServletResponse response,String s) throws IOException{
        response.setCharacterEncoding(encoding);
        PrintWriter out = response.getWriter();
        out.print(s);
        out.flush();
        out.close();;
        log.info("响应的消息："+s);
    }

    //输出json数据
    public void StringPrint(HttpServletResponse response, HashMap<Object,Object> map) throws IOException{
        String s = gson.toJson(map);
        StringPrint(response,s);
    }
}
