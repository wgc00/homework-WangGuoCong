<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/phone/add" method="post">
    <%--   <table>
           <caption>添加手机</caption>
           <tr>
               <td>手机编号：<input type="text" name="id"></td>
           </tr>
           <td>手机名称：<input type="text" name="name"></td>
           <tr>
               <td>手机品牌：<input type="text"  name="brand"></td>
           </tr>
           <tr>
               <td>手机价格：<input type="number" name="price"></td>
           </tr>
           <tr>
               <td>出售公司：<input type="text" name="company"></td>
           </tr>
           <tr>
               <td><input type="submit" value="添加手机"></td>
           </tr>
       </table>--%>
    <h3 align="center">手机添加</h3>
    <br/>
    <hr/>
    <div style="margin: auto; width: 300px;">
        <div class="input-group">
            <div class="input-group-prepend">
                <span class="input-group-text">编号&nbsp;&nbsp;&nbsp;</span>
            </div>
            <input type="text" aria-label="First name" class="form-control" name="id">
        </div>
        <br/>
        <div class="input-group">
            <div class="input-group-prepend">
                <span class="input-group-text">名称&nbsp;&nbsp;&nbsp;</span>
            </div>
            <input type="text" aria-label="First name" class="form-control" name="name">
        </div>
        <br/>
        <div class="input-group">
            <div class="input-group-prepend">
                <span class="input-group-text">品牌&nbsp;&nbsp;&nbsp;</span>
            </div>
            <input type="text" aria-label="First name" class="form-control" name="brand">
        </div>
        <br/>
        <div class="input-group">
            <div class="input-group-prepend">
                <span class="input-group-text">价格&nbsp;&nbsp;&nbsp;</span>
            </div>

            <input type="text" aria-label="First name" class="form-control" name="price">
        </div>
        <br/>
        <div class="input-group">
            <div class="input-group-prepend">
                <span class="input-group-text">公司&nbsp;&nbsp;&nbsp;</span>
            </div>
            <input type="text" aria-label="First name" class="form-control" name="company">
        </div>
        <br/>
    </div>
    <div id="submitDiv" style="text-align: center;">
        <input type="submit" value="添加" style="margin: 5px"> <input id="returnBtn" type="button" value="返回"
                                                                    style="margin: 5px">
    </div>
</form>
</body>
</html>

