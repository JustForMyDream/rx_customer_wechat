<%--
  Created by IntelliJ IDEA.
  User: Aria
  Date: 2017/7/2
  Time: 11:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <<title>融祥金融</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="format-detection" content="telephone=no">
    <meta name="renderer" content="webkit">
    <meta http-equiv="Cache-Control" content="no-siteapp" />
    <link rel="stylesheet" href="../css/personalinformation.css">
    <%@include file="../../page/jsAndCss.jsp"%>
</head>
<style>
    li.am-panel{
        margin-bottom: 9px!important;
    }
</style>
<body style="    background-color: #F5F5F5;">
<header data-am-widget="header"
        class="am-header am-header-default" style="text-align: center">
    <div class="am-header-left am-header-nav">
        <a href="#left-link" class="">
            <i class="am-header-icon am-icon-exchange"></i>
        </a>
    </div>
    <p>
        个人资料
    </p>
    <div class="am-header-right am-header-nav">
        <a id="save" href="#right-link" class="">
            <i class="am-header-icon am-icon-save"></i>
        </a>
    </div>
</header>

<form>
    <ul class="am-list admin-sidebar-list" id="collapase-nav-1">

        <li class="am-panel">
            <p data-am-collapse="{parent: '#collapase-nav-1', target: '#user-nav'}">
                基础信息<i class="am-icon-angle-right am-fr am-margin-right"></i>
            </p>
            <ul class="am-list am-collapse admin-sidebar-sub" id="user-nav">
                <li>
                    <div>
                        姓&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;名：
                        <input type="text" name="itemKhxm" value="${tLkKhjcxxEntity.itemKhxm}">
                    </div>
                </li>
                <li>
                    <div>
                        性&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;别：
                        <select name="itemKhxb" data-am-selected>
                           <option value="男" <c:if test="${tLkKhjcxxEntity.itemKhxb==\"男\"}">selected</c:if>>男</option>
                            <option value="女" <c:if test="${tLkKhjcxxEntity.itemKhxb==\"女\"}">selected</c:if>>女</option>
                        </select>
                    </div>
                </li>
                <li>
                    <div>
                        手机号码：
                        <input type="number" name="itemSjhm" value="${tLkKhjcxxEntity.itemSjhm}">
                    </div>
                </li>
                <li>
                    <div>
                        座机号码：
                        <input type="number" name="itemZjhm" value="${tLkKhjcxxEntity.itemZjhm}">
                    </div>
                </li>
                <li>
                    <div>
                        身份证号：
                        <input type="text" name="itemSfzhm" value="${tLkKhjcxxEntity.itemSfzhm}">
                    </div>
                </li>
            </ul>
        </li>

        <li class="am-panel">
            <p data-am-collapse="{parent: '#collapase-nav-1', target: '#company-nav'}">
                征信信息
                <i class="am-icon-angle-right am-fr am-margin-right"></i>
            </p>
            <ul class="am-list am-collapse admin-sidebar-sub" id="company-nav">
                <li>
                    <div>
                        征信信息：<input type="text" name="itemZxxx" value="${tLkKhjcxxEntity.itemZxxx}" readonly="readonly">
                    </div>
                    <%--<p>--%>
                        <%--征信信息：--%>
                        <%--<select name="itemZxxx" data-am-selected>--%>
                            <%--<option value="空" <c:if test="${tLkKhjcxxEntity.itemZxxx!=\"白户\"&&tLkKhjcxxEntity.itemZxxx!=\"黑户\"&&tLkKhjcxxEntity.itemZxxx!=\"不良记录\"}">selected</c:if>>&nbsp;</option>--%>
                            <%--<option value="白户" <c:if test="${tLkKhjcxxEntity.itemZxxx==\"白户\"}">selected</c:if>>白户</option>--%>
                            <%--<option value="黑户" <c:if test="${tLkKhjcxxEntity.itemZxxx==\"黑户\"}">selected</c:if>>黑户</option>--%>
                            <%--<option value="不良记录" <c:if test="${tLkKhjcxxEntity.itemZxxx==\"不良记录\"}">selected</c:if>>不良记录</option>--%>
                        <%--</select>--%>
                    <%--</p>--%>
                </li>
                <li>
                    <div>
                        有无征信逾期：<input type="text" name="itemYwzxyq" value="${tLkKhjcxxEntity.itemYwzxyq}" readonly="readonly">
                    </div>
                        <%--<select name="itemYwzxyq" data-am-selected>--%>
                            <%--<option value="空" <c:if test="${tLkKhjcxxEntity.itemYwzxyq!=\"无\"&&tLkKhjcxxEntity.itemYwzxyq!=\"有\"}">selected</c:if>>&nbsp;</option>--%>
                            <%--<option value="无" <c:if test="${tLkKhjcxxEntity.itemYwzxyq==\"无\"}">selected</c:if>>无</option>--%>
                            <%--<option value="有" <c:if test="${tLkKhjcxxEntity.itemYwzxyq==\"有\"}">selected</c:if>>有</option>--%>
                        <%--</select>--%>

                </li>
                <li>
                    <div>
                        近三月逾期笔数：<input type="text" name="itemYqbs" value="${tLkKhjcxxEntity.itemYqbs}" readonly="readonly">
                    </div>
                </li>
            </ul>
        </li>

        <li class="am-panel">
            <p data-am-collapse="{parent: '#collapase-nav-1', target: '#job-nav'}">
                职业信息 <i class="am-icon-angle-right am-fr am-margin-right"></i>
            </p>
            <ul class="am-list am-collapse admin-sidebar-sub" id="job-nav">
                <li>
                    <p>
                        职业类别：
                        <select name="itemZylb" data-am-selected>
                            <option value="企业主" <c:if test="${tLkKhjcxxEntity.itemZylb==\"企业主\"}">selected</c:if>>企业主</option>
                            <option value="个体户" <c:if test="${tLkKhjcxxEntity.itemZylb==\"个体户\"}">selected</c:if>>个体工商户</option>
                            <option value="上班人群" <c:if test="${tLkKhjcxxEntity.itemZxxx==\"上班人群\"}">selected</c:if>>上班人群</option>
                            <option value="学生" <c:if test="${tLkKhjcxxEntity.itemZxxx==\"学生\"}">selected</c:if>>学生</option>
                            <option value="无固定职业" <c:if test="${tLkKhjcxxEntity.itemZxxx==\"无固定职业\"}">selected</c:if>>无固定职业</option>
                        </select>
                    </p>
                </li>
                <li>
                    <div>
                        工作年限：
                        <input type="number" name="itemGznx" value="${tLkKhjcxxEntity.itemGznx}">
                    </div>
                </li>
                <li>
                    <p>
                        工资发放方式：
                        <select name="itemGzfffs" data-am-selected>
                            <option value="打卡" <c:if test="${tLkKhjcxxEntity.itemGzfffs==\"打卡\"}">selected</c:if>>打卡</option>
                            <option value="现金" <c:if test="${tLkKhjcxxEntity.itemGzfffs==\"白户\"}">selected</c:if>>现金</option>
                        </select>
                    </p>
                </li>
                <li>
                    <div>
                        月工资收入：
                        <input type="number" id="number" name="itemYgzsr" value="${tLkKhjcxxEntity.itemYgzsr}">
                    </div>
                </li>
            </ul>
        </li>

    </ul>
