package com.rx.webApplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by 王玉粮 on 2017/7/13.
 */
@Controller
@RequestMapping("Error")
public class ErrorPageController {
    /**
     * 跳转出错页面
     * @param request
     * @param response
     */
    @RequestMapping("500")
    public void judgePage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/jsp/500Page.jsp").forward(request,response);
    }
}
