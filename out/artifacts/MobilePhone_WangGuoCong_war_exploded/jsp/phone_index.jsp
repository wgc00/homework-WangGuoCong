<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>手机店</title>
    <%@include file="/module/phone_resources_css.jsp"%>
    <%--引入相关的js等--%>
    <%@include file="/module/phone_resources_js.jsp"%>
</head>



<body>
<%--条件查询--%>
<form action="<c:url value="/phone/queryName"/>" method="get" class="navbar-form navbar-right">
    <input type="text" class="form-control" name="txtName">
    <input class="btn btn-outline-success my-2 my-sm-0" type="submit" value="查询">
</form>
<%--查询全部--%>

   <form action="/phone/del" method="post">
        <table class="table table-responsive" id="phone_table">
            <tr>
                <th>多选<input type="checkbox" id="ches"></th>
                <th>手机编号</th>
                <th>手机名称</th>
                <th>手机品牌</th>
                <th>手机价格</th>
                <th>出售公司</th>
                <th>数据操作</th>
            </tr>
            <c:forEach items="${requestScope.phoneList}" var="phone">
                <tr>
                    <td><input type="checkbox" name="ids"  value="${phone.id}" ></td>
                    <td>${phone.id}</td>
                    <td>${phone.name}</td>
                    <td>${phone.brand}</td>
                    <td>${phone.price}</td>
                    <td>${phone.company}</td>
                    <td>
                        <a href="/phone/del?id=${phone.id}">删除</a>
                        <a data-toggle="modal" href="#myModal" data-id="${phone.id}">更新</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
      <%--  <a href="/phone/add">添加手机</a>--%>

        <input type="submit" value="批量删除">
       <a href=""></a>
   </form>
    <%@include file="phone_update.jsp" %>
<script>
    $(function () {
        $("#ches").click(function () {
            var $check = $("td :checkbox");
            for (var i = 0; i < $check.length; i++) {
                $check[i].checked = this.checked;
            }
        });
    });

</script>
</body>
</html>
