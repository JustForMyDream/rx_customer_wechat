<%--
  Created by IntelliJ IDEA.
  User: 王玉粮
  Date: 2017/8/17
  Time: 16:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%--<meta http-equiv="X-UA-Compatible" content="IE=edge">--%>
    <%--<title>我的生活</title>--%>
    <%--<meta name="viewport" content="initial-scale=1, maximum-scale=1">--%>
    <%--<link rel="shortcut icon" href="/favicon.ico">--%>
    <%--<meta name="apple-mobile-web-app-capable" content="yes">--%>
    <%--<meta name="apple-mobile-web-app-status-bar-style" content="black">--%>

    <%--<link rel="stylesheet" href="//g.alicdn.com/msui/sm/0.6.2/css/sm.min.css">--%>
    <%--<link rel="stylesheet" href="//g.alicdn.com/msui/sm/0.6.2/css/sm-extend.min.css">>--%>
</head>
<body>
<input type="button" value="确认"  class="btn btn-success">
<!-- page集合的容器，里面放多个平行的.page，其他.page作为内联页面由路由控制展示 -->
<%--<div class="page-group">--%>
    <%--<!-- 单个page ,第一个.page默认被展示-->--%>
    <%--<div class="page">--%>
        <%--<!-- 标题栏 -->--%>
        <%--<header class="bar bar-nav">--%>
            <%--<a class="icon icon-me pull-left open-panel"></a>--%>
            <%--<h1 class="title">标题</h1>--%>
        <%--</header>--%>

        <%--<!-- 工具栏 -->--%>
        <%--<nav id = "test" class="bar bar-tab">--%>
            <%--<a id="a" class="tab-item external active" href="#">--%>
                <%--<span class="icon icon-home"></span>--%>
                <%--<span class="tab-label">首页</span>--%>
            <%--</a>--%>
            <%--<a id="b" class="tab-item external" href="#">--%>
                <%--<span class="icon icon-star"></span>--%>
                <%--<span class="tab-label">收藏</span>--%>
            <%--</a>--%>
            <%--<a id="c" class="tab-item external" href="#">--%>
                <%--<span class="icon icon-settings"></span>--%>
                <%--<span class="tab-label">设置</span>--%>
            <%--</a>--%>
        <%--</nav>--%>


    <%--</div>--%>

    <%--<!-- 其他的单个page内联页（如果有） -->--%>
    <%--<div class="page">...</div>--%>
<%--</div>--%>

<%--<!-- popup, panel 等放在这里 -->--%>
<%--<div class="panel-overlay"></div>--%>
<%--<!-- Left Panel with Reveal effect -->--%>
<%--<div class="panel panel-left panel-reveal">--%>
    <%--<div class="content-block">--%>
        <%--<p>这是一个侧栏</p>--%>
        <%--<p></p>--%>
        <%--<!-- Click on link with "close-panel" class will close panel -->--%>
        <%--<p><a href="#" class="close-panel">关闭</a></p>--%>
    <%--</div>--%>
<%--</div>--%>

<!-- 默认必须要执行$.init(),实际业务里一般不会在HTML文档里执行，通常是在业务页面代码的最后执行 -->
<%--<script type='text/javascript' src='//g.alicdn.com/sj/lib/zepto/zepto.min.js' charset='utf-8'></script>--%>
<%--<script type='text/javascript' src='//g.alicdn.com/msui/sm/0.6.2/js/sm.min.js' charset='utf-8'></script>--%>
<%--<script type='text/javascript' src='//g.alicdn.com/msui/sm/0.6.2/js/sm-extend.min.js' charset='utf-8'></script>--%>
<script src="../js/jquery.min.js"></script>
<script src="../js/jquery-3.1.1.min.js"></script>
<script>
//    var a = document.getElementById("a")
//    var b = document.getElementById("b")
//    var c = document.getElementById("c")
//
//    console.log(a)
//
//    var test = document.getElementById("test");
//
//    var testChildren = test.children;
//
//    console.log(testChildren[0]);
//
//
//    for(var i = 0;i < testChildren.length;i ++){
//        testChildren[i].onclick = function () {
//            testChildren[0].className = "tab-item external";
//        }
//        this.className = "tab-item external active";
//    }



//
//    var arr = [a,b,c]
//
//    console.log($("#a"))
//
//    console.log(arr[0])
//
//
//    document.getElementById("a").onclick = function () {
//        this.className = "tab-item external active";
//        b.className = "tab-item external";
//        c.className = "tab-item external"
//    }
//
//    document.getElementById("b").onclick = function () {
//        $("#b").addClass("active");
//        $("#a").removeClass("active");
//        $("#c").removeClass("active");
//    }
//
//    document.getElementById("c").onclick = function () {
//        $("#c").addClass("active");
//        $("#a").removeClass("active");
//        $("#b").removeClass("active");
//    }

    console.log($("input[value=\'确认\'][type=\'button\']"));

        $("input[value=\'确认\'][type=\'button\']").on("click",function () {
            console.log("11111111111");
        })

</script>


</body>


</html>
