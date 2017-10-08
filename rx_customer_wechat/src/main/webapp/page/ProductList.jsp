<%@ page import="com.rx.webApplication.SessionStorage" %>
<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>产品列表</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="format-detection" content="telephone=no">
    <meta name="renderer" content="webkit">
    <meta http-equiv="Cache-Control" content="no-siteapp"/>
    <link rel="stylesheet" href="../css/amazeui.min.css"/>
    <script src="../js/amazeui.min.js"></script>
    <script src="../js/jquery-3.1.1.min.js"></script>
    <script src="../js/amazeui.widgets.helper.min.js"></script>
    <script src="../js/amazeui.js"></script>

    <style>
        body {
            background-color: #f2f2f2;
        }

        header {
            background-color: #ffc433 !important;
            height: 53px !important;
            line-height: 53px !important;
            margin-top: -19px;
            text-align: center;
        }

        header p {
            color: #FFFFFF;
            font-size: 18px;
        }

        .left {
            height: 26px !important;
            width: 15px !important;
        }

        .am-header-left span {
            color: #FFFFFF;
            font-size: 18px;
            vertical-align: middle;
            margin-left: 10px;
        }

        .right {
            width: 7px !important;
            height: 7px !important;
        }

        .am-cf li a {
            background-color: #FFFFFF;
        }

        .am-tabs-d2 .am-tabs-nav > .am-active a {
            color: #FFC433 !important;
        }

        .am-tabs-d2 .am-tabs-nav > .am-active:after {
            border-bottom-color: #FFC433 !important;
        }

        .am-tabs-bd {
            border: none !important;
        }

        .am-tabs-d2 .am-tabs-nav > .am-active {
            border-bottom: 2px solid #FFC433 !important;
        }

        [data-am-widget=tabs] {
            width: 100%;
            margin: 0;
        }

        .ll {
            margin-top: 8px;
            background-color: white;
            padding-top: 15px;
            width: 100%;
        }

        .p1 {
            font-family: PingFangSC-Regular;
            font-size: 16px;
            color: #4a4a4a;
            padding-left: 8%;
        }

        .am-tabs-bd .am-tab-panel {
            padding: 0px !important;
        }

        .ll_down {
            width: 100%;

        }

        .rr {
            width: 26%;
            text-align: center;
            margin-top: -5px;
        }

        .rr2 {
            width: 26%;
            text-align: center;
            margin-left: 27%;
            margin-top: -80px;
        }

        .rr3 {
            width: 26%;
            text-align: center;
            margin-left: 55%;
            margin-top: -92px;
        }

        .rr_p1 {
            font-family: PingFangSC-Regular;
            font-size: 13px;
            color: #9b9b9b;
        }

        .rr_p2 {
            font-family: PingFangSC-Semibold;
            font-size: 22px;
            color: #ffc433;
            margin-top: -10px;
            margin-bottom: -10px;
        }

        .rr_p3 {
            font-family: PingFangSC-Regular;
            font-size: 18px;
            color: #9b9b9b;
            margin-bottom: 0px;
        }

        .imm {
            width: 2px;
            height: 75px;
            margin-top: -90px;
            margin-left: 99%;
        }

        .left_j {
            width: 13px;
            height: 20px;
            margin-left: 115%;
            margin-top: -107px;
        }


    </style>
</head>
<body>
<header data-am-widget="header" class="am-header">
    <div class="am-header-left am-header-nav">
        <a href="#left-link" class="">
            <img src="../img/left.png" class="left"><span>Back</span>
        </a>
    </div>
    <p>
        贷款产品
    </p>
    <div class="am-header-right am-header-nav">
        <a href="#right-link" class="">
            <span><img src="../img/dian.png" class="right"></span>
            <span><img src="../img/dian.png" class="right"></span>
            <span><img src="../img/dian.png" class="right"></span>
        </a>
    </div>
</header>
<div data-am-widget="tabs"
     class="am-tabs am-tabs-d2"
