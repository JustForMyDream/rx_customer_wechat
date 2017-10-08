<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 2017/7/27
  Time: 16:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
                        padding-left: 0px ">
                商铺信息
            </p>
        </li>
        <li class="am-panel">
            <p>
                商铺地址：
                <img src="../img/arowRIcon.jpg" onclick="$('#spdz').focus()">
                <input id="spdz"/>
                <!--<i class="am-icon-angle-right am-fr am-margin-right"></i>-->

            </p>

        </li>
        <li class="am-panel">
            <p>
                月供金额(元)：
                <img src="../img/arowRIcon.jpg" onclick="$('#spygje').focus()">
                <input id="spygje" onkeyup="if(this.value.length==1){this.value=this.value.replace(/[^1-9]/g,'')}else{this.value=this.value.replace(/\D/g,'')}"
                               onafterpaste="if(this.value.length==1){this.value=this.value.replace(/[^1-9]/g,'')}else{this.value=this.value.replace(/\D/g,'')}"/>
                <!--<i class="am-icon-angle-right am-fr am-margin-right"></i>-->
            </p>

        </li>

        <li class="am-panel">
            <p>
                商铺楼层：
                <img src="../img/arowRIcon.jpg" onclick="$('#splc').focus()">
                <input id="splc"/>
                <!--<i class="am-icon-angle-right am-fr am-margin-right"></i>-->
            </p>
        </li>

        <li class="am-panel">
            <p>
                租金收益(元)：
                <img src="../img/arowRIcon.jpg" onclick="$('#spzjsy').focus()">
                <input id="spzjsy" onkeyup="if(this.value.length==1){this.value=this.value.replace(/[^1-9]/g,'')}else{this.value=this.value.replace(/\D/g,'')}"
                               onafterpaste="if(this.value.length==1){this.value=this.value.replace(/[^1-9]/g,'')}else{this.value=this.value.replace(/\D/g,'')}"/>
                <!--<i class="am-icon-angle-right am-fr am-margin-right"></i>-->
            </p>
        </li>
        <li class="am-panel">
            <p>
                商铺性质：
                <img src="../img/arowRIcon.jpg" onclick="$('#spxz').focus()">
                <select id="spxz">
                    <option value="全款">全款</option>
                    <option value="按揭">按揭</option>
                </select>
                <!--<i class="am-icon-angle-right am-fr am-margin-right"></i>-->
            </p>
        </li>
        <li class="am-panel" style="border-bottom: white">
            <p>
                评估价值(万元)：
                <img src="../img/arowRIcon.jpg" onclick="$('#pgjz').focus()">
                <input id="pgjz" onkeyup="if(this.value.length==1){this.value=this.value.replace(/[^1-9]/g,'')}else{this.value=this.value.replace(/\D/g,'')}"
                                onafterpaste="if(this.value.length==1){this.value=this.value.replace(/[^1-9]/g,'')}else{this.value=this.value.replace(/\D/g,'')}"/>
                <!--<i class="am-icon-angle-right am-fr am-margin-right"></i>-->
            </p>
        </li>
    </ul>
</div>
    <div class="baocun">
        <button type="button" id="spxxxg">修改</button>
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

<script>
    var id="<%=request.getParameter("id")%>";
    function goBack(){
        history.go(-1);//后退一页
    }
//    var id="11e7-6d49-5ab0685c-951f-2f8301ccb066";
    if(id!=null){
        console.log("id:"+id)
        looksp();
    }
    function looksp() {
        $.ajax({
            url: "../clxx/readspxxbyid",
            data: {
                "id":id
            },
            type: "get",
            dataType: "json",
            success: function (data) {
                console.log(data);
                var tlksp = data.tlkKhSpxxEntity;
//                $("#spxz").find("option:selected").val() = tlksp.itemSpxz;
                $("#spxz").val(tlksp.itemSpxz);
                document.getElementById("spdz").value = tlksp.itemSpdz;
                document.getElementById("spygje").value = tlksp.itemYgje;
                document.getElementById("splc").value = tlksp.itemSplc;
                document.getElementById("spzjsy").value =tlksp.itemSpzjsy;
                document.getElementById("pgjz").value = tlksp.itemSppgjz;
                $(".loader").css("display","none");

            },
            error: function () {
                $(".loader").css("display","none");

            }
        })
    }

    $('#spxxxg').on('click', function () {

        var spxz = $("#spxz").find("option:selected").val();
        var spdz = document.getElementById("spdz").value;
        var spygje = document.getElementById("spygje").value;
        var splc = document.getElementById("splc").value;
        var spzjsy = document.getElementById("spzjsy").value;
        var pgjz = document.getElementById("pgjz").value;
        if(spxz==""||spdz==""||spygje==""||splc==""||spzjsy==""||pgjz==""){
            alert("请完善信息!");
        }
        else {
            $(".loader").css("display","block");
            $.ajax({
                url: "../ChangeAssetMessage/changSpxx",
                data: {
                    "ITEM_SPDZ": spdz,
                    "ITEM_YGJE": spygje,
                    "ITEM_SPLC": splc,
                    "ITEM_SPZJSY": spzjsy,
                    "ITEM_SPPGJZ": pgjz,
                    "ITEM_SPXZ": spxz,
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

                    } else {
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
</body>
</html>
