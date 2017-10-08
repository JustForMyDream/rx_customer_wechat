<%@ page import="com.rx.webApplication.SessionStorage" %><%--
  Created by IntelliJ IDEA.
  User: 1010
  Date: 2017-07-26
  Time: 10:26
  To change this template use File | Settings | File Templates.
  --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
    <title>融祥金融</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="description" content="">
    <meta name="keywords" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="renderer" content="webkit">
    <meta http-equiv="Cache-Control" content="no-siteapp"/>
    <link rel="alternate icon" type="image/png" href="../i/favicon.png">
    <link rel="stylesheet" href="../css/amazeui.min.css"/>
    <link rel="stylesheet" href="../css/pageHeader.css"/>
    <script src="../js/jquery-3.1.1.min.js"></script>
    <script src="../js/amazeui.widgets.helper.min.js"></script>
    <script src="../js/amazeui.min.js"></script>
    <%@include file="../../page/jsAndCss.jsp"%>
    <style>
        .spanfont {
            padding-right: 10px;
            font-family: PingFangSC-Regular;
            font-size: 16px;
            color: #4a4a4a;
            letter-spacing: 0;
            line-height: 35px;
            text-align: left;
        }

        .bcfliter {
            background: url("../img/bcgroundYellow.png");
            width: 100%;
            /*height: 34%;*/
            text-align: center;
            padding-top: 27px;
            padding-bottom: 20px
        }

        a, a:hover, a:visited, a:link, a:active {
            text-decoration: none;
            out-line: none;
            color: #000000;
        }

        b {
            font-size: 16px;
            padding-left: 10px;
        }

        hr {
            border-top: 2px solid #ddd;
        rgba(151, 151, 151, 0.29);
            width: 95%;
            margin-bottom: 0px;
            margin-top: 0px;
            margin: 0.1rem auto;
            overflow: hidden;
            clear: both;
            display: block;
        }

        body {
            background-color: #fffefe;
        }

        .pheight {
            height: 35px;
            padding: 0px;
            margin: 0px;
        }


    </style>
    <script>

    </script>
</head>

<body>
<%--通过 TlkKhjcxxController 访问   /perInf/Info--%>
<header data-am-widget="header" class="am-header">
    <div class="am-header-left am-header-nav">
    </div>
    <p>
        用户信息
    </p>
    <div class="am-header-right am-header-nav">
        <a href="#right-link" class="">
        </a>
    </div>
</header>
<%--<c:set var="zxxx" value="${tLkKhjcxxEntity.itemZxxx eq null ? '暂无征信信息': tLkKhjcxxEntity.itemZxxx}"></c:set>--%>
<%--<c:set var="zylb" value="${tLkKhjcxxEntity.itemZylb eq null ? '暂无职业信息': tLkKhjcxxEntity.itemZylb}"></c:set>--%>
<%--<c:set var="sjhm" value="${tLkKhjcxxEntity.itemSjhm eq null ? '暂无手机号码':tLkKhjcxxEntity.itemSjhm}"></c:set>--%>
<%--<c:set var="zjhm" value="${tLkKhjcxxEntity.itemZjhm eq null ? '暂无座机号码':tLkKhjcxxEntity.itemZjhm}"></c:set>--%>
<div class="bcfliter">
    <img class="am-circle" src="${WechatUser.headimgurl}" onerror='this.src="../img/500.png"'
         style="width: 101px; height: 101px;"/>
    <p class="pwords class=pheight"><b style="padding-left:-10px;font-size: 18px;display: inline-block;">

        <c:choose>
            <c:when test="${tLkKhjcxxEntity.itemKhxm ne null}">
                ${tLkKhjcxxEntity.itemKhxm}
            </c:when>
            <c:when test="${tLkKhjcxxEntity.itemKhxm eq null && WechatUser.nickname ne null}">
                ${WechatUser.nickname}
            </c:when>
            <c:otherwise>暂无信息</c:otherwise>
        </c:choose>
    </b><c:if test="${tLkKhjcxxEntity.itemKhxb eq '男'}"><b
            class="am-icon-mars " style="padding-left: 15px;"></b></c:if>
        <c:if test="${tLkKhjcxxEntity.itemKhxb eq '女'}"><b class="am-icon-venus "
                                                           style="padding-left: 15px;"></b></c:if>
    </p>