>
    <ul class="am-tabs-nav am-cf">
        <li class="am-active"><a href="[data-tab-panel-0]">全部</a></li>
        <li class=""><a href="[data-tab-panel-1]">信贷</a></li>
        <li class=""><a href="[data-tab-panel-2]">房贷</a></li>
        <li class=""><a href="[data-tab-panel-3]">车贷</a></li>
    </ul>
    <div class="am-tabs-bd">
        <div data-tab-panel-0 class="am-tab-panel am-active">
            <div class="ll">
                <p class="p1">产品1</p>
                <div class="rr">
                    <p class="rr_p1">
                        最低利率
                    </p>
                    <p class="rr_p2">
                        99.9%
                    </p>
                    <img src="../img/shuxian.png" class="imm">
                </div>
                <div class="rr2">
                    <p class="rr_p1">
                        最大期数
                    </p>
                    <p class="rr_p3">
                        6月
                    </p>
                    <img src="../img/shuxian.png" class="imm" style="margin-top: -110px">
                </div>

                <div class="rr3">
                    <p class="rr_p1">
                        最高金额
                    </p>
                    <p class="rr_p3">
                        5万元
                    </p>
                    <img src="../img/right.png" class="left_j">
                </div>
                <div>
                </div>
            </div>
            <div class="ll">
                <p class="p1">产品1</p>
                <div class="rr">
                    <p class="rr_p1">
                        最低利率
                    </p>
                    <p class="rr_p2">
                        99.9%
                    </p>
                    <img src="../img/shuxian.png" class="imm">
                </div>
                <div class="rr2">
                    <p class="rr_p1">
                        最大期数
                    </p>
                    <p class="rr_p3">
                        6
                    </p>
                    <img src="../img/shuxian.png" class="imm" style="margin-top: -110px">
                </div>

                <div class="rr3">
                    <p class="rr_p1">
                        最高金额
                    </p>
                    <p class="rr_p3">
                        5万元
                    </p>
                    <img src="../img/right.png" class="left_j">
                </div>
                <div>
                </div>
            </div>
        </div>
        <div data-tab-panel-1 class="am-tab-panel ">
            <div class="ll">
                <p class="p1">产品1</p>
                <div class="rr">
                    <p class="rr_p1">
                        最低利率
                    </p>
                    <p class="rr_p2">
                        99.9%
                    </p>
                    <img src="../img/shuxian.png" class="imm">
                </div>
                <div class="rr2">
                    <p class="rr_p1">
                        最大期数
                    </p>
                    <p class="rr_p3">
                        6
                    </p>
                    <img src="../img/shuxian.png" class="imm" style="margin-top: -110px">
                </div>

                <div class="rr3">
                    <p class="rr_p1">
                        最高金额
                    </p>
                    <p class="rr_p3">
                        5万元
                    </p>
                    <img src="../img/right.png" class="left_j">
                </div>
                <div>
                </div>
            </div>
        </div>
        <div data-tab-panel-2 class="am-tab-panel ">
            <div class="ll">
                <p class="p1">产品1</p>
                <div class="rr">
                    <p class="rr_p1">
                        最低利率
                    </p>
                    <p class="rr_p2">
                        99.9%
                    </p>
                    <img src="../img/shuxian.png" class="imm">
                </div>
                <div class="rr2">
                    <p class="rr_p1">
                        最大期数
                    </p>
                    <p class="rr_p3">
                        6
                    </p>
                    <img src="../img/shuxian.png" class="imm" style="margin-top: -110px">
                </div>

                <div class="rr3">
                    <p class="rr_p1">
                        最高金额
                    </p>
                    <p class="rr_p3">
                        5万元
                    </p>
                    <img src="../img/right.png" class="left_j">
                </div>
                <div>
                </div>
            </div>
        </div>
        <div data-tab-panel-3 class="am-tab-panel ">
            <div class="ll">
                <p class="p1">产品1</p>
                <div class="rr">
                    <p class="rr_p1">
                        最低利率
                    </p>
                    <p class="rr_p2">
                        99.9%
                    </p>
                    <img src="../img/shuxian.png" class="imm">
                </div>
                <div class="rr2">
                    <p class="rr_p1">
                        最大期数
                    </p>
                    <p class="rr_p3">
                        6
                    </p>
                    <img src="../img/shuxian.png" class="imm" style="margin-top: -110px">
                </div>

                <div class="rr3">
                    <p class="rr_p1">
                        最高金额
                    </p>
                    <p class="rr_p3">
                        5万元
                    </p>
                    <img src="../img/right.png" class="left_j">
                </div>
                <div>
                </div>
            </div>
        </div>
    </div>
</div>


</body>
</html>