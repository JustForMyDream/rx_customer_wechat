<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 2017/7/26
  Time: 14:36
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
        <!--<a href="#right-link" class="">-->
        <!--<i class="am-header-icon am-icon-save"></i>-->
        <!--</a>-->
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
                车辆信息
            </p>
        </li>
        <li class="am-panel tr2" id="addcar">
            <p data-am-collapse="{parent: '#collapase-nav-1', target: '#user-nav'}">
                车辆品牌：
                <img src="../img/arowRIcon.jpg" onclick="$('#sclpp').focus()">
                <!--<i class="am-icon-angle-right am-fr am-margin-right"></i>-->
                <input id="sclpp"/>
            </p>
        </li>

        <li class="am-panel">
            <p>
                裸车价(万元)：
                <img src="../img/arowRIcon.jpg" onclick="$('#slcj').focus()">
                <input id="slcj" onkeyup="if(this.value.length==1){this.value=this.value.replace(/[^1-9]/g,'')}else{this.value=this.value.replace(/\D/g,'')}"
                               onafterpaste="if(this.value.length==1){this.value=this.value.replace(/[^1-9]/g,'')}else{this.value=this.value.replace(/\D/g,'')}"/>
                <!--<i class="am-icon-angle-right am-fr am-margin-right"></i>-->
            </p>
        </li>

        <li class="am-panel">
            <p>
                月供金额(元)：
                <img src="../img/arowRIcon.jpg" onclick="$('#sygje').focus()">
                <input id="sygje" onkeyup="if(this.value.length==1){this.value=this.value.replace(/[^1-9]/g,'')}else{this.value=this.value.replace(/\D/g,'')}"
                               onafterpaste="if(this.value.length==1){this.value=this.value.replace(/[^1-9]/g,'')}else{this.value=this.value.replace(/\D/g,'')}"/>
                <!--<i class="am-icon-angle-right am-fr am-margin-right"></i>-->
            </p>
        </li>
        <li class="am-panel">
            <p >
                购车时间：
                <img src="../img/arowRIcon.jpg" onclick="$('#gcsj').focus()">
                <input  type="date" class="time" id="gcsj" style="padding-top: 11px"/>
                <!--<i class="am-icon-angle-right am-fr am-margin-right"></i>-->
            </p>
        </li>
        <li class="am-panel">
            <p>
                车牌号：
                <img src="../img/arowRIcon.jpg" onclick="$('#scph').focus()">
                <input id="scph" />
                <!--<i class="am-icon-angle-right am-fr am-margin-right"></i>-->
            </p>
        </li>
        <li class="am-panel">
            <p>
                出厂时间：
                <img src="../img/arowRIcon.jpg" onclick="$('#ccsj').focus()">
                <input id="ccsj" class="time" type="date" style="padding-top: 11px" />
                <!--<i class="am-icon-angle-right am-fr am-margin-right"></i>-->
            </p>
        </li>
        <li class="am-panel" style="border-bottom: white">
            <p>
                车辆所属：
                <img src="../img/arowRIcon.jpg" onclick="$('#sclss').focus()">
                <input id="sclss"  />
                <!--<i class="am-icon-angle-right am-fr am-margin-right"></i>-->
            </p>
        </li>
    </ul>
    </div>

    <div class="baocun">
        <button type="button" id="clxxxg">修改</button>
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
//    var id="11e7-6de1-abad4d7d-8d42-4f6fa9b0ec38";
   var id="<%=request.getParameter("id")%>";
    if(id!=null){
        console.log("id:"+id)
        lookcar();
    }
    function goBack(){
        history.go(-1);//后退一页
    }
    function lookcar() {
        $(".loader").css("display","block");
        $.ajax({
            url: "../clxx/readcarbyid",
            data: {
                "id":id
            },
            type: "get",
            dataType: "json",
            success: function (data) {
                console.log(data);
                var tlk = data.tlkKhClxxEntity;
                document.getElementById("sclpp").value=tlk.itemClpp;
                document.getElementById("slcj").value=tlk.itemLcj;
                document.getElementById("sygje").value=tlk.itemYgje;
                document.getElementById("gcsj").value=tlk.itemGcsj;
                document.getElementById("scph").value = tlk.itemCph;
                document.getElementById("ccsj").value = tlk.itemCcsj;
                document.getElementById("sclss").value = tlk.itemClss;
                $(".loader").css("display","none");
            },
            error: function () {
                $(".loader").css("display","none");
            }
        })
    }

    $('#clxxxg').on('click', function () {

        var sclpp = document.getElementById("sclpp").value;
        var slcj = document.getElementById("slcj").value;
        var sygje = document.getElementById("sygje").value;
        var gcsj = document.getElementById("gcsj").value;
        var scph = document.getElementById("scph").value;
        var ccsj = document.getElementById("ccsj").value;
        var sclss = document.getElementById("sclss").value;
        var ccsjdate = new Date(ccsj.replace("-", "/"));
        var gcsjdate = new Date(gcsj.replace("-", "/"));
        if (gcsj != "" && ccsj != "" && ccsjdate >= gcsjdate) {
            alert("购车时间不能早于出厂时间！");
        } else       if(sclpp==""||slcj==null||sygje==null||gcsj==""||scph==""||ccsj==""||sclss==""){
            alert("传入的信息不完整!");
        }
        else {
            $(".loader").css("display","block");
            $.ajax({
                url: "../ChangeAssetMessage/changeclxx",
                data: {
                    "ITEM_CLPP": sclpp,
                    "ITEM_LCJ": slcj,
                    "ITEM_GCSJ": gcsj,
                    "ITEM_YGJE": sygje,
                    "ITEM_CPH":scph,
                    "ITEM_CCSJ":ccsj,
                    "ITEM_CLSS":sclss,
                    "ID": id
                },
                type: "post",
                dataType: "json",
                success: function (data) {
                    console.log(data);
                    if (data.code == 200) {
                        setTimeout("disappearLoad()",1000);
                        $("#message").html("修改成功!").show(300).delay(2000).hide(300);
                    setTimeout("window.location.href = '../clxx/query'",3000);
                    }

                    else {
                        $(".loader").css("display","none");
                        $("#message").html("修改失败!").show(300).delay(2000).hide(300);
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