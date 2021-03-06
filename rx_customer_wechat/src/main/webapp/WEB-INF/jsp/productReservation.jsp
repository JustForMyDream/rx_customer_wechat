<%--
  Created by IntelliJ IDEA.
  User: 王玉粮
  Date: 2017/7/26
  Time: 8:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <meta charset="UTF-8">
    <title>融祥金融</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="description" content="">
    <meta name="keywords" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="renderer" content="webkit">
    <meta http-equiv="Cache-Control" content="no-siteapp"/>
    <%@include file="../../page/jsAndCss.jsp" %>
    <link rel="stylesheet" href="../css/loader.css"/>
    <%--<link rel="stylesheet" href="../css/toast.tip.css"/>--%>
    <style>
        body {
            background-color: white;
        }

        .pro_des {
            width: 100%;
        }

        .pro_des_top {
            width: 100%;
            height: 44px;
        }

        .pro_des_top_left {
            float: left;
            width: 30%;
            margin-top: 22px;
            margin-left: 5%;
            margin-right: 5%;
        }

        .pro_des_top_middle {

        }

        .pro_des_top_middle p {
            float: left;
            margin-bottom: 0px;
            margin-top: 8px;
            font-family: PingFangSC-Medium;
            font-size: 16px;
            color: #ffc433;
            text-align: center;
        }

        .pro_des_top_right {
            float: left;
            width: 30%;
            margin-top: 22px;
            margin-left: 5%;
            margin-right: 5%;
        }

        .pro_des_image {
            width: 100%;
            height: auto;
            text-align: center;
        }

        .pro_des_image img {
        }

        .pro_des_message {
            width: 100%;
        }

        .pro_des_message_row {
            width: 100%;
            height: auto;
        }

        .pro_des_message_row_name {
            width: 50%;
            float: left;
        }

        .pro_des_message_row_value {
            width: 50%;
            float: left;
        }

        .pro_des_message_row_name p {
            margin: 0 auto;
            font-family: PingFangSC-Regular;
            font-size: 14px;
            color: #9b9b9b;
            line-height: 27px;
            text-align: left;
            margin-left: 12%;
        }

        .pro_des_message_row_value p {
            margin: 0 auto;
            font-family: PingFangSC-Regular;
            font-size: 14px;
            color: #9b9b9b;
            line-height: 27px;
            text-align: right;
            margin-right: 12%;
        }

        .incoming_infor {
            width: 100%;
            height: 158px;
        }

        .incoming_infor_top {
            width: 100%;
            height: 42px;
            display: block;
        }

        .incoming_infor_top_left {
            float: left;
            width: 30%;
            margin-top: 22px;
            margin-left: 5%;
            margin-right: 5%;
        }

        .incoming_infor_top_middle {

        }

        .incoming_infor_top_middle p {
            float: left;
            margin-bottom: 0px;
            margin-top: 8px;
            font-family: PingFangSC-Medium;
            font-size: 16px;
            color: #ffc433;
            text-align: center;
        }

        .incoming_infor_top_right {
            float: left;
            width: 30%;
            margin-top: 22px;
            margin-left: 5%;
            margin-right: 5%;
        }

        .incoming_infor_message {
            width: 100%;
            height: auto;
            text-align: center;
        }

        .incoming_infor_message_row {
            width: 100%;
            height: auto;
        }

        .incoming_infor_message_row_name {
            width: 50%;
            float: left;
        }

        .incoming_infor_message_row_value {
            width: 50%;
            float: left;
        }

        .incoming_infor_message_row_name p {
            margin: 0 auto;
            font-family: PingFangSC-Regular;
            font-size: 14px;
            color: #9b9b9b;
            line-height: 27px;
            text-align: left;
            margin-left: 12%;
        }

        .incoming_infor_message_row_value p {
            margin: 0 auto;
            font-family: PingFangSC-Regular;
            font-size: 14px;
            color: #9b9b9b;
            line-height: 27px;
            text-align: right;
            margin-right: 12%;
        }

        .pro_appo {
            width: 100%;
            height: 50px;
            text-align: center;
            position: fixed;
            bottom: 21px;
            display: block;
            z-index: 10;
        }

        .pro_appo_button {
            opacity: 1;
            background: #ffba0a;
            border-radius: 39px;
            width: 174px;
            height: 44px;
            display: inline-block;
        }

        .pro_appo_button p {
            font-family: PingFangSC-Regular;
            font-size: 18px;
            color: #ffffff;
            margin-top: 6px;
        }

        .reser_infor {
            width: 100%;
            height: 100%;
            opacity: 0.61;
            background: #000000;
            box-shadow: 0 0 1px 0 rgba(0, 0, 0, 0.50);
            position: fixed;
            top: 0px;
            display: none;
            z-index: 10;
            filter: Alpha(opacity=60);
        }

        .reser_infor_name {
            width: 80%;
            height: 44px;
            position: relative;
            opacity: 1;
            background-color: #DBDBDB;
            border: 1px solid #ffcf56;
            border-radius: 39px;
            top: 20%;
            left: 10%;
            z-index: 20;
            display: none;
        }

        .reser_infor_phone {
            width: 80%;
            height: 44px;
            position: relative;
            opacity: 1;
            background: #DBDBDB;
            border: 1px solid #ffcf56;
            border-radius: 39px;
            top: 13%;
            left: 10%;
            margin-top: 67px;
            z-index: 20;
            display: none;
        }

        .reser_infor_name_left {
            width: 16%;
            height: 44px;
            float: left;
        }

        .reser_infor_name_left img {
            margin-left: 20px;
            margin-top: 8px;
        }

        .reser_infor_name_right {
            width: 80%;
            height: 44px;
            float: left;
        }

        .reser_infor_name_right input {
            border: 0;
            width: 95%;
            height: 43px;
            font-family: PingFangSC-Regular;
            font-size: 16px;
            color: #9b9b9b;
            background-color: #DBDBDB;
        }

        .reser_infor_phone_left {
            width: 16%;
            height: 44px;
            float: left;
        }

        .reser_infor_phone_left img {
            margin-left: 20px;
            margin-top: 8px;
            width: 18px;
        }

        .reser_infor_phone_right {
            width: 80%;
            height: 44px;
            float: left;
        }

        .reser_infor_phone_right input {
            border: 0;
            width: 95%;
            height: 43px;
            font-family: PingFangSC-Regular;
            font-size: 16px;
            color: #9b9b9b;
            background-color: #DBDBDB;
        }

        .reser_infor_appo {
            width: 100%;
            height: 50px;
            text-align: center;
            position: relative;
            bottom: -80px;
            z-index: 20;
            display: none;
        }

        .reser_infor_appo_button {
            background: #fccc53;
            border-radius: 39px;
            width: 174px;
            height: 44px;
            display: inline-block;
            box-shadow: 0px 3px 1px rgba(189, 189, 189, 0.61);
        }

        .reser_infor_appo_button p {
            font-family: PingFangSC-Regular;
            font-size: 18px;
            color: #ffffff;
            margin-top: 6px;
        }

        .reser_infor_body {
            width: 100%;
            position: fixed;
            z-index: 20;
            height: 45%;
            top: 38%;
        }
        #notice{
            position: fixed;
            top: 80%;
            background-color: #ff8625;
            width: 50%;
            left: 25%;
            height: 3rem;
            border-radius: 1.5rem;
            box-shadow: black;
            line-height: 3rem;
            vertical-align: middle;
            text-align: center;
            box-shadow: 0px 2px 10px #888888;
            display: none;
            z-index: 999;
        }
    </style>
