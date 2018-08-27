<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2018/8/25
  Time: 15:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<form action="<c:url value="/phone/update" />" method="post" class="form-horizontal">
    <div class="modal fade" id="myModal" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                    <h4 class="modal-title" id="myModalLabel">更新手机信息</h4>
                </div>
                <div class="modal-body">
                    <div class="form-group">
                        <label for="phoneId" class="col-sm-2 control-label">手机编号</label>
                        <div class="col-sm-10">
                            <input type="text" id="phoneId" class="form-control" name="id" readonly="readonly">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="phoneName" class="col-sm-2 control-label">手机名称</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="phoneName" placeholder="手机名称" name="name">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="phoneBrand" class="col-sm-2 control-label">手机品牌</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="phoneBrand" placeholder="手机品牌" name="brand">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="phonePrice" class="col-sm-2 control-label">手机价格</label>
                        <div class="col-sm-10">
                            <input type="number" step="0.001" class="form-control" id="phonePrice" placeholder="手机价格"
                                   name="price">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="phoneCompany" class="col-sm-2 control-label">出售公司</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="phoneCompany" placeholder="出售公司" name="company">
                        </div>
                    </div>
                </div>
                <div class="modal-footer">
                    <div><input  type="submit" class="btn btn-primary" value="提交更新"></div>
                </div>
            </div>
        </div>
    </div>
</form>
<script>
    $("#myModal").on("show.bs.modal", function (e) {
        var id = $(e.relatedTarget).data("id");
        $.ajax({
            method: "get",
            url: "<c:url value="/phone/update" />",
            data: {id: id},
            dataType: "json"
        }).done(function (data) {
            $("#phoneId").val(data.id);
            $("#phoneName").val(data.name);
            $("#phoneBrand").val(data.brand);
            $("#phonePrice").val(data.price);
            $("#phoneCompany").val(data.company);
        }).fail(function (xhr, textStatus, errorThrown) {
            alert("操作失败了")
        });
    });
</script>
