<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/include/public.jsp"%>
<%@ include file="/WEB-INF/jsp/include/public.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no"
	name="viewport">
<title>运营管理平台-平台运营设置-频道设置</title>
</head>
<body class="sidebar-mini skin-red-light">
	<!-- Modal -->
	<div class="modal-header">
		<button type="button" class="close" data-dismiss="modal"
			aria-hidden="true">&times;</button>
		<h4 class="modal-title" id="editModalLabel">频道编辑</h4>
	</div>
	<form class="form-horizontal" id="editForm" method="post"
		action="${ctx}/platform/config/company/save">
		<input type="hidden" name="id" value="${company.id}"> 

		<div class="box-body modal-body">
			<div class="form-group col-lg-12">
				<label for="name" class="col-lg-2 control-label">公司名称:</label>
				<div class="col-lg-8">
					<input type="text" class="form-control" required
						value="${company.name}" name="name">
				</div>
			</div>
			<div class="form-group col-lg-12">
				<label for="name" class="col-lg-2 control-label">公司地址:</label>
				<div class="col-lg-8">
					<input type="text" class="form-control" required
						value="${company.address}" name="name">
				</div>
			</div>
		</div>
		
			<div class="modal-footer">
				<button type="button" class="btn btn-primary" data-dismiss="modal">
					<i class="fa fa-close "></i>关闭
				</button>
				<button type="submit" class="btn btn-success">
					<i class="fa fa-save "></i>保存
				</button>
			</div>
	</form>
</body>
<script src="${ctx}/resources/common/js/aikxian.common.tools.ajax.js"
	type="text/javascript"></script>
<script type="text/javascript"
	src="${ctx}/resources/plugins/upyunpai/async.js"></script>
<script src="${ctx}/resources/plugins/jQuery/ajaxfileupload.js"></script>
</html>