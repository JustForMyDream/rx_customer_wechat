<%@ page import="com.rx.webApplication.SessionStorage" %><%--
  Created by IntelliJ IDEA.
  User: 王玉粮
  Date: 2017/6/29
  Time: 15:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>短信验证界面</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="format-detection" content="telephone=no">
    <meta name="renderer" content="webkit">
    <meta http-equiv="Cache-Control" content="no-siteapp" />
    <%@include file="../../page/jsAndCss.jsp"%>
    <style>
        .header {
            text-align: center;
        }
        .header h1 {
            font-size: 200%;
            color: #333;
            margin-top: 30px;
        }
        .header p {
            font-size: 14px;
        }
        .app{
            border: 1px;
            top: 35%;
            position: absolute;
            width: 100%;
        }
        .row{
            width: 100%;
            padding: 30px;
        }

    </style>
</head>
<body style="overflow: hidden;">
<div style="width: 100%;border-bottom: 2px solid #BBBBBB;position: absolute;top: 31%;"></div>
<div class="app">
    <p style="padding-left: 30px;">你还未进行验证，立即验证：</p>
    <form method="get">
        <div class="row" style="padding-bottom: 0px;padding-top: 0px;">
            <label style="width: 25%;" >手机号：</label>
            <input class="am-form-field am-radius" type="text" style="width: 75% ;float: right;position: inherit;background-color:#EBE8EB;"  name="phoneNumber" id="phoneNumber" >
        </div>
        <div class="row">
            <label style="width: 25%;position: absolute" >验证码:</label>
            <input class="am-form-field am-radius" type="text" style="width: 30%;float:left;margin-left: 25%;background-color:#EBE8EB;"  name="confirmCode" id="confirmCode" >
            <button type="button" class="am-btn am-btn-warning am-round" style="width: 43%;float: right;border-radius: 5px;" name="send" id="send" onclick="sendSMS()" ><label style='margin-bottom: 5px;font-size: 13px;text-align: center;'>发送验证码</label></button>
        </div>
        <div class="row">
            <button type="button" style="margin-left:5%;border-radius:5px;width:90%" class="am-btn am-btn-success  am-round" id="regsiter" onclick="judgeState()">确认提交</button>
        </div>
    </form>
</div>
<%--<div style="width: 100%;border-bottom: 2px solid #BBBBBB;position: absolute;bottom: 28%;"></div>--%>
</body>
<script>
    var time;
    var timeout = 60;

    var state = "<%=session.getAttribute(SessionStorage.STATE)%>";
    function judgeState(){
        if(state!=null){
            console.log("state:"+state);
            registerUser();
        }
    }
    function registerUser() {
        var phoneNumber = document.getElementById("phoneNumber").value;
        var confirmCode = document.getElementById("confirmCode").value;
        if(phoneNumber==""){
            alert("请输入电话号码！");
        }
        if(confirmCode==""){
            alert("请输入验证码");
        }

        $.ajax({
            url:"../../rx/SmsVerification/VerificationCode",
            data:{
                phoneNumber:phoneNumber,
                confirmCode:confirmCode
            },
            contentType:"application/x-www-form-urlencoded",
            type:"get",
            dataType:"json",
            success:function (data) {
                if(data.code == 200){
                    console.log("验证成功");
                    $("body").cftoaster({content: "验证成功",fontColor:"#000000",backgroundColor:"#F5F5F5",maxWidth:"200px"});
                    setTimeout("go()",2000);
                }else {
                    $("body").cftoaster({content: "验证失败",fontColor:"#000000",backgroundColor:"#F5F5F5",maxWidth:"200px"});
                }
                console.log("success");
            },
            error:function () {

            }
        })
    }

    function go() {
       window.location.href = "https://open.weixin.qq.com/connect/oauth2/authorize?appid=wxb5e53b1e6a25c317&redirect_uri=http%3A%2F%2Fwww.chenxuantong.cn%2Frx%2FoauthWechat%2FauthUserLogin&response_type=code&scope=snsapi_userinfo&state="+state+"#wechat_redirect";
    }

    function sendSMS() {
        console.log("正在发送");
        var phoneNumber = document.getElementById("phoneNumber").value;
        if(phoneNumber==''){
            alert("请输入手机号！");
        }else {
                if(!(/^1\d{10}$/.test(phoneNumber))){
                    alert("请输入正确的电话号码！");
                }else {
                    console.log("获取验证码！");
                    time = self.setInterval("countdown()", 1000);
                    $("#send").attr({"disabled":"disabled"});
                    $.ajax({
                        url:"../../rx/SmsVerification/sendCode",
                        data:{
                            "phoneNumber":phoneNumber
                        },
                        contentType:"application/x-www-form-urlencoded",
                        type:"get",
                        dataType:"json",
                        success:function (data) {
                            console.log(data);

                            if(data.msg == "alreadySendMessage"){
                                $("body").cftoaster({content: "短信已发送",fontColor:"#000000",backgroundColor:"#F5F5F5",showTime:"1000",maxWidth:"200px"});
                            }else if(data.msg == "sendSuccess"){
                                $("body").cftoaster({content: "发送成功",fontColor:"#000000",backgroundColor:"#F5F5F5",showTime:"1000",maxWidth:"200px"});
                            }else if(data.msg == "sendFail"){
                                $("body").cftoaster({content: "发送失败",fontColor:"#000000",backgroundColor:"#F5F5F5",showTime:"1000",maxWidth:"200px"});
                            }else if(data.msg == "messageNumberIsFull"){
                                $("body").cftoaster({content: "今日短信次数到上限",fontColor:"#000000",backgroundColor:"#F5F5F5",showTime:"1000",maxWidth:"200px"});
                            }else if(data.msg == "PhoneIsError"){
                                $("body").cftoaster({content: "手机号码错误",fontColor:"#000000",backgroundColor:"#F5F5F5",showTime:"1000",maxWidth:"200px"});
                            }else {
                                $("body").cftoaster({content: "系统错误",fontColor:"#000000",backgroundColor:"#F5F5F5",showTime:"1000",maxWidth:"200px"});
                            }
                        },
                        error:function () {

                        }
                    })
                }
        }
    }
    function countdown() {
        document.getElementById("send").innerHTML = "<label style='font-size: 13px;display:block;white-space:nowrap; overflow:hidden; text-overflow:ellipsis;'>"+timeout+"秒后重新发送</label>";
        timeout -- ;
        if(timeout < 0){
            time = window.clearInterval(time);
            timeout = 60;
            $("#send").removeAttr("disabled").html("<p style='margin-bottom: 3px;font-size: 13px;text-align: center;' >重新获取验证码</p>");//将按钮可用
        }
    }


</script>
</html>