</head>
<body>
<header data-am-widget="header" class="am-header">
    <div class="am-header-left am-header-nav">
        <a href="/rx/cpxx/query" class="">
            <img src="../img/leftjt.png" class="left"><span>返回</span>
        </a>
    </div>
    <p>
        产品详情
    </p>
    <div class="am-header-right am-header-nav">
        <a href="#right-link" class="">
        </a>
    </div>
</header>
<div class="pro_des">
    <div class="pro_des_top">
        <div class="pro_des_top_left">
            <hr>
        </div>
        <div class="pro_des_top_middle">
            <p>产品简介</p>
        </div>
        <div class="pro_des_top_right">
            <hr>
        </div>
    </div>
    <div class="pro_des_image">
    </div>
    <div class="pro_des_message">

    </div>
</div>
<div class="incoming_infor">
    <div class="incoming_infor_top">
        <div class="incoming_infor_top_left">
            <hr>
        </div>
        <div class="incoming_infor_top_middle">
            <p>进件信息</p>
        </div>
        <div class="incoming_infor_top_right">
            <hr>
        </div>
    </div>
    <div class="incoming_infor_message">


    </div>
</div>
<div class="pro_appo">
    <div class="pro_appo_button">
        <p>立即预约</p>
    </div>
</div>
<div class="reser_infor">

</div>
<div class="reser_infor_body">
    <div class="reser_infor_name">
        <div class="reser_infor_name_left">
            <img src="../img/username.png">
        </div>
        <div class="reser_infor_name_right">
            <input id="username" type="text" onfocus="this.value=''" onblur="if(this.value==''){this.value='请输入姓名'}"
                   value="请输入姓名">
        </div>
    </div>
    <div class="reser_infor_phone">
        <div class="reser_infor_phone_left">
            <img src="../img/mobile.png">
        </div>
        <div class="reser_infor_phone_right">
            <input id="phone" type="text" readonly="readonly">
        </div>
    </div>
    <div class="reser_infor_appo">
        <div class="reser_infor_appo_button">
            <p>立即预约</p>
        </div>
    </div>
</div>
</div>
<div id="notice">
    Hello World!
</div>
<div class="loader" style="display: none">
    <div class="loader-inner">
        <div class="loader-line-wrap">
            <div class="loader-line"></div>
        </div>
        <div class="loader-line-wrap">
            <div class="loader-line"></div>
        </div>
        <div class="loader-line-wrap">
            <div class="loader-line"></div>
        </div>
        <div class="loader-line-wrap">
            <div class="loader-line"></div>
        </div>
        <div class="loader-line-wrap">
            <div class="loader-line"></div>
        </div>
    </div>
