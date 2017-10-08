<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 2017/7/26
  Time: 19:02
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
    <%@include file="../../page/jsAndCss.jsp"%>
    <link rel="stylesheet" href="../css/zichanxinxi.css"/>
    <link rel="stylesheet" href="../css/loader.css"/>
</head>
<style>
    .loader{
        display:none;
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
    </div>
</header>
<div class="content">
    <div class="am-panel-default am-panel">
    <ul class="am-list admin-sidebar-list" id="collapase-nav-1">
        <li class="am-panel content-zzxx" style="border-top: white">
            <p data-am-collapse="{parent: '#collapase-nav-1', target: '#user-nav'}"
               style="background-color: rgb(242,242,242)!important; font-weight: 200!important;text-align: center;font-family:PingFangSC-Medium;
                        font-size:18px;
                        color:#000000;
                        text-align:center;
                        padding-left: 0px">
                参保信息
            </p>
        </li>
        <li class="am-panel">
            <p >
                参保种类：
                <img src="../img/arowRIcon.jpg" onclick="$('#cbzl').focus()">
                <select id="cbzl">
                    <option value="城镇养老保险">城镇养老保险</option>
                    <option value="机关养老保险" >机关养老保险</option>
                    <option value="城乡养老保险" >城乡养老保险</option>
                    <option value="城职医疗保险" >城职医疗保险</option>
                    <option value="城乡医疗保险">城乡医疗保险</option>
                    <option value="工伤保险">工伤保险</option>
                    <option value="失业保险" >失业保险</option>
                    <option value="生育保险" >生育保险</option>
                    <option value="五险" >五险</option>
                    <option value="六险">六险</option>
                </select>
                <%--<i class="am-icon-angle-right am-fr am-margin-right"></i>--%>

            </p>

        </li>
        <li class="am-panel">
            <p>
                社保编号：
                <img src="../img/arowRIcon.jpg" onclick="$('#sbbh').focus()">
                <input id="sbbh" />
                <!--<i class="am-icon-angle-right am-fr am-margin-right"></i>-->
            </p>

        </li>

        <li class="am-panel">
            <p data-am-collapse="{parent: '#collapase-nav-1', target: '#company-nav'}">
                单位名称：
                <img src="../img/arowRIcon.jpg" onclick="$('#dwmc').focus()">
                <input id="dwmc"/>
                <!--<i class="am-icon-angle-right am-fr am-margin-right"></i>-->
            </p>
        </li>

        <li class="am-panel">
            <p>
                人员所属区域：
                <img src="../img/arowRIcon.jpg" onclick="$('#ryssqy').focus()">
                <input id="ryssqy" />
                <!--<i class="am-icon-angle-right am-fr am-margin-right"></i>-->
            </p>
        </li>
        <li class="am-panel">
            <p>
                是否退休：
                <img src="../img/arowRIcon.jpg" onclick="$('#sftx').focus()">
                <select id="sftx">
                    <option value="是">是</option>
                    <option value="否">否</option>
                </select>
                <!--<i class="am-icon-angle-right am-fr am-margin-right"></i>-->
            </p>
        </li>
        <li class="am-panel">
            <p >
                开始参保时间：
                <img src="../img/arowRIcon.jpg" onclick="$('#kscbsj').focus()">
                <input id="kscbsj" class="time" type="date" style="padding-top: 11px"/>
                <!--<i class="am-icon-angle-right am-fr am-margin-right"></i>-->
            </p>
        </li>
        <li class="am-panel" style="border-bottom: white">
            <p>
                当前状态：
                <img src="../img/arowRIcon.jpg" onclick="$('#dqzt').focus()">
                <select id="dqzt">
                    <option value="正常缴费">正常缴费</option>
                    <option value="终止缴费">终止缴费</option>
                </select>
                <!--<i class="am-icon-angle-right am-fr am-margin-right"></i>-->
            </p>
        </li>
    </ul>
</div>
    <div class="baocun">
        <button type="button" id="cbxxbc">保存</button>
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
    function goBack(){
//        history.back();
        history.go(-1);//后退一页
    }
//    var khid="11e7-6d48-36fb6f36-951f-2f8301ccb066";
    var khid = "<%=session.getAttribute(SessionStorage.KHID)%>";
    $('#cbxxbc').on('click', function () {
                var cbzl = $("#cbzl").find("option:selected").val();
                var sftx = $("#sftx").find("option:selected").val();
                var dqzt = $("#dqzt").find("option:selected").val();
                var sbbh = document.getElementById("sbbh").value;
                var dwmc = document.getElementById("dwmc").value;
                var ryssqy = document.getElementById("ryssqy").value;
                var kscbsj = document.getElementById("kscbsj").value;
                if(cbzl==""||sftx==""||dqzt==""||sbbh==""||dwmc==""||ryssqy==""||kscbsj==""){
                    alert("请完善信息!");
                }
                else {
                    $(".loader").css("display","block");
                    $.ajax({
                        url: "/rx/clxx/savecbxx",
                        data: {
                            "ITEM_CBZL": cbzl,
                            "ITEM_SFTX": sftx,
                            "ITEM_DQZT": dqzt,
                            "ITEM_SBBH": sbbh,
                            "ITEM_DWMC": dwmc,
                            "ITEM_RYSSQY": ryssqy,
                            "ITEM_CBKSSJ": kscbsj,
                            "ITEM_KHID": khid
                        },
                        type: "post",
                        dataType: "json",
                        success: function (data) {
                            if (data.code == 200) {
                                setTimeout("disappearLoad()",1000);
                                $("#message").html("保存成功!").show(300).delay(2000).hide(300);
                                setTimeout("window.location.href = '../clxx/query'",3000);
                            } else {
                                $(".loader").css("display","none");
                                $("#message").html("保存失败!").show(300).delay(2000).hide(300);
                            }
                        },
                        error: function () {

                            $(".loader").css("display","none");
                        }
                    })
                }

    });
    function disappearLoad() {
        $(".loader").css("display","none");
    }
</script>
