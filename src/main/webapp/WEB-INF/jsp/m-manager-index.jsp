<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title></title>
		<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/bootstrap.min.css" />
		<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/jquery-3.3.1.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/bootstrap.min.js"></script>
	</head>
	<style>
		ul {
			margin: 0px;
			padding: 0px;
			list-style: none;
		}
		
		ul li {
			float: left;
			margin: auto 10px;
		}
		.mf{
			width: 500px;
			float: left;
			margin: 10px 25px;
		}
		.fl{
			float: left;
		}
	</style>

	<body>
		<div class="container" style="width: 100%;">

			<div class="row clearfix">
				<div class="col-md-12 column" style="margin-top: 10px;">
					<div class="panel-group" id="panel-310453">
						<div class="panel panel-default">
							<div class="panel-heading">
								<a class="panel-title" data-toggle="collapse" data-parent="#panel-310453" href="#panel-element-608484">背景音乐设置</a>
							</div>
							<div id="panel-element-608484" class="panel-collapse collapse in">
								<div class="panel-body">
									<form role="form">
										<div class="form-group">
											<label for="exampleInputFile">File input</label><input type="file" id="exampleInputFile" />
											<p class="help-block">
												Example block-level help text here.
											</p>
										</div>
										<button type="submit" class="btn btn-default">Submit</button>
									</form>
								</div>
							</div>
						</div>
						<div class="panel panel-default">
							<div class="panel-heading">
								<a class="panel-title" data-toggle="collapse" data-parent="#panel-310453" href="#panel-element-225339">轮播图片设置</a>
							</div>
							<div id="panel-element-225339" class="panel-collapse collapse">
								<div class="panel-body">
									<label>添加图片</label>
									<input type="file" />
									<label>管理已存在项目</label>
									<ul>
										<li>
											<a href="#" data-toggle="modal" data-target="#myModal"><img src="${pageContext.request.contextPath}/static/img/banner3.jpg" width="100px" /></a>
											<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
												<div class="modal-dialog" role="document">
													<div class="modal-content">
														<div class="modal-header">
															<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
															<h4 class="modal-title" id="myModalLabel">Modal title</h4>
														</div>
														<div class="modal-body" style="width: 600px;">
															<img src="${pageContext.request.contextPath}/static/img/banner3.jpg" width="500px" style="margin: 0px auto;" /><br />
															<label>Title</label>
															<input type="text" class="form-control"/>
															<label>Content</label>
															<input type="text" class="form-control"/>
															<label>URL</label>
															<input type="text" class="form-control"/>
														</div>
														<div class="modal-footer">
															<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
															<button type="button" class="btn btn-primary">Save changes</button>
														</div>
													</div>
												</div>
											</div>
										</li>
										<li>
											<a href="#"><img src="${pageContext.request.contextPath}/static/img/banner3.jpg" width="100px" /></a>
										</li>
										<li>
											<a href="#"><img src="${pageContext.request.contextPath}/static/img/banner3.jpg" width="100px" /></a>
										</li>
										<li>
											<a href="#"><img src="${pageContext.request.contextPath}/static/img/banner3.jpg" width="100px" /></a>
										</li>
									</ul>
								</div>
							</div>
						</div>
						<div class="panel panel-default">
							<div class="panel-heading">
								<a class="panel-title" data-toggle="collapse" data-parent="#panel-310453" href="#panel-element-225332">文字设置</a>
							</div>
							<div id="panel-element-225332" class="panel-collapse collapse">
								<div class="panel-body">
									<form role="form">
										<div class="form-group">
											<label>PANAL：</label><input type="text" class="form-control" />
										</div>
										<div class="form-group">
											<label>联系-QQ</label><input type="text" class="form-control" />
										</div>
										<div class="form-group">
											<label>联系-电话&amp;微信</label><input type="text" class="form-control" />
										</div>
										<div class="form-group">
											<label>联系-email</label><input type="email" class="form-control" />
										</div>
										<div class="form-group">
											<label>联系-地址</label><input type="text" class="form-control" />
										</div>
										<button type="submit" class="btn btn-default">Submit</button>
									</form>
								</div>
							</div>
						</div>
						<div class="panel panel-default">
							<div class="panel-heading">
								<a class="panel-title" data-toggle="collapse" data-parent="#panel-310453" href="#panel-element-225333">图片设置</a>
							</div>
							<div id="panel-element-225333" class="panel-collapse collapse">
								<div class="panel-body">
									<form role="form">
										<ul>
											<li><img src="${pageContext.request.contextPath}/static/img/banner2.jpg" width="200px" class="fl" /><textarea class="align-self-center mf form-control" rows="4" ></textarea><button class="btn btn-default">删除</button></li>
											<li><img src="${pageContext.request.contextPath}/static/img/banner2.jpg" width="200px" class="fl" /><textarea class="align-self-center mf form-control" rows="4" ></textarea><button class="btn btn-default">删除</button></li>
										</ul>
										<button type="submit" class="btn btn-default">添加</button>
									</form>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>

			
			<div style="height: 150px;padding-top:50px ;">
				<img class="img-responsive center-block" width="100px" src="img/head.png" />
			</div>
		</div>
	</body>

</html>