<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title></title>
		<link rel="stylesheet" href="css/bootstrap.min.css" />
		<script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
		<script type="text/javascript" src="js/bootstrap.min.js"></script>
		<link rel="stylesheet" href="themes/default/default.css" />
		<script charset="utf-8" src="js/kindeditor-all-min.js"></script>
		<script charset="utf-8" src="lang/zh-CN.js"></script>
	</head>

	<script type="text/javascript">
		var editor;
		KindEditor.ready(function(K) {
			editor = K.create('textarea[name="content"]', {
					allowFileManager : true
			});
		});
	</script>
	<body>
		<div class="container" style="width: 100%;">
			<div class="container" style="width: 80%;">
				<div class="row clearfix">
					<div class="col-md-12 column" style="margin-top: 10px;">
						<form>
							<input type="text" class="form-control" style="margin: 10px auto;text-align: center;"/>
							<textarea name="content" style="width:100%;height:400px;visibility:hidden;">KindEditor</textarea>
							<input type="button" class="btn btn-info" value="submit" style="float: right;margin: 10px;"/>
							<input type="button" class="btn btn-default" value="clear" style="float: right;margin: 10px;" />
						</form>
					</div>
				</div>
			</div>
			<!-- 底部联系方式 -->
			<div class="row clearfix" style="height: 200px;text-align: center;margin-top: 50px;">
				<div style="width: 100%;">
					<h3>联系作者</h3>
				</div>
				<div class="table-responsive">
					<table class="table">
						<tr>
							<td>QQ</td>
							<td>Email</td>
							<td>手机&amp;微信</td>
							<td>地址</td>
						</tr>
						<tr>
							<td>1464697820</td>
							<td>1464697820@qq.com</td>
							<td>15232321081</td>
							<td>河北省秦皇岛市燕山大学西校区</td>
						</tr>
					</table>
				</div>
			</div>
			<div style="height: 300px;padding-top:50px ;">
				<img class="img-responsive center-block" width="100px" src="img/head.png" />
			</div>
		
		</div>
	</body>

</html>