<%--
  Created by IntelliJ IDEA.
  User: 李静
  Date: 2017/7/28
  Time: 15:57
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
     <%@include file="../../page/jsAndCss.jsp"%>
</head>
<style>
    body{
        background: white;
        font-family: PingFangSC-Medium;
    }
    .xxup{
        font-family:PingFangSC-Medium;
        font-size:16px;
        color:#ffc433;
        text-align:center;
        margin-top: 10px;
    }
    .xxup img{
        margin-left: 5px;
        margin-right: 5px;
        width: 30%;
    }
    table{
        width: 88%;
        margin-left: 6%;
        background:#fffef5;
        border:1px solid #f3f0e1;
        margin-top: 15px;
        margin-bottom: 10px;
    }
    tr{
        height: 35px;
        line-height: 35px;
        border:1px solid #f3f0e1;
    }
    tr td:first-child{
        width: 30%;
        font-family:PingFangSC-Regular;
        font-size:14px;
        color:#4a4a4a;
        line-height:30px;
        border:1px solid #f3f0e1;
        padding-left: 10px;
    }
    tr td:nth-child(2){
        width: 70%;
        font-family:PingFangSC-Regular;
        font-size:14px;
        color:#9b9b9b;
        line-height:30px;
        border:1px solid #f3f0e1;
        padding-left: 15px;
    }
    .tt th{
        font-size:14px;
        border:1px solid #f3f0e1;
       text-align: center;
        color: black!important;
    }
    .tt td{
        width: 33.3%!important;
        font-family:PingFangSC-Regular;
        font-size:14px;
        color:#9b9b9b!important;
        line-height:30px;
        text-align:left;
        border:1px solid #f3f0e1;
        text-align: center;
        padding-left: 0!important;
    }



</style>
<body>
<%--通过 TlkKhQdxxContoller 访问   /khqd/qdxq--%>
<header data-am-widget="header" class="am-header">
    <div class="am-header-left am-header-nav">
        <a href="JavaScript:history.back(-1)" class="">
            <img src="../img/leftjt.png" class="left"><span>返回</span>
        </a>
    </div>
    <p>
        签单详情
    </p>
    <div class="am-header-right am-header-nav">
    </div>
</header>
    <div id="jbxx" class="xxup">
        <img src="../img/hengxian.png">
        基本信息
        <img src="../img/hengxian.png">
    </div>
<table>
   <tr>
       <td>签单号</td>
       <td>${requestScope.qdh}</td>
   </tr>
    <tr>
        <td>签单时间</td>
        <td>${requestScope.qdsj}</td>
    </tr>
    <tr>
        <td>意向金额</td>
        <td>${requestScope.dkje}（万元）</td>
    </tr>
    <tr>
        <td>贷款类型</td>
        <td>${requestScope.dklx}</td>
    </tr>
    <tr>
        <td>签单人</td>
        <td>${requestScope.qdr}</td>
    </tr>
</table>
<div id="qdcp" class="xxup">
    <img src="../img/hengxian.png">
    签单产品
    <img src="../img/hengxian.png">
</div>
<table >
    <tr>
        <td>产品名称</td>
        <td>${tlkQdcpEntity.itemCpmc}</td>
    </tr>
    <tr>
        <td>分公司</td>
        <td>${tlkQdcpEntity.itemFgs}</td>
    </tr>
    <tr>
        <td>产品中心</td>
        <td>${tlkQdcpEntity.itemCpzxid}</td>
    </tr>
    <tr>
        <td>产品经理</td>
        <td>${tlkQdcpEntity.itemCpjlid}</td>
    </tr>
</table>
<div id="zdjl" class="xxup">
    <img src="../img/hengxian.png">
    做单记录
    <img src="../img/hengxian.png">
</div>
<table class="tt">
    <tr >
        <th>时间</th>
        <th>操作步骤</th>
        <th>操作人</th>
    </tr>
    <tbody>
    <c:forEach var="bean" items="${tlkZdjlEntity}">
        <tr>
            <td>${bean.itemFpsj}</td>
            <td>${bean.itemCzbz}</td>
            <td>${bean.itemCzry}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>

<script>
</script>
</body>
</html>