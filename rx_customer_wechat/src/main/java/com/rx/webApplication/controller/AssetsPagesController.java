package com.rx.webApplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by 王玉粮 on 2017/7/27.
 */
@RequestMapping("Assets")
@Controller
public class AssetsPagesController {

    @RequestMapping("addAssets")
    public String jumpToAddPages(HttpServletRequest request, HttpServletResponse response){
        String state = request.getParameter("state");
        System.out.println("state:"+state);
        if(state.equals("clxx")){
            return "zichanXX_CLXX";
        }else if(state.equals("fcxx")){
            return "zichanXX_FCXX";
        }else if(state.equals("spxx")){
            return "zichanXX_SPXX";
        }else if(state.equals("gjjxx")){
            return "zichanXX_GJJXX";
        }else if(state.equals("cbxx")){
            return "zichanXX_CBXX";
        }else if(state.equals("gsxx")){
            return "zichanXX_GSXX";
        }else {
            return "404Page";
        }
    }

    @RequestMapping("changeAssets")
    public String jumpToChangePage(HttpServletRequest request, HttpServletResponse response){
        String state = request.getParameter("state");
        System.out.println("state:"+state);
        if(state.equals("clxx")){
            return "zichanXX_CLXX_XG";
        }else if(state.equals("fcxx")){
            return "zichanXX_FCXX_XG";
        }else if(state.equals("spxx")){
            return "zichanXX_SPXX_XG";
        }else if(state.equals("gjjxx")){
            return "zichanXX_GJJXX_XG";
        }else if(state.equals("cbxx")){
            return "zichanXX_CBXX_XG";
        }else if(state.equals("gsxx")){
            return "zichanXX_GSXX_XG";
        }else {
            return "404Page";
        }

    }
}