</div>
<div class="am-panel-bd" style="padding-top: 20px">
    <p class="pheight"><span class="spanfont"><img src="../img/phoneIcon.jpg"
                                                   style="width: 17px;margin-right: 4px"></span><span
            class="spanfont"> ${tLkKhjcxxEntity.itemSjhm eq null ? '暂无':tLkKhjcxxEntity.itemSjhm} </span></p>
    <p class="pheight"><span class="spanfont"><img src="../img/telphoneIcon.jpg" style="width: 21px"></span><span
            class="spanfont">
        ${tLkKhjcxxEntity.itemZjhm eq null ? '暂无':tLkKhjcxxEntity.itemZjhm}
    </span><a></a></p>
    <c:set var="sfzxx" value="${tLkKhjcxxEntity.itemSfzhm}" scope="page"/>

    <p class="pheight"><span class="spanfont"><img src="../img/idCardIcon.jpg" style="width: 20px;"></span><span
            class="spanfont" style="margin-left: 5px"><c:if test="${sfzxx eq null}">暂无</c:if>
            <c:if test="${sfzxx ne null}">${fn:substring(sfzxx, 0, 10)}XXXX${fn:substring(sfzxx, 14,18)}</c:if></span>
    </p>
</div>
<hr/>

<div class="am-panel-bd" style="padding-top: 20px">
    <p class="pheight"><span class="spanfont"><img src="../img/zhengxinIcon.jpg"
                                                   style="margin-right: 7px; padding-bottom: 4px;width: 19px"></span><span
            class="spanfont">${tLkKhjcxxEntity.itemZxxx eq null ? '暂无': tLkKhjcxxEntity.itemZxxx}</span> <a
            href="../../rx/perInf/zhengxin?khid=${khid}"><img
            src="../img/arowRIcon.jpg" style="width: 10px;float: right;padding-top: 24px;"></a></p>
    <p class="pheight"><span class="spanfont"><img src="../img/identityIcon.jpg"
                                                   style="margin-right: 12px; width: 13px;"></span><span
            class="spanfont">${tLkKhjcxxEntity.itemZylb eq null ? '暂无': tLkKhjcxxEntity.itemZylb}</span>
        <a></a></p>
</div>
</body>
<script>
    var userLocation = "<%=session.getAttribute(SessionStorage.LOCATION)%>";
    var map, geolocation;
    //加载地图，调用浏览器定位服务
    var longitude;//经度
    var latitude;//纬度

    if(userLocation != "1"){
        map = new AMap.Map('container', {
            resizeEnable: true
        });

        map.plugin('AMap.Geolocation', function () {
            geolocation = new AMap.Geolocation({
                enableHighAccuracy: true,//是否使用高精度定位，默认:true
                timeout: 10000,          //超过10秒后停止定位，默认：无穷大
                buttonOffset: new AMap.Pixel(10, 20),//定位按钮与设置的停靠位置的偏移量，默认：Pixel(10, 20)
                zoomToAccuracy: true,      //定位成功后调整地图视野范围使定位位置及精度范围视野内可见，默认：false
                buttonPosition: 'RB'
            });
            map.addControl(geolocation);
            geolocation.getCurrentPosition();
            AMap.event.addListener(geolocation, 'complete', onComplete);//返回定位信息
            AMap.event.addListener(geolocation, 'error', onError);      //返回定位出错信息
        });

        //解析定位结果
        function onComplete(data) {
            longitude = data.position.getLng();
            latitude = data.position.getLat();
            console.log("longitude:" + longitude + ",latitude" + latitude);
            $.ajax({
                url: "../../rx/location/userLocation",
                data: {
                    "longitude": longitude,
                    "latitude": latitude
                },
                type: "get",
                dataType: "json",
                success: function (data) {
                    console.log(data);
                },
                error: function () {
                }
            })


//        var str=['定位成功'];
//        str.push('经度：' + data.position.getLng());
//        str.push('纬度：' + data.position.getLat());
//        if(data.accuracy){
//            str.push('精度：' + data.accuracy + ' 米');
//        }//如为IP精确定位结果则没有精度信息
//        str.push('是否经过偏移：' + (data.isConverted ? '是' : '否'));
//        document.getElementById('tip').innerHTML = str.join('<br>');
        }
        //解析定位错误信息
        function onError(data) {
            // document.getElementById('tip').innerHTML = '定位失败';
        }
    }
</script>
</html>
