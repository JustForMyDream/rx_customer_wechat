<%@ page import="com.rx.webApplication.SessionStorage" %><%--
  Created by IntelliJ IDEA.
  User: 1010
  Date: 2017-07-26
  Time: 15:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
    <title>融祥金融</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="description" content="">
    <meta name="keywords" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="renderer" content="webkit">
    <meta http-equiv="Cache-Control" content="no-siteapp"/>
    <link rel="alternate icon" type="image/png" href="../i/favicon.png">
    <link rel="stylesheet" href="../css/amazeui.min.css"/>
    <link rel="stylesheet" href="../css/pageHeader.css"/>
    <script src="../js/jquery-3.1.1.min.js"></script>
    <script src="../js/amazeui.widgets.helper.min.js"></script>
    <script src="../js/amazeui.min.js"></script>
    <link rel="stylesheet" href="../css/loader.css"/>
    <style type="text/css">
        .loader {
            display: none;
        }

        hr {
            margin: 0 0 0 0;
        }

        .pheight {
            height: 36px;
            margin: 0;
        }

        a, a:hover, a:visited, a:link, a:active {
            text-decoration: none;
            out-line: none;
            color: #000000;
        }

        b {
            font-size: 14px;
            display: inline-block;
            padding-bottom: 8px;
            padding-top: 10px;
        }

        .innerhr {
            padding-bottom: 10px;
            border-top: 2px solid #ddd;
        rgba(151, 151, 151, 0.29);
            width: 94%;
            margin-bottom: 0px;
            margin-top: 0px;
            margin: 0.1rem auto;
            overflow: hidden;
            clear: both;
            display: block;
        }

        .spanfont {
            padding-right: 11px;
            font-family: PingFangSC-Regular;
            font-size: 16px;
            color: #4a4a4a;
            line-height: 27px;
            text-align: left;
        }

        .header-nav1 p {
            color: white;
        }

        .header-nav1 {
            background-color: rgb(254, 196, 52) !important;
        }

        input {
            float: right;
            margin-right: 10px;
            width: 130px;
            height: 100%;
            outline: none;
            border: none;
            color: black;
            padding-left: 10px;
            display: inline;
            padding-bottom: 5px;
            background-color: white;
        }

        select {
            margin-right: 8px;
            float: right;
            height: inherit;
            width: 108px;
            border: 1px solid transparent;
            -moz-appearance: none;
            -moz-progress-appearance:none ;
            -webkit-appearance: none;
            background-color: white;
        }
    </style>
</head>
<body>

<%--通过 TlkKhjcxxController 访问   /perInf/zhengxin--%>
<header data-am-widget="header" class="am-header">
    <div class="am-header-left am-header-nav">
        <a href="/rx/perInf/Info" class="">
            <img src="../img/leftjt.png" class="left"><span>返回</span>
        </a>
    </div>
    <p>
        征信信息
    </p>
    <div class="am-header-right am-header-nav">
        <a href="#right-link" class="">
        </a>
    </div>
