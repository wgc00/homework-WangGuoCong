<%@ taglib prefix="sitemesh" uri="http://www.opensymphony.com/sitemesh/decorator" %>
<%@ taglib prefix="decoder" uri="http://www.opensymphony.com/sitemesh/decorator" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title><sitemesh:title /></title>

    <%@include file="phone_resources_css.jsp"%>
    <%--引入相关的js等--%>
    <%@include file="phone_resources_js.jsp"%>

    <sitemesh:head />
</head>

<body>

<%--顶部区域--%>
<%@include file="phone_nav.jsp"%>
<div style="height: 4em;"></div>
<%--主体区域--%>
<div class="container">

<%--菜单栏--%>
<%--<%@include file="phone_left_nav.jsp"%>--%>
<%--body--%>
<%-- <%@include file="../jsp/phone_index.jsp"%>--%>
<%@include file="phone_body.jsp"%>

</div>
</body>
</html>