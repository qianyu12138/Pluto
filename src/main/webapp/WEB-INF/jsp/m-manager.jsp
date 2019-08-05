<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="UTF-8">
		<title></title>
		<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/bootstrap.min.css" />
		<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/jquery-3.3.1.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/bootstrap.min.js"></script>
	</head>

<style>
	body {
    width: 100%;
    height: 100%;
    margin: 0;
    overflow: hidden;
    background-color: #FFFFFF;
    font-family: "Microsoft YaHei", sans-serif;
 }
 .pageSidebar{
    width: 240px;
    height:100%;
    padding-bottom: 30px;
    overflow: auto;
    background-color: #e3e3e3;
 }
 .splitter {
     width: 5px;
     height: 100%;
     bottom: 0;
     left: 240px;
     position: absolute;
     overflow: hidden;
     background-color: #fff;
 }
 .pageContent{
     height: 100%;
     min-width: 768px;
     left: 246px;
     top: 0;
     right: 0;
     z-index: 3;
     padding-bottom: 30px;
     position: absolute;
 }
 .pageContainer{
     bottom: 0;
     left:0;
     right: 0;
     top: 50px;
     overflow: auto;
     position: absolute;
     width: 100%;
 }
 .footer {
     width: 100%;
     height: 30px;
     line-height: 30px;
     margin-top: 0;
     left: 0;
     right: 0;
     bottom: 0;
     position: absolute;
     z-index: 10;
     background-color:#DFDFDF;
 }
	.navbar-collapse{
    padding-left: 5px;
    padding-right: 5px;
 }
 .nav>li{
     text-align: center;
 }
 .nav>li>a{
     color:#444;
     margin: 0 5px;
 }
 .nav-pills>li.active>a, .nav-pills>li.active>a:focus, .nav-pills>li.active>a:hover{
     background-color: #222222;
 }
 .dropdown-menu{
     min-width: 200px;
     margin-left: 40px;
     background-color: #E3E3E3;
 }
 .dropdown-menu>li>a{
     padding: 10px 15px;
 }
</style>
	<body>
		<!--顶部导航栏部分-->
		<div class="row clearfix" style="height: 50px;">
				<div class="col-md-12 column">
					<nav class="navbar navbar-default navbar-inverse navbar-fixed-top" role="navigation">
						<div class="navbar-header">
							<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"> <span class="sr-only">Toggle navigation</span><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span></button>
							<a class="navbar-brand" href="#" style="margin-right: 10px;">
								<font size="6">Pluto'</font>
							</a>
						</div>

						<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
							<ul class="nav navbar-nav">
								<li>
									<a href="#">日志</a>
								</li>
								<li>
									<a href="#">摄影</a>
								</li>
								<li>
									<a href="#">文件</a>
								</li>
							</ul>

							<ul class="nav navbar-nav navbar-right">

								<li class="dropdown">
									<a href="#" class="dropdown-toggle" data-toggle="dropdown">Dropdown<strong class="caret"></strong></a>
									<ul class="dropdown-menu">
										<li>
											<a href="#">Action</a>
										</li>
										<li>
											<a href="#">Another action</a>
										</li>
										<li>
											<a href="#">Something else here</a>
										</li>
										<li class="divider">
										</li>
										<li>
											<a href="#">Separated link</a>
										</li>
									</ul>
								</li>
							</ul>
						</div>

					</nav>
				</div>
			</div>
		<!-- 中间主体内容部分 -->
		<div class="pageContainer">
			<!-- 左侧导航栏 -->
			<div class="pageSidebar">
				<ul class="nav nav-stacked nav-pills">
					<li role="presentation">
						<a href="${pageContext.request.contextPath}/m-manager-index.html" target="mainFrame">首页管理</a>
					</li>
					<li role="presentation">
						<a href="${pageContext.request.contextPath}/m-manager-newblog.html" target="mainFrame">新建博客</a>
					</li>
					<li role="presentation">
						<a href="${pageContext.request.contextPath}/m-manager-newphoto.jsp" target="mainFrame">上传摄影</a>
					</li>
					<li class="dropdown">
						<a class="dropdown-toggle" data-toggle="dropdown" href="#">
							导航链接4<span class="caret"></span>
						</a>
						<ul class="dropdown-menu">
							<li>
								<a href="nav1.html" target="mainFrame">导航链接4-1</a>
							</li>
							<li>
								<a href="nav2.html" target="mainFrame">导航链接4-2</a>
							</li>
							<li>
								<a href="nav3.html" target="mainFrame">导航链接4-3</a>
							</li>
						</ul>
					</li>
				</ul>
			</div>
			<!-- 左侧导航和正文内容的分隔线 -->
			<div class="splitter"></div>
			<!-- 正文内容部分 -->
			<div class="pageContent">
				<iframe src="${pageContext.request.contextPath}/m-manager-index.html" id="mainFrame" name="mainFrame" frameborder="0" width="100%" height="100%" frameBorder="0"></iframe>
			</div>
		</div>
		<!-- 底部页脚部分 -->
		<div class="footer">
			<p class="text-center">
				2017 &copy; NeoYang.
			</p>
		</div>
	</body>

</html>