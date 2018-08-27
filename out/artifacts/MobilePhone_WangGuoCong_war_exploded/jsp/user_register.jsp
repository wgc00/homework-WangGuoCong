<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2018/8/26
  Time: 13:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册网页</title>
</head>
<%@include file="/module/phone_resources_js.jsp" %>
<body>
<div style="margin-top: 20em;"></div>
    <form action="/userAdd" method="post">
        <table align="center">
            <tr>
                <th>用户名</th>
                <td><input type="text" id="name" name="name"></td>
            </tr>
            <tr>
                <th>密码：</th>
                <td><input type="password" id="pwd" name="pwd"></td>
            </tr>
            <tr>
                <th>确认密码：</th>
                <td><input type="password" id="pwd1" name="passWord"></td>
            </tr>
            <tr>
                <td colspan="2" align="center"><input type="submit" id="loginBtn" value="注册"></td>
            </tr>
        </table>
    </form>

<script>
    $(function () {
        $("#loginBtn").click(function (e) {
            var val = $("#name").val();
            var $pwd = $("#pwd").val();
            var $pwd1 = $("#pwd1").val();
            if ($pwd == $pwd1) {
                alert("注册成功,欢迎您加入：" + val);
            } else {
                alert("注册失败，密码不一致");
                e.returnValue = false;
            }
        });
    });

</script>
</body>
</html>
