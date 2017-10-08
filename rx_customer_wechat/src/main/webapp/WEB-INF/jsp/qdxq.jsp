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
    <link rel="stylesheet" href="../css/header.css">
    <style type="text/css">
        hr {
            margin: 0 0 0 0;
        }
        .span-right {
            float: right;
            margin-right: 5px;
        }
    </style>
</head>

<body>
<header data-am-widget="header"
        class="am-header am-header-default" style="text-align: center">
    <div class="am-header-left am-header-nav">
        <a href="/rx/khqd/ztqd" class="">
            <i class="am-header-icon am-icon-exchange"></i>
        </a>
    </div>
    <p>
        签单详情
    </p>
    <div class="am-header-right am-header-nav">
        <a href="#right-link" class="">
            <i class="am-header-icon "></i>
        </a>
    </div>
</header>



<HR style="height: 4px; dashed: #8BC34A" color=#8BC34A SIZE=1>

<div class="am-panel am-panel-default">
    <div class="am-panel-hd ">
        <span>基本信息</span>
    </div>
    <div class="am-panel-bd">
        <p data-am-collapse="{parent: '#collapase-nav-1', target: '#user-nav'}">
            签单号:<span class="span-right">${requestScope.qdh}</span>
        </p>
        <p data-am-collapse="{parent: '#collapase-nav-1', target: '#user-nav'}">
            签单时间：<span class="span-right">${requestScope.qdsj}</span>
        </p>
        <p data-am-collapse="{parent: '#collapase-nav-1', target: '#user-nav'}">
            意向金额:<span class="span-right">${requestScope.dkje}（万元）</span>
        </p>
        <p data-am-collapse="{parent: '#collapase-nav-1', target: '#user-nav'}">
            贷款类型:<span class="span-right">${requestScope.dklx}</span>
        </p>
    </div>
</div>

<HR style="height: 4px; dashed:#ff9800" color=#ff9800 SIZE=1>

    <div class="am-panel am-panel-default">
        <div class="am-panel-hd ">
            <span>签单产品</span>
        </div>
        <div class="am-panel-bd">
            <p>签单名称:<span class="span-right" >${tlkQdcpEntity.itemCpmc}</span></p>
            <p>分公司:<span class="span-right" >${tlkQdcpEntity.itemFgs}</span></p>
            <p>产品中心:<span class="span-right" >${tlkQdcpEntity.itemCpzxid}</span></p>
            <p>产品经理:<span class="span-right" >${tlkQdcpEntity.itemCpjlid}</span></p>
        </div>
    </div>



<HR style="height: 4px; dashed: #259b24" color=#259b24 SIZE=1>
<div class="am-panel am-panel-default">
    <div class="am-panel-hd ">
        <span>签单记录</span>
    </div>
    <div class="am-panel-bd">
        <table class="am-table">
            <thead>
            <tr>
                <th>时间</th>
                <th>操作步骤</th>
                <th>操作人</th>
            </tr>
            </thead>
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
    </div>
</div>

<script>
    $(function () {
        var $wrapper = $('#js-do-demo');
        $wrapper.DOMObserve({
            childList: true,
            attributes: true,
            subtree: true
        }, function (mutations, observer) {
            console.log(observer.constructor === window.MutationObserver);
            console.log('#js-do-demo 的 DOM 发生变化鸟：' + mutations[0].type);
        });

        $('#js-do-actions').find('button').on('click', function (e) {
            var $t = $(e.target);
            if ($t.is('[data-insert]')) {
                $wrapper.append('<p>插入了一个 p</p>');
            } else if ($t.is('[data-remove]')) {
                $wrapper.find('p').last().remove();
            } else {
                $wrapper.addClass('am-text-danger');
            }
        });
    })
</script>

</body>

</html>