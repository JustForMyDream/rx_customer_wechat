<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 2017/7/26
  Time: 17:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.rx.webApplication.SessionStorage" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>融祥金融</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="description" content="">
    <meta name="keywords" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="renderer" content="webkit">
    <meta http-equiv="Cache-Control" content="no-siteapp"/>
    <link rel="alternate icon" type="image/png" href="../i/favicon.png">
    <%@include file="../../page/jsAndCss.jsp" %>
    <link rel="stylesheet" href="../css/zichanxinxi.css"/>
    <link rel="stylesheet" href="../css/loader.css"/>
</head>
<style>

    .loader {
        display: none;
    }
</style>
<body>
<header data-am-widget="header" class="am-header">
    <div class="am-header-left am-header-nav">
        <a href="#left-link" class="" onclick="goBack()">
            <img src="../img/leftjt.png" class="left"><span>返回</span>
        </a>
    </div>
    <p>

        资产信息
    </p>
    <div class="am-header-right am-header-nav">
        <!--<a href="#right-link" class="">-->
        <!--<i class="am-header-icon am-icon-save"></i>-->
        <!--</a>-->
    </div>
</header>
<div class="content">
    <div class="am-panel-default am-panel">
    <ul class="am-list admin-sidebar-list" id="collapase-nav-1">
        <li class="am-panel content-zzxx" style="border-top: white">
            <p style="background-color: rgb(242,242,242)!important; font-weight: 200!important;text-align: center;font-family:PingFangSC-Medium;
                        font-size:18px;
                        color:#000000;
                        text-align:center;
                        padding-left: 0px">
                公积金信息
            </p>
        </li>
        <li class="am-panel">
            <p>
                开始时间：
                <img src="../img/arowRIcon.jpg" onclick="$('#gjjkssj').focus()">
                <input type="date" class="time" id="gjjkssj" style="padding-top: 11px"/>
                <!--<i class="am-icon-angle-right am-fr am-margin-right"></i>-->
            </p>

        </li>

        <li class="am-panel">
            <p>
                结束时间：
                <img src="../img/arowRIcon.jpg" onclick="$('#gjjjssj').focus()">
                <input type="date" class="time" id="gjjjssj" style="padding-top: 11px"/>
                <!--<i class="am-icon-angle-right am-fr am-margin-right"></i>-->
            </p>
        </li>

        <li class="am-panel">
            <p>
                账号状态：
                <img src="../img/arowRIcon.jpg" onclick="$('#zhzt').focus()">
                <select id="zhzt">
                    <option value="缴存">缴存</option>
                    <option value="封存">封存</option>
                </select>
                <!--<i class="am-icon-angle-right am-fr am-margin-right"></i>-->
            </p>
        </li>
        <li class="am-panel">
            <p>
                账户余额(元)：
                <img src="../img/arowRIcon.jpg" onclick="$('#zhye').focus()">
                <input id="zhye"
                               onkeyup="if(this.value.length==1){this.value=this.value.replace(/[^1-9]/g,'')}else{this.value=this.value.replace(/\D/g,'')}"
                               onafterpaste="if(this.value.length==1){this.value=this.value.replace(/[^1-9]/g,'')}else{this.value=this.value.replace(/\D/g,'')}"/>
                <!--<i class="am-icon-angle-right am-fr am-margin-right"></i>-->
            </p>
        </li>
        <li class="am-panel">
            <p>
                月存金额:
                <img src="../img/arowRIcon.jpg" onclick="$('#ycje').focus()">
                <input id="ycje"
                            onkeyup="if(this.value.length==1){this.value=this.value.replace(/[^1-9]/g,'')}else{this.value=this.value.replace(/\D/g,'')}"
                            onafterpaste="if(this.value.length==1){this.value=this.value.replace(/[^1-9]/g,'')}else{this.value=this.value.replace(/\D/g,'')}"/>
                <!--<i class="am-icon-angle-right am-fr am-margin-right"></i>-->
            </p>
        </li>
        <li class="am-panel" style="border-bottom: white">
            <p>
                备注：
                <img src="../img/arowRIcon.jpg" onclick="$('#bz').focus()">
                <input id="bz"/>
                <!--<i class="am-icon-angle-right am-fr am-margin-right"></i>-->
            </p>
        </li>
    </ul>
</div>
    <div class="baocun">
        <button type="button" id="gjjxxbc">保存</button>
        <div id="message"></div>
    </div>
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
</body>
</html>
<script>
    //    var khid="11e7-6d48-36fb6f36-951f-2f8301ccb066";
    function goBack() {
        history.go(-1);//后退一页
    }
    var khid = "<%=session.getAttribute(SessionStorage.KHID)%>";
    $('#gjjxxbc').on('click', function () {
        var gjjkssj = document.getElementById("gjjkssj").value;
        var gjjjssj = document.getElementById("gjjjssj").value;
        var zhzt = document.getElementById("zhzt").value;
        var zhye = document.getElementById("zhye").value;
        var ycje = document.getElementById("ycje").value;
        var bz = document.getElementById("bz").value;
        var zhzt = $("#zhzt").find("option:selected").val();

        var ksdate = new Date(gjjkssj.replace("-", "/"));
        var jsdate = new Date(gjjjssj.replace("-", "/"));
        if (gjjkssj != "" && gjjjssj != "" && ksdate >= jsdate) {
            alert("开始时间不能晚于结束时间！");
        } else  if (gjjkssj == "" || gjjjssj == "" || zhzt == "" || zhye == "" || ycje == "" || bz == "") {
            alert("请完善信息!");
        }
        else {
            $(".loader").css("display", "block");
            $.ajax({
                url: "/rx/clxx/savegjj",
                data: {
                    "ITEM_GJJJCKSSJ": gjjkssj,
                    "ITEM_GJJJCJSSJ": gjjjssj,
                    "ITEM_ZHZT": zhzt,
                    "ITEM_BZ": bz,
                    "ITEM_ZHYE": zhye,
                    "ITEM_YJCJE": ycje,
                    "ITEM_KHID": khid
                },
                type: "post",
                dataType: "json",
                success: function (data) {
                    if (data.code == 200) {
                        setTimeout("disappearLoad()",1000);
                        $("#message").html("保存成功!").show(300).delay(2000).hide(300);
                        setTimeout("window.location.href = '../clxx/query'", 3000);

                    } else {
                        $(".loader").css("display", "none");
                        $("#message").html("保存失败!").show(300).delay(2000).hide(300);

                    }
                },
                error: function () {
                    $(".loader").css("display", "none");
                }
            })
        }
    });

    function disappearLoad() {
        $(".loader").css("display","none");
    }
</script>
