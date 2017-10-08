<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>资产信息</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="description" content="">
    <meta name="keywords" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="renderer" content="webkit">
    <meta http-equiv="Cache-Control" content="no-siteapp"/>
    <link rel="alternate icon" type="image/png" href="../i/favicon.png">
    <link rel="stylesheet" href="/css/amazeui.min.css"/>
    <link rel="stylesheet" href="/css/personalinformation.css">
    <script src="/js/jquery-3.1.1.min.js"></script>
    <script src="/js/amazeui.widgets.helper.min.js"></script>
    <script src="/js/amazeui.min.js"></script>
    <link rel="stylesheet" href="../css/personalinformation.css">
    <style>
        table {
            width: 98%;
            margin-left: 1%;
            margin-right: 1%;
        }

        table tr {
            width: 100%;
        }

        .tr1 td {
            width: 19%;
            text-align: center;
            color: #8A888A;
            font-size: 14px;
            height: 30px;
            line-height: 30px;
            vertical-align: middle;
        }

        .am-modal-dialog {
            width: 85% !important;
            border-radius: 10px;
        }

        .tr2 td {
            width: 19%;
            color: #0D000D;
            font-size: 12px;
            height: 30px;
            line-height: 30px;
            vertical-align: middle;
            text-align: center;
        }

        .car {
            width: 100%;
        }

        .car li {
            list-style: none;
        }

        .car_in {
            float: right;
            width: 77%;
            text-align: left;
        }

        .car_s {
            float: left;
            margin-left: -30px;
        }
        .am-input-group{
            width: 77%!important;
            float: right!important;
        }
        .am-form-field{
            border: none!important;
            text-align: left!important;
        }
        .am-btn-default{
            margin-top: 3px!important;
            background-color: #eeeeee!important;
        }

        .
    </style>

</head>
<body>
<header data-am-widget="header"
        class="am-header am-header-default" style="text-align: center">
    <div class="am-header-left am-header-nav">
        <a href="#left-link" class="">
            <i class="am-header-icon am-icon-exchange"></i>
        </a>
    </div>
    <p>
        资产信息
    </p>
    <div class="am-header-right am-header-nav">
        <a id="save" href="#right-link" class="">
            <i class="am-header-icon am-icon-save"></i>
        </a>
    </div>
</header>

<ul class="am-list admin-sidebar-list" id="collapase-nav-1">

    <li class="am-panel">
        <p data-am-collapse="{parent: '#collapase-nav-1', target: '#user-nav'}">
            车辆信息<i class="am-icon-angle-right am-fr am-margin-right"></i>
        </p>
        <ul class="am-list am-collapse admin-sidebar-sub" id="user-nav">
            <li>
                <table class="tt">
                    <tr class="tr1" id="addcar">
                        <td>车辆品牌</td>
                        <td>裸车价格</td>
                        <td>月供金额</td>
                        <td>购车时间</td>
                        <td>车辆归属地</td>
                    </tr>

                </table>
            </li>
            <li>
                <p>
                    添加车辆：
                    <i class="am-margin-right am-fr am-icon-plus-square" id="doc-confirm-toggle"></i>
                </p>
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
                <p>
                    征信信息：
                    <select data-am-selected>
                        <option value="a">白户</option>
                        <option value="b">黑户</option>
                        <option value="o">不良记录</option>
                    </select>
                </p>
            </li>
            <li>
                <p>
                    有无征信逾期：
                    <select data-am-selected>
                        <option value="a">有</option>
                        <option value="b">无</option>
                    </select>
                </p>
            </li>
            <li>
                <div>
                    近三月逾期笔数：
                    <input type="text">
                </div>
            </li>
        </ul>
    </li>

    <li class="am-panel">
        <p data-am-collapse="{parent: '#collapase-nav-1', target: '#role-nav'}">
            其他信息 <i class="am-icon-angle-right am-fr am-margin-right"></i>
        </p>

    </li>