</header>
<div style="padding: 24px 10px 10px 10px">
    <div class="am-panel am-panel-default">
        <div class="am-panel-hd " style="text-align: center">
            <b style="text-align: center;font-size: 17px;padding: 0px">基本信息</b>
        </div>
        <div class="am-panel-bd">
            <p data-am-collapse="{parent: '#collapase-nav-1', target: '#user-nav'}" class="pheight">
                <span class="spanfont">征信信息: </span><input
                    value="${tLkKhjcxxEntity.itemZxxx eq null?'暂无':tLkKhjcxxEntity.itemZxxx}" disabled="true"/>
            </p>
            <hr class="innerhr"/>
            <p data-am-collapse="{parent: '#collapase-nav-1', target: '#user-nav'}" class="pheight">
                <span class="spanfont">征信逾期：</span><input
                    value="${tLkKhjcxxEntity.itemYwzxyq eq null ?'暂无':tLkKhjcxxEntity.itemYwzxyq}" disabled="true"/>
            </p>
            <hr class="innerhr"/>
            <p data-am-collapse="{parent: '#collapase-nav-1', target: '#user-nav'}" class="pheight">
                <span class="spanfont">近三月逾期笔数:</span><input id="yqbs" value="" disabled="true"/>
            </p>
        </div>
    </div>
    <%--<HR style="height: 2px; dashed: #259b24" color=#259b24 SIZE=1>--%>
    <div class="am-panel am-panel-default">
        <div class="am-panel-hd " style="text-align: center">
            <b style="text-align: center;font-size: 17px;padding: 0px">职业信息</b>
        </div>
        <div class="am-panel-bd">
            <p data-am-collapse="{parent: '#collapase-nav-1', target: '#user-nav'}" class="pheight">
                <span class="spanfont">职业类型: </span>
                <%--<input id="zylx" value="${tLkKhjcxxEntity.itemZylb}"/>--%>
                <img src="../img/arowRIcon.jpg" style="width: 10px;float: right;padding-top: 6px;margin-right: 10px" onclick="$('#zylb').focus()">
                <select id="zylb" size="1">
                    <option value="企业主">企业主</option>
                    <option value="上班人群">上班人群</option>
                    <option value="个体工商户">个体工商户</option>
                </select>
            </p>
            <hr class="innerhr"/>
            <p data-am-collapse="{parent: '#collapase-nav-1', target: '#user-nav'}" class="pheight">
                <img   src="../img/arowRIcon.jpg" style="width: 10px;float: right;padding-top: 6px;margin-right: 10px" onclick="$('#ygzsr').focus()">
                <span class="spanfont">月收入(元)：</span><input style="width:117px;"
                    id="ygzsr" type="number" min="0"
                    value="${tLkKhjcxxEntity.itemYgzsr}"
                    onkeyup="if(this.value.length==1){this.value=this.value.replace(/[^1-9]/g,'')}else{this.value=this.value.replace(/\D/g,'')}"
                    onafterpaste="if(this.value.length==1){this.value=this.value.replace(/[^1-9]/g,'')}else{this.value=this.value.replace(/\D/g,'')}"/>
            </p>
            <hr class="innerhr"/>
            <p data-am-collapse="{parent: '#collapase-nav-1', target: '#user-nav'}" class="pheight">
                <img   src="../img/arowRIcon.jpg" style="width: 10px;float: right;padding-top: 6px;margin-right: 10px" onclick="$('#gznx').focus()" >
                <span class="spanfont">工作年限:</span><input id="gznx" style="width:117px;"
                                                          value="${tLkKhjcxxEntity.itemGznx eq null ? '暂无':tLkKhjcxxEntity.itemGznx}"
                                                          onkeyup="if(this.value.length==1){this.value=this.value.replace(/[^1-9]/g,'')}else{this.value=this.value.replace(/\D/g,'')}"
                                                          onafterpaste="if(this.value.length==1){this.value=this.value.replace(/[^1-9]/g,'')}else{this.value=this.value.replace(/\D/g,'')}"/>
            </p>
            <hr class="innerhr"/>
            <p data-am-collapse="{parent: '#collapase-nav-1', target: '#user-nav'}" class="pheight">
                <span class="spanfont">工资发放方式:</span>
                <img   src="../img/arowRIcon.jpg" style="width: 10px;float: right;padding-top: 6px;margin-right: 10px" onclick="$('#gzfffs').focus()">
                <select id="gzfffs">
                    <option value="打卡">打卡</option>
                    <option value="现金">现金</option>

                </select>
                <%--<input id="gzfffs" value="${tLkKhjcxxEntity.itemGzfffs}"/>--%>
            </p>
        </div>
    </div>
    <div style="text-align: center;bottom: 1%;position: relative;">
        <button type="button" id="savezhengxin" class="am-btn am-badge-warning am-round am-btn-lg"
                style="width: 174px;background-color: #ffba0a; color: white">保存
        </button>
    </div>
    <div class="loader">
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
</div>
</body>
</html>
<script>
    //    var khid = "11e7-6db8-e83c5ebe-8d42-4f6fa9b0ec38";
    var khid = "<%=session.getAttribute(SessionStorage.KHID)%>";

    window.onload = function () {


        <%--document.getElementById("zxxx").value = ${tLkKhjcxxEntity.itemZxxx} != null ? ${tLkKhjcxxEntity.itemZxxx} :  "无";--%>
        <%--document.getElementById("ygzsr").value = ${tLkKhjcxxEntity.itemYgzsr} != null ? ${tLkKhjcxxEntity.itemYgzsr} :  "无";--%>
        <%--document.getElementById("gznx").value = ${tLkKhjcxxEntity.itemGznx} != null ? ${tLkKhjcxxEntity.itemGznx} :  "无";--%>
        <%--document.getElementById("zxyq").value = ${tLkKhjcxxEntity.itemYwzxyq} != null ? ${tLkKhjcxxEntity.itemYwzxyq} :  "无";--%>

        $("#gzfffs option[value='${tLkKhjcxxEntity.itemGzfffs}']").attr("selected", true);
        $("#zylb option[value='${tLkKhjcxxEntity.itemZylb}']").attr("selected", true);
        var yqbsfix = parseFloat(${tLkKhjcxxEntity.itemYqbs}).toFixed(4);
        if (isNaN(yqbsfix)) {
            yqbsfix = 0;
        }
        document.getElementById("yqbs").value = "" + yqbsfix + " (万)";
    }

    function goBack() {
        history.go(-1);//后退一页
    }
    $('#savezhengxin').on('click', function () {

        var zylb = document.getElementById("zylb").value;
        var ygzsr = document.getElementById("ygzsr").value;
        var gznx = document.getElementById("gznx").value;
        var gzfffs = document.getElementById("gzfffs").value;
        console.log(gzfffs)
        console.log(gznx)
        console.log(ygzsr)
        console.log(zylb)


        if (zylb == "" || ygzsr == "" || gznx == "" || gzfffs == "") {
            alert("请完善信息!");
        }
        else {
            $(".loader").css("display", "block");
            $.ajax({
                url: "/rx/perInf/updatezhengxin",
                data: {
                    "ITEM_ZYLB": zylb,
                    "ITEM_YGZSR": ygzsr,
                    "ITEM_GZNX": gznx,
                    "ITEM_GZFFFS": gzfffs,
                    "ITEM_KHID": khid
                },
                type: "post",
                dataType: "json",
                success: function (result) {
                    console.log(result);
                    if (result.code == 200) {
                        $(".loader").css("display", "none");
                        window.location.href = "../perInf/Info";

                        $("body").cftoaster({
                            content: "保存成功",
                            fontColor: "#000000",
                            backgroundColor: "#F5F5F5",
                            maxWidth: "200px",
                        });
                    } else {
                        $(".loader").css("display", "none");
                        $("body").cftoaster({
                            content: "保存失败",
                            fontColor: "#000000",
                            backgroundColor: "#F5F5F5",
                            maxWidth: "200px"
                        });
                    }
                },
                error: function () {
                    $(".loader").css("display", "none");
                }
            })
        }
    });

    $('p img').on('click', function () {
        this().nextNode().focus();
    })


</script>
