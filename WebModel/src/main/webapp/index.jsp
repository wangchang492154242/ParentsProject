<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/1/16 0016
  Time: 15:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="/web/js/jquery-3.2.1.min.js"></script>
    <script type="text/javascript">
        $(function () {
            $("#btn").click(function () {
                $.ajax({
                    url:"http://127.0.0.1:8081/controller/test.action",
                    type:"post",
                    success:function (res) {
                        alert("res"+res);
                    },
                    error:function (res) {
                        alert("error");
                    }
                });
            });
        });
    </script>
</head>
<body>
<button id="btn">连接controller</button><br/>


</body>
</html>
