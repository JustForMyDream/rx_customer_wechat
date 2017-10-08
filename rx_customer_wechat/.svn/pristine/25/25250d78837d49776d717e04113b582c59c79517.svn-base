<%@ page import="com.rx.webApplication.SessionStorage" %>
<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>融祥金融</title>
    <meta http-equiv ="proma" content = "no-cache"/>
    <meta http-equiv="cache-control" content="no cache" />
    <meta http-equiv="Cache-Control" content="no-siteapp"/>
    <meta http-equiv="expires" content="0" />

    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="description" content="">
    <meta name="keywords" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="renderer" content="webkit">
    <link rel="alternate icon" type="image/png" href="../i/favicon.png">
    <%@include file="../../page/jsAndCss.jsp"%>
    <link rel="stylesheet" href="../css/zichanxinxi.css"/>
    <link rel="stylesheet" href="../css/loader.css"/>
    <style type="text/css">
        .loader{
            display:none;
        }
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
            font-size: 12px;
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
            font-size: 11px;
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
            width: 75%;
            text-align: left;
        }

        .car_s {
            float: left;
            margin-left: -55px;
        }
        .am-input-group{
            width: 75%!important;
            float: right!important;
        }
        .am-form-field{
            border: none!important;
            text-align: left!important;
        }
        .am-selected-status{
            margin-right: 5px!important;
            text-align: left!important;
        }
        #yqbs{
            color: #000;
        }
        .am-selected-icon{
            margin-left: -7%!important;
        }
        .am-selected-btn{
            padding: 0;
            height: 37.5px;
        }
        .am-selected{
            width: 75%!important;
            padding: 0;
            height: 37.5px;
        }
        .am-modal-bd{
            overflow: scroll;
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

</header>

<ul class="am-list admin-sidebar-list" id="collapase-nav-1">

    <li class="am-panel">
        <p data-am-collapse="{parent: '#collapase-nav-1', target: '#car-nav'}">
            车辆信息<i class="am-icon-angle-right am-fr am-margin-right"></i>
        </p>
        <ul class="am-list am-collapse admin-sidebar-sub" id="car-nav">
            <li>
                <table class="tt">
                    <tr class="tr1" id="addcar">
                        <td>车辆品牌</td>
                        <td>裸车价(万元)</td>
                        <td>月供金额(元)</td>
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
        <p data-am-collapse="{parent: '#collapase-nav-1', target: '#house-nav'}">
            房产信息
            <i class="am-icon-angle-right am-fr am-margin-right"></i>
        </p>
        <ul class="am-list am-collapse admin-sidebar-sub" id="house-nav">
            <li>
                <table class="tt">
                    <tr class="tr1" id="addhouse">
                        <td>房产性质</td>
                        <td>月供金额(元)</td>
                        <td>房屋类型</td>
                        <td>总面积(平米)</td>
                        <td>市场单价(元)</td>
                    </tr>
                </table>
            </li>
            <li>
                <p>
                    添加房产：
                    <i class="am-margin-right am-fr am-icon-plus-square" id="doc-confirm-toggle_f"></i>
                </p>
            </li>
        </ul>
    </li>

    <li class="am-panel">
        <p data-am-collapse="{parent: '#collapase-nav-1', target: '#shop-nav'}">
           商铺信息
            <i class="am-icon-angle-right am-fr am-margin-right"></i>
        </p>
        <ul class="am-list am-collapse admin-sidebar-sub" id="shop-nav">
            <li>
                <table class="tt">
                    <tr class="tr1" id="addshop">
                        <td>商铺楼层</td>
                        <td>商铺性质</td>
                        <td>月供金额(元)</td>
                        <td>租金收益(元)</td>
                        <td>评估价值(万元)</td>
                    </tr>
                </table>
            </li>
            <li>
                <p>
                    添加商铺：
                    <i class="am-margin-right am-fr am-icon-plus-square" id="doc-confirm-toggle_s"></i>
                </p>
            </li>
        </ul>
    </li>
    <li class="am-panel">
        <p data-am-collapse="{parent: '#collapase-nav-1', target: '#Gjjxx-nav'}">
            公积金信息
            <i class="am-icon-angle-right am-fr am-margin-right"></i>
        </p>
        <ul class="am-list am-collapse admin-sidebar-sub" id="Gjjxx-nav">
            <li>
                <table class="tt">
                    <tr class="tr1" id="addgjj">
                        <td>缴费开始时间</td>
                        <td>缴费结束时间</td>
                        <td>账户状态</td>
                        <td>账户余额(元)</td>
                        <td>月供金额(万元)</td>
                    </tr>
                </table>
            </li>
            <li>
                <p>
                    添加公积金：
                    <i class="am-margin-right am-fr am-icon-plus-square" id="doc-confirm-toggle_g"></i>
                </p>
            </li>
        </ul>
    </li>
    <li class="am-panel">
        <p data-am-collapse="{parent: '#collapase-nav-1', target: '#Cbxx-nav'}">
            参保信息
            <i class="am-icon-angle-right am-fr am-margin-right"></i>
        </p>
        <ul class="am-list am-collapse admin-sidebar-sub" id="Cbxx-nav">
            <li>
                <table class="tt">
                    <tr class="tr1" id="addcbxx">
                        <td>参保种类</td>
                        <td>单位名称</td>
                        <td>人员所属区域</td>
                        <td>是否退休</td>
                        <td>当前状态</td>
                    </tr>
                </table>
            </li>
            <li>
                <p>
                    添加参保信息：
                    <i class="am-margin-right am-fr am-icon-plus-square" id="doc-confirm-toggle_cb"></i>
                </p>
            </li>
        </ul>
    </li>
    <li class="am-panel">
        <p data-am-collapse="{parent: '#collapase-nav-1', target: '#Gsxx-nav'}">
            公司信息
            <i class="am-icon-angle-right am-fr am-margin-right"></i>
        </p>
        <ul class="am-list am-collapse admin-sidebar-sub" id="Gsxx-nav">
            <li>
                <table class="tt">
                    <tr class="tr1" id="addgsxx">
                        <td>单位名称</td>
                        <td>单位地址</td>
                        <td>单位性质</td>
                        <td>经营模式</td>
                        <td>职位信息</td>
                    </tr>
                </table>
            </li>
            <li>
                <p>
                    添加公司信息：
                    <i class="am-margin-right am-fr am-icon-plus-square" id="doc-confirm-toggle_gs"></i>
                </p>
            </li>
        </ul>
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
                        <span class="car_s" >裸车价(万元):</span>
                        <input type="text" class="car_in" id="slcj">
                    </div>
                </li>
                <li>
                    <div>
                        <span class="car_s"> 月供金额(元)：</span>
                        <input type="text" class="car_in" id="sygje">
                    </div>
                </li>
                <li>
                    <div>
                        <span class="car_s">购车时间：</span>
                        <div class="am-input-group am-datepicker-date" >
                            <input id="sgcsj" type="date" style="width: 100%"/>
                        </div>

                    </div>
                </li>
                <li>
                    <div>
                        <span class="car_s"> 车辆归属地：</span>
                        <input type="text" id="sclgsd" class="car_in">
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

<div class="am-modal am-modal-confirm" tabindex="-1" id="my-confirm_h">
    <div class="am-modal-dialog">
        <div class="am-modal-hd">添加房产信息</div>
        <div class="am-modal-bd">
            <ul class="car" id="add_house">
                <li>
                    <div>
                        <span class="car_s" >房产性质:</span>
                        <select data-am-selected id="sfcxz" class="car_in">
                            <option value="全款">全款</option>
                            <option value="按揭">按揭</option>
                        </select>
                    </div>
                </li>
                <li>
                    <div>
                        <span class="car_s" >房屋类型:</span>
                        <select data-am-selected id="sfwlx" class="car_in">
                            <option value="商品房">商品房</option>
                            <option value="拆迁安置房">拆迁安置房</option>
                            <option value="拆迁安置房">单位房</option>
                            <option value="拆迁安置房">自建房</option>
                            <option value="拆迁安置房">商铺</option>
                        </select>
                    </div>
                </li>
                <li>
                    <div>
                        <span class="car_s" >双证是否齐全:</span>
                        <select data-am-selected id="sszsfqq" class="car_in">
                            <option value="是">是</option>
                            <option value="否">否</option>
                        </select>
                    </div>
                </li>
                <li>
                    <div>
                        <span class="car_s" >月供金额(元):</span>
                        <input type="text" class="car_in" id="ygje">
                    </div>
                </li>
                <li>
                    <div>
                        <span class="car_s"> 总面积(平米)：</span>
                        <input type="text" class="car_in" id="szmj">
                    </div>
                </li>

                <li>
                    <div>
                        <span class="car_s"> 市场单价：</span>
                        <input type="text" id="scsdj" class="car_in">
                    </div>
            </li>
                <li>
                    <div>
                        <span class="car_s">购房时间：</span>
                        <div class="am-input-group am-datepicker-date" >
                            <input id="sgfsj" type="date" style="width: 100%"/>
                        </div>

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

<div class="am-modal am-modal-confirm" tabindex="-1" id="my-confirm_s">
    <div class="am-modal-dialog">
        <div class="am-modal-hd">添加商铺信息</div>
        <div class="am-modal-bd">
            <ul class="car" id="add_shop">
                <li>
                    <div>
                        <span class="car_s" >商铺地址:</span>
                        <input type="text" class="car_in" id="spdz">
                    </div>
                </li>
                <li>
                    <div>
                        <span class="car_s" >月供金额(元):</span>
                        <input type="text" class="car_in" id="spygje">
                    </div>
                </li>
                <li>
                    <div>
                        <span class="car_s">商铺楼层：</span>
                        <input type="text" id="splc" class="car_in">
                    </div>
                </li>
                <li>
                    <div>
                        <span class="car_s"> 租金收益(元)：</span>
                        <input type="text" id="spzjsy" class="car_in">
                    </div>
                </li>
                <li>
                    <div>
                        <span class="car_s" >商铺性质:</span>
                        <select data-am-selected id="spxz" class="car_in">
                            <option value="全款">全款</option>
                            <option value="按揭">按揭</option>
                        </select>
                    </div>
                </li>
                <li>
                    <div>
                        <span class="car_s"> 评估价值(万元)：</span>
                        <input type="text" class="car_in" id="pgjz">
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

<div class="am-modal am-modal-confirm" tabindex="-1" id="my-confirm_gj">
    <div class="am-modal-dialog">
        <div class="am-modal-hd">添加公积金信息</div>
        <div class="am-modal-bd">
            <ul class="car" id="add_ajj">
                <li>
                    <div>
                        <span class="car_s" >开始时间:</span>
                        <div class="am-input-group am-datepicker-date" >
                            <input id="gjjkssj" type="date" style="width: 100%"/>
                        </div>
                    </div>
                </li>
                <li>
                    <div>
                        <span class="car_s" >结束时间:</span>
                        <%--<div class="am-input-group am-datepicker-date" data-am-datepicker="{format: 'dd-mm-yyyy'}">--%>
                            <%--<input id="gjjjssj" type="text" class="am-form-field" readonly>--%>
                            <%--<span class="am-input-group-btn am-datepicker-add-on">--%>
    <%--<button class="am-btn am-btn-default" style=" background-color: #eeeeee!important;  margin-top: 3px!important;" type="button"><span class="am-icon-calendar"></span> </button>--%>
  <%--</span>--%>
                        <%--</div>--%>
                        <div class="am-input-group am-datepicker-date" >
                            <input id="gjjjssj" type="date" style="width: 100%"/>
                        </div>
                    </div>
                </li>
                <li>
                    <div>
                        <span class="car_s" >账号状态:</span>
                        <select data-am-selected id="zhzt" class="car_in">
                            <option value="缴存">缴存</option>
                            <option value="封存">封存</option>
                        </select>
                    </div>
                </li>
                <li>
                    <div>
                        <span class="car_s">账户余额(元)：</span>
                        <input type="text" id="zhye" class="car_in">
                    </div>
                </li>
                <li>
                    <div>
                        <span class="car_s"> 月存金额(元)：</span>
                        <input type="text" id="ycje" class="car_in">
                    </div>
                </li>

                <li>
                    <div>
                        <span class="car_s"> 备注：</span>
                        <textarea class="car_in" id="bz" style="border: none"></textarea>
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

<div class="am-modal am-modal-confirm" tabindex="-1" id="my-confirm_cb">
    <div class="am-modal-dialog">
        <div class="am-modal-hd">添加公积金信息</div>
        <div class="am-modal-bd">
            <ul class="car" id="add_cbxx">
                <li>
                    <div>
                        <span class="car_s" >参保种类:</span>
                        <select data-am-selected id="cbzl" class="car_in">
                            <option value="城职养老保险">城职养老保险</option>
                            <option value="机关养老保险">机关养老保险</option>
                            <option value="城乡养老保险">城乡养老保险</option>
                            <option value="城职医疗保险">城职医疗保险</option>
                            <option value="城乡医疗保险">城乡医疗保险</option>
                            <option value="工伤保险">工伤保险</option>
                            <option value="失业保险">失业保险</option>
                            <option value="生育保险">生育保险</option>
                            <option value="五险">五险</option>
                            <option value="六险">六险</option>
                        </select>
                    </div>
                </li>
                <li>
                    <div>
                        <span class="car_s"> 社保编号：</span>
                        <input type="text" id="sbbh" class="car_in">
                    </div>
                </li>
                <li>
                    <div>
                        <span class="car_s"> 单位名称：</span>
                        <input type="text" id="dwmc" class="car_in">
                    </div>
                </li>
                <li>
                    <div>
                        <span class="car_s">人员所属区域：</span>
                        <input type="text" id="ryssqy" class="car_in">
                    </div>
                </li>
                <li>
                    <div>
                        <span class="car_s" >是否退休:</span>
                        <select data-am-selected id="sftx" class="car_in">
                            <option value="是">是</option>
                            <option value="否">否</option>
                        </select>
                    </div>
                </li>
                <li>
                    <div>
                        <span class="car_s" >开始时间:</span>
                        <div class="am-input-group am-datepicker-date" >
                            <input id="kscbsj" type="date" style="width: 100%"/>
                            <%--<span class="am-input-group-btn am-datepicker-add-on">--%>
                            <%--<button class="am-btn am-btn-default" style=" background-color: #eeeeee!important;  margin-top: 3px!important;" type="button"><span class="am-icon-calendar"></span> </button>--%>
                            <%--</span>--%>
                        </div>
                    </div>
                </li>
                <li>
                    <div>
                        <span class="car_s" >当前状态:</span>
                        <select data-am-selected id="dqzt" class="car_in">
                            <option value="正常缴费">正常缴费</option>
                            <option value="终止缴费">终止缴费</option>
                        </select>
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

<div class="am-modal am-modal-confirm" tabindex="-1" id="my-confirm_gs">
    <div class="am-modal-dialog">
        <div class="am-modal-hd">添加公司信息</div>
        <div class="am-modal-bd">
            <ul class="car" id="add_gsxx">
                <li>
                    <div>
                        <span class="car_s"> 单位名称：</span>
                        <input type="text" id="gsdwmc" class="car_in">
                    </div>
                </li>
                <li>
                    <div>
                        <span class="car_s"> 经营场所：</span>
                        <input type="text" id="jycs" class="car_in">
                    </div>
                </li>
                <li>
                    <div>
                        <span class="car_s"> 单位地址：</span>
                        <input type="text" id="dwdz" class="car_in">
                    </div>
                </li>
                <li>
                    <div>
                        <span class="car_s"> 年营业额(万元)：</span>
                        <input type="text" id="nyye" class="car_in">
                    </div>
                </li>
                <li>
                    <div>
                        <span class="car_s" >单位性质:</span>
                        <select data-am-selected id="dwxz" class="car_in">
                            <option value="国有">国有</option>
                            <option value="民营">民营</option>
                            <option value="个体">个体</option>
                            <option value="其他">其他</option>
                        </select>
                    </div>
                </li>
                <li>
                    <div>
                        <span class="car_s"> 单位电话：</span>
                        <input type="text" id="dwdh" class="car_in">
                    </div>
                </li>
                <li>
                    <div>
                        <span class="car_s"> 经营模式：</span>
                        <input type="text" id="jyms" class="car_in">
                    </div>
                </li>
                <li>
                    <div>
                        <span class="car_s">应收账款(万元)：</span>
                        <input type="text" id="yszk" class="car_in">
                    </div>
                </li>
                <li>
                    <div>
                        <span class="car_s" >成立时间:</span>
                        <div class="am-input-group am-datepicker-date" >
                            <input id="clsj" type="date" style="width: 100%"/>
                            <%--<span class="am-input-group-btn am-datepicker-add-on">--%>
    <%--<button class="am-btn am-btn-default" style=" background-color: #eeeeee!important;  margin-top: 3px!important;" type="button"><span class="am-icon-calendar"></span> </button>--%>
  <%--</span>--%>
                        </div>
                    </div>
                </li>
                <li>
                    <div>
                        <span class="car_s" >职位:</span>
                        <select data-am-selected id="zw" class="car_in">
                            <option value="法人">法人</option>
                            <option value="股东">股东</option>
                            <option value="其他">其他</option>
                        </select>
                    </div>
                </li>
                <li>
                    <div>
                        <span class="car_s">负债情况(万元)：</span>
                        <input type="text" id="fzqk" class="car_in">
                    </div>
                </li>
                <li>
                    <div>
                        <span class="car_s">存货价值(万元)：</span>
                        <input type="text" id="chjz" class="car_in">
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
    $().collapse('toggle');
    var khid = "<%=session.getAttribute(SessionStorage.KHID)%>";
    if(khid!=null){
        console.log("khid:"+khid)
        lookcar();
        queryAll();
    }
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
    function DhhmCheck(parm) {
        var dhhm = /^(((13[0-9]{1})|(15[0-9]{1})|(18[0-9]{1}))+\d{8})$/;
        return dhhm.test(parm);
    }

 function queryAll() {
     $('#doc-confirm-toggle').on('click', function () {
         $('#my-confirm').modal({
             relatedTarget: this,
             onConfirm: function (options) {
                 var sclpp = document.getElementById("sclpp").value;
                 var slcj = document.getElementById("slcj").value;
                 var sygje = document.getElementById("sygje").value;
                 var sgcsj = document.getElementById("sgcsj").value;
                 var sclgsd = document.getElementById("sclgsd").value;
                 if(sclpp==""||slcj==""||sygje==""||sgcsj==""||sclgsd==""){
                     alert("请完善信息!");
                 }
                    else {
                     $(".loader").css("display","block");
                     $.ajax({
                         url: "/rx/clxx/savecar",
                         data: {
                             "ITEM_CLPP": sclpp,
                             "ITEM_CLGSD": sclgsd,
                             "ITEM_GCSJ": sgcsj,
                             "ITEM_LCJ": slcj,
                             "ITEM_YGJE": sygje,
                             "ITEM_KHID": khid
                         },
                         type: "post",
                         dataType: "json",
                         success: function (data) {
                             if (data.code == 200) {
                                 $("body").cftoaster({
                                     content: "保存成功",
                                     fontColor: "#000000",
                                     backgroundColor: "#F5F5F5",
                                     maxWidth: "200px"
                                 });
                                 var ht = ht + '<tr class="tr2"> \
                       <td>' + sclpp + '</td> \
                       <td>' + slcj + '</td> \
                   <td>' + sygje + '</td> \
                   <td>' + sgcsj + '</td> \
                   <td>' + sclgsd + '</td> \
                   </tr>';
                                 $("#addcar").after(ht);
                             } else {
                                 $("body").cftoaster({
                                     content: "保存失败",
                                     fontColor: "#000000",
                                     backgroundColor: "#F5F5F5",
                                     maxWidth: "200px"
                                 });
                             }
                         },
                         error: function () {

                         }
                     })
                 }
             },
             onCancel: function () {

             }
         });
     });

     $('#doc-confirm-toggle_f').on('click', function () {
         $('#my-confirm_h').modal({
             relatedTarget: this,
             onConfirm: function (options) {
                 var sfcxz = $("#sfcxz").find("option:selected").val();
                 var sfwlx = $("#sfwlx").find("option:selected").val();
                 var sszsfqq = $("#sszsfqq").find("option:selected").val();
                 var ygje = document.getElementById("ygje").value;
                 var szmj = document.getElementById("szmj").value;
                 var scsdj = document.getElementById("scsdj").value;
                 var sgfsj = document.getElementById("sgfsj").value;
                 if(sfcxz==""||sfwlx==""||sszsfqq==""||ygje==""||szmj==""||scsdj==""||sgfsj==""){
                     alert("请完善信息!");
                 }
                 else {
                     $.ajax({
                         url: "/rx/clxx/savehouse",
                         data: {
                             "ITEM_FCXZ": sfcxz,
                             "ITEM_JZLX": sfwlx,
                             "ITEM_SZSFQQ": sszsfqq,
                             "ITEM_GFSJ": sgfsj,
                             "ITEM_JZMJ": szmj,
                             "ITEM_YGJE": ygje,
                             "ITEM_SCDJ": scsdj,
                             "ITEM_KHID": khid
                         },
                         type: "post",
                         dataType: "json",
                         success: function (data) {
                             if (data.code == 200) {
                                 $("body").cftoaster({
                                     content: "保存成功",
                                     fontColor: "#000000",
                                     backgroundColor: "#F5F5F5",
                                     maxWidth: "200px"
                                 });
                                 var htf = htf + '<tr class="tr2"> \
                       <td>' + sfcxz + '</td> \
                       <td>' + ygje + '</td> \
                   <td>' + sfwlx + '</td> \
                   <td>' + szmj + '</td> \
                   <td>' + scsdj + '</td> \
                   </tr>';
                                 $("#addhouse").after(htf);
                             } else {
                                 $("body").cftoaster({
                                     content: "保存失败",
                                     fontColor: "#000000",
                                     backgroundColor: "#F5F5F5",
                                     maxWidth: "200px"
                                 });
                             }

                         },
                         error: function () {

                         }
                     })
                 }

             },
             onCancel: function () {

             }
         });
     });

     $('#doc-confirm-toggle_s').on('click', function () {
         $('#my-confirm_s').modal({
             relatedTarget: this,
             onConfirm: function (options) {
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
                     $.ajax({
                         url: "/rx/clxx/saveshop",
                         data: {
                             "ITEM_SPDZ": spdz,
                             "ITEM_YGJE": spygje,
                             "ITEM_SPLC": splc,
                             "ITEM_SPZJSY": spzjsy,
                             "ITEM_SPPGJZ": pgjz,
                             "ITEM_SPXZ": spxz,
                             "ITEM_KHID": khid
                         },
                         type: "post",
                         dataType: "json",
                         success: function (data) {
                             if (data.code == 200) {
                                 $("body").cftoaster({
                                     content: "保存成功",
                                     fontColor: "#000000",
                                     backgroundColor: "#F5F5F5",
                                     maxWidth: "200px"
                                 });
                                 var hts = hts + '<tr class="tr2"> \
                       <td>' + splc + '</td> \
                       <td>' + spxz + '</td> \
                   <td>' + spygje + '</td> \
                   <td>' + spzjsy + '</td> \
                   <td>' + spygje + '</td> \
                   </tr>';
                                 $("#addshop").after(hts)
                             } else {
                                 $("body").cftoaster({
                                     content: "保存失败",
                                     fontColor: "#000000",
                                     backgroundColor: "#F5F5F5",
                                     maxWidth: "200px"
                                 });
                             }

                         },
                         error: function () {

                         }
                     })
                 }

             },
             onCancel: function () {

             }
         });
     });

     $('#doc-confirm-toggle_g').on('click', function () {
         $('#my-confirm_gj').modal({
             relatedTarget: this,
             onConfirm: function (options) {
                 var gjjkssj = document.getElementById("gjjkssj").value;
                 var gjjjssj = document.getElementById("gjjjssj").value;
                 var zhzt = document.getElementById("zhzt").value;
                 var zhye = document.getElementById("zhye").value;
                 var ycje = document.getElementById("ycje").value;
                 var bz = document.getElementById("bz").value;
                 if(gjjkssj==""||gjjjssj==""||zhzt==""||zhye==""||ycje==""||bz==""){
                     alert("请完善信息!");
                 }
                 else {
                     $.ajax({
                         url: "/rx/clxx/savegjj",
                         data: {
                             "ITEM_GJJJCKSSJ": gjjkssj,
                             "ITEM_GJJJCJSSJ": gjjjssj,
                             "ITEM_ZHZT": zhzt,
                             "ITEM_BZ": bz,
                             "ITEM_ZHYE": zhye,
                             "ITEM_YJCJE": ycje,
                             "ITEM_KHID": khid
                         },
                         type: "post",
                         dataType: "json",
                         success: function (data) {
                             if (data.code == 200) {
                                 $("body").cftoaster({
                                     content: "保存成功",
                                     fontColor: "#000000",
                                     backgroundColor: "#F5F5F5",
                                     maxWidth: "200px"
                                 });
                                 var htg = htg + '<tr class="tr2"> \
                       <td>' + gjjkssj + '</td> \
                       <td>' + gjjjssj + '</td> \
                   <td>' + zhzt + '</td> \
                   <td>' + zhye + '</td> \
                   <td>' + ycje + '</td> \
                   </tr>';
                                 $("#addgjj").after(htg);
                             } else {
                                 $("body").cftoaster({
                                     content: "保存失败",
                                     fontColor: "#000000",
                                     backgroundColor: "#F5F5F5",
                                     maxWidth: "200px"
                                 });
                             }
                         },
                         error: function () {

                         }
                     })
                 }

             },
             onCancel: function () {

             }
         });
     });

     $('#doc-confirm-toggle_cb').on('click', function () {
         $('#my-confirm_cb').modal({
             relatedTarget: this,
             onConfirm: function (options) {
                 var cbzl = $("#cbzl").find("option:selected").val();
                 var sftx = $("#sftx").find("option:selected").val();
                 var dqzt = $("#dqzt").find("option:selected").val();
                 var sbbh = document.getElementById("sbbh").value;
                 var dwmc = document.getElementById("dwmc").value;
                 var ryssqy = document.getElementById("ryssqy").value;
                 var kscbsj = document.getElementById("kscbsj").value;
                 if(cbzl==""||sftx==""||dqzt==""||sbbh==""||dwmc==""||ryssqy==""||kscbsj==""){
                     alert("请完善信息!");
                 }
                 else {
                     $.ajax({
                         url: "/rx/clxx/savecbxx",
                         data: {
                             "ITEM_CBZL": cbzl,
                             "ITEM_SFTX": sftx,
                             "ITEM_DQZT": dqzt,
                             "ITEM_SBBH": sbbh,
                             "ITEM_DWMC": dwmc,
                             "ITEM_RYSSQY": ryssqy,
                             "ITEM_CBKSSJ": kscbsj,
                             "ITEM_KHID": khid
                         },
                         type: "post",
                         dataType: "json",
                         success: function (data) {
                             if (data.code == 200) {
                                 $("body").cftoaster({
                                     content: "保存成功",
                                     fontColor: "#000000",
                                     backgroundColor: "#F5F5F5",
                                     maxWidth: "200px"
                                 });
                                 var htcb = htcb + '<tr class="tr2"> \
                       <td>' + cbzl + '</td> \
                       <td>' + dwmc + '</td> \
                   <td>' + ryssqy + '</td> \
                   <td>' + sftx + '</td> \
                   <td>' + dqzt + '</td> \
                   </tr>';

                                 $("#addcbxx").after(htcb);
                             } else {
                                 $("body").cftoaster({
                                     content: "保存失败",
                                     fontColor: "#000000",
                                     backgroundColor: "#F5F5F5",
                                     maxWidth: "200px"
                                 });
                             }
                         },
                         error: function () {

                         }
                     })
                 }

             },
             onCancel: function () {

             }
         });
     });

     $('#doc-confirm-toggle_gs').on('click', function () {
         $('#my-confirm_gs').modal({
             relatedTarget: this,
             onConfirm: function (options) {
                 var dwxz = $("#dwxz").find("option:selected").val();
                 var zw = $("#zw").find("option:selected").val();
                 var gsdwmc  = document.getElementById("gsdwmc").value;
                 var dwdz  = document.getElementById("dwdz").value;
                 var jycs  = document.getElementById("jycs").value;
                 var nyye  = document.getElementById("nyye").value;
                 var dwdh  = document.getElementById("dwdh").value;
                 var jyms  = document.getElementById("jyms").value;
                 var yszk  = document.getElementById("yszk").value;
                 var clsj  = document.getElementById("clsj").value;
                 var fzqk  = document.getElementById("fzqk").value;
                 var chjz = document.getElementById("chjz").value;
                 if(dwxz==""||zw==""||gsdwmc==""||dwdz==""||jycs==""||nyye==""||dwdh==""
                     ||jyms==""||yszk==""||clsj==""||fzqk==""||chjz==""){
                     alert("请完善信息!");
                 }
                 else {
                     $.ajax({
                         url: "/rx/clxx/savegsxx",
                         data: {
                             "ITEM_DWMC": gsdwmc,
                             "ITEM_DWDZ": dwdz,
                             "ITEM_JYCS": jycs,
                             "ITEM_DWXZ": dwxz,
                             "ITEM_ZW": zw,
                             "ITEM_NYYE": nyye,
                             "ITEM_DWDH": dwdh,
                             "ITEM_JYMS": jyms,
                             "ITEM_YSZK": yszk,
                             "ITEM_CLSJ": clsj,
                             "ITEM_FZQK": fzqk,
                             "ITEM_CHJZ": chjz,
                             "ITEM_KHID": khid
                         },
                         type: "post",
                         dataType: "json",
                         success: function (data) {
                             if (data.code == 200) {
                                 $("body").cftoaster({
                                     content: "保存成功",
                                     fontColor: "#000000",
                                     backgroundColor: "#F5F5F5",
                                     maxWidth: "200px"
                                 });
                                 var htgs = htgs + '<tr class="tr2"> \
                       <td>' + gsdwmc + '</td> \
                       <td>' + dwdz + '</td> \
                   <td>' + dwxz + '</td> \
                   <td>' + jyms + '</td> \
                   <td>' + zw + '</td> \
                   </tr>';
                                 $("#addgsxx").after(htgs);
                             } else {
                                 $("body").cftoaster({
                                     content: "保存失败",
                                     fontColor: "#000000",
                                     backgroundColor: "#F5F5F5",
                                     maxWidth: "200px"
                                 });
                             }
                         },
                         error: function () {

                         }
                     })
                 }

             },
             onCancel: function () {

             }
         });
     });
 }
    function go() {
        window.location.href = "https://open.weixin.qq.com/connect/oauth2/authorize?appid=wxb5e53b1e6a25c317&redirect_uri=http%3A%2F%2Fwww.chenxuantong.cn%2Frx%2FoauthWechat%2FauthUserLogin&response_type=code&scope=snsapi_userinfo&state=0#wechat_redirect";
    }
    function lookcar() {
        $.ajax({
            url: "../../rx/clxx/readcar",
            data: {
                "khid": khid
            },
            type: "get",
            dataType: "json",
            success: function (data) {
                console.log(data);
                var tlk = data.tlkKhClxxEntityList;
                var tlkfc=data.tlkKhFcxxEntityList;
                var tlksp=data.tlkKhSpxxEntityList;
                var tlkgjj=data.tlkKhGjjxxEntityList;
                var tlkcb=data.tLkKhCbxxEntityList;
                var tlkgs=data.tlkKhGsxxEntityList;
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

                for (var i=0;i<tlkfc.length;i++){
                    var htf =htf+ '<tr class="tr2"> \
                       <td>' + tlkfc[i].itemFcxz + '</td> \
                       <td>' + tlkfc[i].itemYgje + '</td> \
                   <td>' + tlkfc[i].itemJzlx + '</td> \
                   <td>' + tlkfc[i].itemJzmj + '</td> \
                   <td>' + tlkfc[i].itemScdj + '</td> \
                   </tr>';
                }
                $("#addhouse").after(htf);

                for (var i=0;i<tlksp.length;i++){
                    var hts =hts+ '<tr class="tr2"> \
                       <td>' + tlksp[i].itemSplc + '</td> \
                       <td>' + tlksp[i].itemSpxz + '</td> \
                   <td>' + tlksp[i].itemYgje + '</td> \
                   <td>' + tlksp[i].itemSpzjsy + '</td> \
                   <td>' + tlksp[i].itemSppgjz + '</td> \
                   </tr>';
                }
                $("#addshop").after(hts)

                for (var i=0;i<tlkgjj.length;i++){
                    var htg =htg+ '<tr class="tr2"> \
                       <td>' + tlkgjj[i].itemGjjjckssj + '</td> \
                       <td>' + tlkgjj[i].itemGjjjcjssj + '</td> \
                   <td>' + tlkgjj[i].itemZhzt + '</td> \
                   <td>' + tlkgjj[i].itemZhye + '</td> \
                   <td>' + tlkgjj[i].itemYjcje + '</td> \
                   </tr>';
                }
                $("#addgjj").after(htg);

                for (var i=0;i<tlkcb.length;i++){
                    var htcb =htcb+ '<tr class="tr2"> \
                       <td>' + tlkcb[i].itemCbzl + '</td> \
                       <td>' + tlkcb[i].itemDwmc + '</td> \
                   <td>' + tlkcb[i].itemRyssqy + '</td> \
                   <td>' + tlkcb[i].itemSftx + '</td> \
                   <td>' + tlkcb[i].itemDqzt + '</td> \
                   </tr>';
                }
                $("#addcbxx").after(htcb);

                for (var i=0;i<tlkgs.length;i++){
                    var htgs =htgs+ '<tr class="tr2"> \
                       <td>' + tlkgs[i].itemDwmc + '</td> \
                       <td>' + tlkgs[i].itemDwdz + '</td> \
                   <td>' + tlkgs[i].itemDwxz + '</td> \
                   <td>' + tlkgs[i].itemJyms + '</td> \
                   <td>' + tlkgs[i].itemZw + '</td> \
                   </tr>';
                }
                $("#addgsxx").after(htgs);

            },
            error: function () {

            }

        })

    }
</script>

</body>
</html>