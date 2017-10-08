<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8">
    <title>融祥金融</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="format-detection" content="telephone=no">
    <meta name="renderer" content="webkit">
    <meta http-equiv="Cache-Control" content="no-siteapp"/>
    <%@include file="../../page/jsAndCss.jsp" %>
    <link rel="stylesheet" href="../../rx/css/header.css">
    <style type="text/css">
        .span-left {
            color: #ff9800;
            /*margin-right: 10px;*/
        }

        .span-right {
            float: right;
        }

        .a-right {
            float: right;
            text-decoration: none;
            out-line: none;
            color: gray;
            margin-top: 5px;
        }

        .span-right {
            float: right;
            margin-right: 5px;
        }

        .icon-color {
            color: grey;
        }
        .span-icon{
            margin-top: 5px!important;
        }
    </style>
</head>
<header data-am-widget="header"
        class="am-header am-header-default" style="text-align: center">
    <div class="am-header-left am-header-nav">
        <a href="#left-link" class="">
            <span class=" am-icon-chevron-left am-icon-sm icon-color "></span>
        </a>
    </div>
    <p>
        在途签单
    </p>
    <div class="am-header-right am-header-nav">
        <a href="/rx/khqd/qdlb" class="">
            <span class=" am-icon-file-text-o am-icon-sm icon-color " ></span>
        </a>
    </div>
</header>
<c:forEach var="bean" items="${ztqdinf}">

        <div class="am-panel am-panel-default">
            <div class="am-panel-hd ">
                <span class="am-icon-circle span-left am-icon-sm"></span>
                <p style="display: inline-block">签单号:<span name="qdh">${bean.qdh}</span></p>
                <a class="am-icon-chevron-right a-right"  href="/rx/khqd/qdxq?qdh=${bean.qdh}&qdsj=${bean.qdsj}&dklx=${bean.khdklx}&qdr=${bean.khname}&dkje=${bean.dkje}&qdxxid=${bean.qdxxid}"></a>
            <%--/khqd/qdxq.html?qdh=${bean.qdh}&qdsj=${bean.qdsj}&dklx=${bean.dkje}&qdr=${bean.khname}&dkje=${bean.dkje}&qdxxid=${bean.qdxxid}--%>
            </div>
            <div class="am-panel-bd">
                <p >签单时间:<span class="span-right " name="qdsj">${bean.qdsj}</span></p>
                <p >签单金额:<span class="span-right" name="dkje">${bean.dkje}(万元)</span></p>
                <p >签单人:<span class="span-right" name="khname">${bean.khname}</span></p>
            </div>
        </div>

</c:forEach>


<script type="text/javascript">

</script>


</body>
</html>