</ul>
<div class="am-modal am-modal-confirm" tabindex="-1" id="my-confirm">
    <div class="am-modal-dialog">
        <div class="am-modal-hd">添加车辆</div>
        <div class="am-modal-bd">
            <ul class="car" id="add_car">
                <li>
                    <div>
                        <span class="car_s" >车辆品牌:</span>
                        <input type="text" class="car_in" id="sclpp">
                    </div>
                </li>
                <li>
                    <div>
                        <span class="car_s" >裸车价格:</span>
                        <input type="text" class="car_in" id="slcj">
                    </div>
                </li>
                <li>
                    <div>
                        <span class="car_s" > 月供金额：</span>
                        <input type="text" class="car_in" id="sygje">
                    </div>
                </li>
                <li>
                    <div>
                        <span class="car_s">购车时间：</span>
                        <div class="am-input-group am-datepicker-date" data-am-datepicker="{format: 'dd-mm-yyyy'}">
                            <input id="sgcsj" type="text" class="am-form-field" readonly>
                            <span class="am-input-group-btn am-datepicker-add-on">
    <button class="am-btn am-btn-default" type="button"><span class="am-icon-calendar"></span> </button>
  </span>
                        </div>

                    </div>
                </li>
                <li>
                    <div>
                        <span class="car_s" id="sclgsd"> 车辆归属地：</span>
                        <input type="text" class="car_in">
                    </div>
                </li>
            </ul>
        </div>
        <div class="am-modal-footer">
            <span class="am-modal-btn" data-am-modal-cancel>取消</span>
            <span class="am-modal-btn" data-am-modal-confirm>确定</span>
        </div>
    </div>
</div>

<script>
    $().collapse('toggle');
    $(document).ready(lookcar())
    $('p').click(function () {
        if ($(this).next().length > 0) {
            if ($(this).children().hasClass('am-icon-angle-down')) {
                $(this).children().removeClass('am-icon-angle-down');
                $(this).children().addClass('am-icon-angle-right');
            } else {
                $(this).children().removeClass('am-icon-angle-right');
                $(this).children().addClass('am-icon-angle-down');
                $(this).parent().siblings().children('p').children().removeClass('am-icon-angle-down')
                $(this).parent().siblings().children('p').children().addClass('am-icon-angle-right')
            }
        }
    })
    $(function () {
        var sclpp = document.getElementById("sclpp").value;
        var slcj = document.getElementById("slcj").value;
        var sygje = document.getElementById("sygje").value;
        var sgcsj = document.getElementById("sgcsj").value;
        var sclgsd = document.getElementById("sclgsd").value;
        $('#doc-confirm-toggle').on('click', function () {
            $('#my-confirm').modal({
                relatedTarget: this,
                onConfirm: function (options) {
                    $.ajax({
                        url: "../../clxx/savecar",
                        data: {
                            "ITEM_CLPP": sclpp,
                            "ITEM_CLGSD": sclgsd,
                            "ITEM_GCSJ": sgcsj,
                            "ITEM_LCJ": slcj,
                            "ITEM_YGJE": sygje,
                            "khid": '11e7-4b65-78f40f54-bf3c-41af9a58bf20'
                        },
                        contentType: "application/x-www-form-urlencoded",
                        type: "post",
                        dataType: "json",
                        success: function (data) {
                            console.log("success");
                        },
                        error: function () {

                        }
                    })
                },
                // closeOnConfirm: false,
                onCancel: function () {

                }
            });
        });
    });

    function lookcar() {
        $.ajax({
            url: "../../clxx/readcar",
            data: {
                "khid": '11e7-4b65-78f40f54-bf3c-41af9a58bf20'
            },
            contentType: "application/x-www-form-urlencoded",
            type: "post",
            dataType: "json",
            success: function (data) {
                var tlk = data.tlkKhClxxEntityList;
                for (var i = 0; i < tlk.length; i++) {
                    var ht = ht + '<tr class="tr2"> \
                       <td>' + tlk[i].itemClpp + '</td> \
                       <td>' + tlk[i].itemLcj + '</td> \
                   <td>' + tlk[i].itemYgje + '</td> \
                   <td>' + tlk[i].itemGcsj + '</td> \
                   <td>' + tlk[i].itemCLgsd + '</td> \
                   </tr>';
                }
                $("#addcar").after(ht);
            },
            error: function () {

            }

        })
    }
</script>

</body>
</html>