package com.rx.webApplication.util;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by cccxt on 2016/10/28.
 */
public class ResponseUtil {
    public static void response(HttpServletResponse response,String content){
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        try {
            response.getWriter().print(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