</form>
<div class="am-modal am-modal-alert" tabindex="-1" id="my-alert">
    <div class="am-modal-dialog">
        <div class="am-modal-hd">Amaze UI</div>
        <div class="am-modal-bd">

        </div>
        <div class="am-modal-footer">
            <span class="am-modal-btn">确定</span>
        </div>
    </div>
</div>
<script>
    $().collapse('toggle')
    $('p').click(function () {
        if($(this).next().length>0) {
            if ($(this).children().hasClass('am-icon-angle-down')) {
                $(this).children().removeClass('am-icon-angle-down')
                $(this).children().addClass('am-icon-angle-right')
            } else {
                $(this).siblings().children().removeClass('am-icon-angle-down')
                $(this).parent().siblings().children('p').children().removeClass('am-icon-angle-down')
                $(this).parent().siblings().children('p').children().addClass('am-icon-angle-right')
                $(this).children().addClass('am-icon-angle-down')
            }
        }
    })
    $('#save').click(function () {
        $.AMUI.progress.start();
        $.ajax({
            cache: true,
            type: "POST",
            url: "/rx/perInf/update",
            data: $('form').serialize(),// 你的formid
            async: false,
            error: function (request) {
                $.AMUI.progress.done();
                $('.am-modal-hd').empty();
                $('.am-modal-hd').append('连接失败');
                $('#my-alert').modal('toggle')
            },
            success: function (data) {
                $.AMUI.progress.done();
                if(data="1"){
                    $('.am-modal-hd').empty();
                    $('.am-modal-hd').append('保存成功');
                    $('#my-alert').modal('toggle')
                }
                else{
                    $('.am-modal-hd').empty();
                    $('.am-modal-hd').append('保存失败');
                    $('#my-alert').modal('toggle')
                }
            }
        })
    })
    $('#number').click(function () {
        $(this).val("")
    })
</script>
</body>
</html>
