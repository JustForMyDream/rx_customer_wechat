package com.rx.webApplication.controller;

import com.google.gson.Gson;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Created by 王玉粮 on 2017/7/3.
 */
@Controller
@RequestMapping("test")
public class TestController {

    @RequestMapping("my")
    public void test(HttpServletRequest request, HttpServletResponse response){
        try {
            Map<String,Object> map = new HashMap<>();
            response.setCharacterEncoding("UTF-8");
            response.setContentType("text/html;charset=UTF-8");
            map.put("msg","哈哈哈");
            Gson gson = new Gson();
            gson.toJson(map);
            response.getWriter().print( gson.toJson(map));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("clxx")
    public String test2(){
        return "zichanXX_FCXX";
    }





}