</div>
<script>

    var notice=document.getElementById("notice");
    var cpid = "<%=request.getParameter("id")%>"

    window.onload = function () {
        if (cpid != null) {
            getCpjj();
        }
    }


    $(".pro_appo_button").on("click", function () {
        $.ajax({
            url: "../product/querykhxx",
            type: "post",
            dataType: "json",
            success: function (data) {
                console.log(data);
                if (data.code == 200) {
                    $(".reser_infor").css("display", "block");
                    $(this).css("display", "none");
                    $(".pro_appo_button").css("display", "none");
                    $(".reser_infor_name").css("display", "block");
                    $(".reser_infor_phone").css("display", "block");
                    $(".reser_infor_appo").css("display", "block");
                    $(".reser_infor_body").css("display", "block");
                    $(".reser_infor").css("display", "block");
                    var itemKhxm = data.tLkKhjcxxEntity.itemKhxm;
                    var itemSjhm = data.tLkKhjcxxEntity.itemSjhm;
                    var state = 2;
                    if (itemKhxm != "") {
                        $("#username").val(itemKhxm);
                    }
                    if (itemSjhm != "") {
                        $("#phone").val(itemSjhm);
                    }   //对文本框的值进行校验
                    $(".reser_infor_appo").on("click", function () {
                        $(".loader").css("display","block");
                        var username = document.getElementById("username").value;
                        var phone = document.getElementById("phone").value;
                        var testPhone = /^1\d{10}$/;
                        if (username.replace(/(^\s*)|(\s*$)/g, "") == "请输入姓名" || username.replace(/(^\s*)|(\s*$)/g, "") == "") {
                            console.log("请输入姓名");
                        } else if (phone.replace(/(^\s*)|(\s*$)/g, "") == "请输入电话" || phone.replace(/(^\s*)|(\s*$)/g, "") == "") {
                            console.log("请输入电话");
                        } else if (!testPhone.test(phone.replace(/(^\s*)|(\s*$)/g, ""))) {
                            console.log("请输入正确的电话号码");
                        } else {
                            if (username != itemKhxm) {
                                state = 1;
                            }
                            $.ajax({
                                url: "../product/reservedProduct",
                                data: {
                                    "username": username,
                                    "phone": phone,
                                    "state": state
                                },
                                type: "post",
                                dataType: "json",
                                success: function (data) {
                                    console.log(data);
                                    if (data.code == 200) {
                                        $(".loader").css("display","none");
                                        disappearCover();
                                        showMessage("预约成功！");
                                        setTimeout("window.location.href = '../cpxx/query'",2000);
                                    }else{
                                        disappearCover();
                                        showMessage("预约成功！");
                                    }
                                },
                                error: function (data) {

                                }
                            })

                        }
                    })


                }
            },
            error: function () {

            }
        })
    })

    function getCpjj() {
        $.ajax({
            url: "../cpxx/findcpxx",
            data: {"id": cpid},
            type: "post",
            dataType: "json",
            success: function (data) {
                console.log(data);
                if (data.code == 200) {
                    var cpjj = data.tlkCpEntity.ITEM_CPJJ;
                    var hh = "src=\"<%=basePath%>";
                    var ITEM_CPJJ = data.tlkCpEntity.ITEM_CPJJ;
                    var ITEM_JJYQ = data.tlkCpEntity.ITEM_JJYQ;
                    if (ITEM_CPJJ != "") {
                        ITEM_CPJJ = ITEM_CPJJ.replace(/src=\"/g, hh);
                        $(".pro_des_image").append(ITEM_CPJJ);
                    } else {
                        $(".pro_des_image").append("<img src='../img/moren.png'style='height: 130px' ><p style='text-align: center;color: gray;font-size: 14px;'>暂无产品详细介绍</p>");
                    }
                    if (ITEM_JJYQ != "") {
                        ITEM_JJYQ = ITEM_JJYQ.replace(/src=\"/g, hh);
                        $(".incoming_infor_message").append(ITEM_JJYQ);
                    } else {
                        $(".incoming_infor_message").append("<img src='../img/moren.png'style='height: 130px'  ><p style='text-align: center;color: gray;font-size: 14px;'>暂无进件信息介绍</p>");
                    }


                }
            },
            error: function () {

            }
        })
    }

    $(".reser_infor").on("click", function () {
        disappearCover();
    })
    
    function disappearCover() {
        $(".reser_infor").css("display", "none");
        $(".reser_infor_body").css("display", "none");
        $(".pro_appo_button").css("display", "inline-block");
        $(".pro_appo").css("display", "block");
    }

    function showMessage(text) {
        if(notice.style.display!='block') {
            notice.innerText = text;
            fade('in', notice, 600, true);
            setTimeout("fade('out', notice, 600, true)", 1000);
        }
    }//开启弹出框
</script>
</body>
</html>
