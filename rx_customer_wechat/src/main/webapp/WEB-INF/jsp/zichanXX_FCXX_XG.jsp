<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 2017/7/27
  Time: 16:03
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
                        padding-left: 0px">
                房产信息
            </p>
        </li>
        <li class="am-panel">
            <p>
                房产性质：
                <img src="../img/arowRIcon.jpg" onclick="$('#sfcxz').focus()">
                <!--<i class="am-icon-angle-right am-fr am-margin-right"></i>-->
                <select id="sfcxz">
                    <option value="全款">全款</option>
                    <option value="按揭">按揭</option>
                </select>
            </p>

        </li>

        <li class="am-panel">
            <p>
                房屋类型：
                <img src="../img/arowRIcon.jpg" onclick="$('#sfwlx').focus()">
                <select id="sfwlx">
                    <option value="商品房">商品房</option>
                    <option value="拆迁安置房">拆迁安置房</option>
                    <option value="单位房">单位房</option>
                    <option value="自建房">自建房</option>
                    <option value="商铺房">商铺房</option>
                </select>


                <!--<i class="am-icon-angle-right am-fr am-margin-right"></i>-->
            </p>
        </li>

        <li class="am-panel">
            <p>
                双证是否齐全：
                <img src="../img/arowRIcon.jpg" onclick="$('#sszsfqq').focus()">
                <select id="sszsfqq">
                    <option value="有">有</option>
                    <option value="无">无</option>
                </select>
                <!--<i class="am-icon-angle-right am-fr am-margin-right"></i>-->
            </p>
        </li>
        <li class="am-panel">
            <p>
                月供金额(元)：
                <img src="../img/arowRIcon.jpg" onclick="$('#ygje').focus()">
                <input id="ygje" onkeyup="if(this.value.length==1){this.value=this.value.replace(/[^1-9]/g,'')}else{this.value=this.value.replace(/\D/g,'')}"
                               onafterpaste="if(this.value.length==1){this.value=this.value.replace(/[^1-9]/g,'')}else{this.value=this.value.replace(/\D/g,'')}"/>
                <!--<i class="am-icon-angle-right am-fr am-margin-right"></i>-->
            </p>
        </li>
        <li class="am-panel">
            <p>
                总面积(平米):
                <img src="../img/arowRIcon.jpg" onclick="$('#szmj').focus()">
                <input id="szmj" onkeyup="if(this.value.length==1){this.value=this.value.replace(/[^1-9]/g,'')}else{this.value=this.value.replace(/\D/g,'')}"
                               onafterpaste="if(this.value.length==1){this.value=this.value.replace(/[^1-9]/g,'')}else{this.value=this.value.replace(/\D/g,'')}"/>
                <!--<i class="am-icon-angle-right am-fr am-margin-right"></i>-->
            </p>
        </li>
        <li class="am-panel">
            <p data-am-collapse="{parent: '#collapase-nav-1', target: '#role-nav'}">
                市场单价：
                <img src="../img/arowRIcon.jpg" onclick="$('#scsdj').focus()">
                <input id="scsdj" onkeyup="if(this.value.length==1){this.value=this.value.replace(/[^1-9]/g,'')}else{this.value=this.value.replace(/\D/g,'')}"
                            onafterpaste="if(this.value.length==1){this.value=this.value.replace(/[^1-9]/g,'')}else{this.value=this.value.replace(/\D/g,'')}"/>
                <!--<i class="am-icon-angle-right am-fr am-margin-right"></i>-->
            </p>
        </li>
        <li class="am-panel">
            <p>
                购房时间：
                <img src="../img/arowRIcon.jpg" onclick="$('#sgfsj').focus()">
                <input type="date" class="time" id="sgfsj" style="padding-top: 11px"/>
                <!--<i class="am-icon-angle-right am-fr am-margin-right"></i>-->
            </p>
        </li>
        <li class="am-panel" style="border-bottom: white" style="border-bottom: white">
            <p>
                房产地址：
                <img src="../img/arowRIcon.jpg" onclick="$('#sfcdz').focus()">
                <input  id="sfcdz"/>
                <!--<i class="am-icon-angle-right am-fr am-margin-right"></i>-->
            </p>
        </li>
    </ul>
</div>
    <div class="baocun">
        <button type="button" id="fcxxxg">修改</button>
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
//    var id="11e7-6d49-3e5d6de2-951f-2f8301ccb066";
    var id="<%=request.getParameter("id")%>";
    function goBack(){
        history.go(-1);//后退一页
    }
    if(id!=null){
        console.log("id:"+id)
        lookfc();
    }
    function lookfc() {
        $(".loader").css("display","block");
        $.ajax({
            url: "../clxx/readfcxxbyid",
            data: {
                "id":id
            },
            type: "get",
            dataType: "json",
            success: function (data) {
                var tlkfc = data.tlkKhFcxxEntity;
//                $("#sfcxz").find("option:selected").val() =tlkfc.itemFcxz;
//                $("#sfwlx").find("option:selected").val() = tlkfc.itemJzlx;
//                $("#sszsfqq").find("option:selected").val() = tlkfc.itemSzsfqq;
                $("#sfcxz ").val(tlkfc.itemFcxz);
                $("#sfwlx").val(tlkfc.itemJzlx);
                $("#sszsfqq").val(tlkfc.itemSzsfqq);
                document.getElementById("ygje").value = tlkfc.itemYgje != null ? tlkfc.itemYgje :  "无";
                document.getElementById("szmj").value = parseInt(tlkfc.itemJzmj)!= null ? parseInt(tlkfc.itemJzmj):  "无";;
                document.getElementById("scsdj").value = tlkfc.itemScdj != null ? tlkfc.itemScdj:  "无";
                document.getElementById("sgfsj").value = tlkfc.itemGfsj != null ? tlkfc.itemGfsj:  "无";
                document.getElementById("sfcdz").value = tlkfc.itemFcdz != null ? tlkfc.itemFcdz : "无";
                $(".loader").css("display","none");
            },
            error: function () {
                $(".loader").css("display","none");
            }
        })
    }

    $('#fcxxxg').on('click', function () {

        var sfcxz = $("#sfcxz").find("option:selected").val();
        var sfwlx = $("#sfwlx").find("option:selected").val();
        var sszsfqq = $("#sszsfqq").find("option:selected").val();
        var ygje = document.getElementById("ygje").value;
        var szmj = document.getElementById("szmj").value;
        var scsdj = document.getElementById("scsdj").value;
        var sgfsj = document.getElementById("sgfsj").value;
        var sfcdz = document.getElementById("sfcdz").value;
        if(sfcxz==""||sfwlx==""||sszsfqq==""||ygje==""||szmj==""||scsdj==""||sgfsj==""||sfcdz==""){
            alert("请完善信息!");
        }
        else {
            $(".loader").css("display","block");
            $.ajax({
                url: "../ChangeAssetMessage/changFcxx",
                data: {
                    "ITEM_FCXZ": sfcxz,
                    "ITEM_JZLX": sfwlx,
                    "ITEM_SZSFQQ": sszsfqq,
                    "ITEM_GFSJ": sgfsj,
                    "ITEM_JZMJ": szmj,
                    "ITEM_YGJE": ygje,
                    "ITEM_SCDJ": scsdj,
                    "ITEM_FCDZ":sfcdz,
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
