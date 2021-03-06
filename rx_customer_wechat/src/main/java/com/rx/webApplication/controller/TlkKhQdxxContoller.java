package com.rx.webApplication.controller;

import com.rx.webApplication.SessionStorage;
import com.rx.webApplication.dao.Impl.TlkKhQdxxEntityDaoImpl;
import com.rx.webApplication.dao.TlkKhQdxxEntityDao;
import com.rx.webApplication.entities.TlkQdcpEntity;
import com.rx.webApplication.entities.TlkZdjlEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by 1010 on 2017-07-02.
 */
@Controller
@RequestMapping("khqd")
public class TlkKhQdxxContoller {

    /*
    历史签单数据接口
     */
    @RequestMapping("qdlb")
    public String findQdlb(HttpServletRequest request, HttpServletResponse response, HttpSession session) throws ServletException, IOException {

        TlkKhQdxxEntityDao tlkKhQdxxEntityDao = new TlkKhQdxxEntityDaoImpl();
        //System.out.println(session.getAttribute("khid"));
        String khid= (String) session.getAttribute(SessionStorage.KHID);
//        String khid = "11e7-6d42-b4240cbe-951f-2f8301ccb066";
        // List qdlbInf = tlkKhQdxxEntityDao.findKhQdxqBykhid((String) session.getAttribute(SessionStorage.KHID));
        List qdlbInf = tlkKhQdxxEntityDao.findKhQdlbByQdxxid(khid);
        request.setAttribute("qdlbInf", qdlbInf);
        return "lsqd";
    }

    /*
    在途签单数据接口
     */
    @RequestMapping("ztqd")
    public String findZtqd(HttpServletRequest request, HttpServletResponse response, HttpSession session) throws ServletException, IOException {
        TlkKhQdxxEntityDao tlkKhQdxxEntityDao = new TlkKhQdxxEntityDaoImpl();

        System.out.println("客户id ： " + session.getAttribute(SessionStorage.KHID));

//        String khid = "11e7-6d42-b4240cbe-951f-2f8301ccb066";
          List ztqdList = tlkKhQdxxEntityDao.findKhZtqdBykhid((String) session.getAttribute(SessionStorage.KHID));
//        List ztqdList = tlkKhQdxxEntityDao.findKhZtqdBykhid(khid);

        //String khid = "11e7-6d42-b4240cbe-951f-2f8301ccb066";
//        List ztqdList = tlkKhQdxxEntityDao.findKhZtqdBykhid((String) session.getAttribute(SessionStorage.KHID));
        //List ztqdList = tlkKhQdxxEntityDao.findKhZtqdBykhid(khid);


        request.setAttribute("ztqdinf", ztqdList);
        return "ztqdnew";
    }

    /*
    签单详情数据接口
     */
    @RequestMapping("qdxq")
    public String lsfindQdxq(HttpServletRequest request, HttpServletResponse response, HttpSession session) throws ServletException, IOException {
        String qdsj = request.getParameter("qdsj");
        String qdxxid = request.getParameter("qdxxid");

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = df.parse(qdsj);
            System.out.println(df.format(date));
            request.setAttribute("qdsj", df.format(date));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
//      String qdid = "11e7-5ec1-c3687003-975a-6509a3e28873" ;  用签单qdxxid    替换了  qdid
//      String qdid = qcxxid ;
        TlkKhQdxxEntityDao tlkKhQdxxEntityDao = new TlkKhQdxxEntityDaoImpl();
        TlkQdcpEntity tlkQdcpEntity = tlkKhQdxxEntityDao.findKhQdxqBykhid(qdxxid);

        request.setAttribute("tlkQdcpEntity", tlkQdcpEntity);
        request.setAttribute("qdr", request.getParameter("qdr"));

        request.setAttribute("dklx", request.getParameter("dklx"));
        request.setAttribute("dkje", request.getParameter("dkje"));
        request.setAttribute("qdh", request.getParameter("qdh"));
        System.out.println("签单产品Id" + tlkQdcpEntity.getId());
        List<TlkZdjlEntity> zdjlList = tlkKhQdxxEntityDao.findzdjlByQdcpId(tlkQdcpEntity.getId());
        request.setAttribute("tlkZdjlEntity", zdjlList);
        return "QianDanXQ";
    }



}
