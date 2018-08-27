<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2018/8/26
  Time: 0:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录网站</title>
    <%@include file="/module/phone_resources_js.jsp" %>
</head>
<body>
<div style="margin-top: 20em"></div>
    <form action="/phone/userLogin" method="get">
        <table align="center">
            <tr>
                <th>用户名</th>
                <td><input type="text" name="name"></td>
            </tr>
            <tr>
                <th>密码：</th>
                <td><input type="password" name="pwd"></td>
            </tr>
            <tr>
                <td colspan="2" align="center"><input type="submit" id="loginBtn" value="登录"><a href="/userAdd">注册</a>
                </td>
            </tr>
        </table>
    </form>

<c:if test="${id ==1}">
    <script>
        alert("密码或账号有误，请重新输入！");
    </script>
</c:if>
<script>
    /*   $("#loginBtn").click(function (e) {
           var name = $(":text").val();
           var pwd = $(":password").val();
           //alert(name+","+pwd);
           $.ajax({
               method:"get",
               url:"/user/login",
               //data:{name:name,pwd:pwd}
           }).done(function (data) {
               alert(data);
               name.clear();
               pwd.clear();
           }).file(function () {
               alert("密码或账号有误请重新输入");
           });
       })*/
</script>

</body>
</html>
