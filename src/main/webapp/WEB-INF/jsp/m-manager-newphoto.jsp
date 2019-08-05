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
	</head>
	<style type="text/css">
		.panel-block{
			width: 40%;height: 50%;display: inline-block;
			margin: 5px;
			font-size: 20px;
		}
		.middle-text{
			position:relative;top:50%;transform:translateY(-50%);
		}
	</style>
	<body>
		<div class="container-fluid" style="width: 100%;">

			<div class="row clearfix" style="margin: 0px 150px;">
				<div class="col-md-4 column">
					<!--分组选择-->
					<div></div>
					<!--预览-->
					<div></div>
				</div>
				<div class="col-md-8 column">
					<!--图片选择-->
					<div class="form-group" style="height: 400px;width: 600px;background: #B9DEF0;margin-top: 30px;"></div>
					<!--题目-->
					<div class="form-group">
						<input class="form-control" type="text" placeholder="标题" />
					</div>
					<!--描述-->
					<div class="form-group">
						<textarea class="form-control" rows="3" placeholder="作品描述"></textarea>
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
							<td>手机&微信</td>
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