<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title></title>
		<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/bootstrap.min.css" />
		<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/roll.css" />
		<link rel="stylesheet" href="${pageContext.request.contextPath}/static/themes/default/default.css" />
		<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/jquery-3.3.1.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/bootstrap.min.js"></script>
		
		<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/scrollbar.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/kindeditor-all-min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/static/lang/zh-CN.js"></script>
	</head>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/index.css" />
	<script type="text/javascript">
		function play_pause() {
			if(!$("#au")[0].paused) {
				$("#au")[0].pause();
				$("#play").attr("class","glyphicon glyphicon-play");
			} else {
				$("#au")[0].play();
				$("#play").attr("class","glyphicon glyphicon-pause");
			}
		}
	</script>
	<script>
		var editor;
			KindEditor.ready(function(K) {
				editor = K.create('textarea[name="content"]', {
					resizeType : 1,
					allowPreviewEmoticons : false,
					allowImageUpload : false,
					items : [
						'fontsize', '|', 'forecolor', 'hilitecolor', 'bold', 'italic', 'underline',
						'removeformat', '|', 'justifyleft', 'justifycenter', 'justifyright', 'insertorderedlist',
						'insertunorderedlist', '|', 'emoticons', 'image', 'link']
				});
			});
	</script>
	<body>
		<div class="container" style="width: 100%;background-image: url(${pageContext.request.contextPath}/static/img/background.jpg);background-size: cover;background-attachment:scroll;background-position-y: 600px;">

			<!--描述：上浮导航   -->
			<div class="row clearfix" style="height: 50px;">
				<div class="col-md-12 column">
					<nav class="navbar navbar-default navbar-inverse navbar-fixed-top" role="navigation" style="padding: 5px 20px;">
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
								<li class="dropdown">
									<a href="#" class="dropdown-toggle" data-toggle="dropdown">施工中<strong class="caret"></strong></a>
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
										<li class="divider">
										</li>
										<li>
											<a href="#">One more separated link</a>
										</li>
									</ul>
								</li>
							</ul>
							<form class="navbar-form navbar-left" role="search">
								<div class="form-group">
									<input type="text" class="form-control" />
								</div> <button type="submit" class="btn btn-default">搜索</button>
							</form>
							<ul class="nav navbar-nav navbar-right">
								<li>
									<p class="navbar-text">播放中：郑成河-Flaming</p>
								</li>
								<li>
									<audio id="au" autoplay="true" loop="true">
										<source src="${pageContext.request.contextPath}/${index.backgroundmusic}">
									</audio>
									<button type="button" class="btn btn-default navbar-btn" aria-label="Left Align" onclick="play_pause()">
										<span id="play" class="glyphicon glyphicon-pause" aria-hidden="true"></span>
									</button>
								</li>
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

			<!--描述：轮播图-->
			<div class="row clearfix">
				<div class="col-md-12 column" style="padding: 0px">
					<div class="carousel slide" id="carousel-655481">
						<ol class="carousel-indicators">
                            <c:forEach items="${index.indexCarouselList}" varStatus="n">
                                <li data-slide-to="${n.index}" data-target="#carousel-655481" <c:if test="${n.index==0}">class="active"</c:if>>
                                </li>
                            </c:forEach>
						</ol>
						<div class="carousel-inner">
                            <c:forEach items="${index.indexCarouselList}" var="item" varStatus="n">
                                <div class="item <c:if test="${n.index==0}">active</c:if>">
                                    <img alt="" src="${pageContext.request.contextPath}/${item.imgpath}" />
                                    <div class="carousel-caption">
                                        <h4>
                                                ${item.title}
                                        </h4>
                                        <p>
                                                ${item.text}
                                        </p>
                                    </div>
                                </div>
                            </c:forEach>
						</div>
						<a class="left carousel-control" href="#carousel-655481" data-slide="prev"><span class="glyphicon glyphicon-chevron-left"></span></a>
						<a class="right carousel-control" href="#carousel-655481" data-slide="next"><span class="glyphicon glyphicon-chevron-right"></span></a>
					</div>
				</div>
			</div>

			<!-- panel -->
			<div class="row clearfix" style="height: 200px;color: white;">
				<div class="col-md-12 column">
					<div>
						<h3>PANEL</h3></div>
					<div style="margin: 0px 50px;">
						<font size="7">${index.panaltext}</font>
					</div>
				</div>
			</div>

			<!-- 发布区 -->
			<div class="row clearfix">
				<div class="col-md-12 column">
					<div class="row clearfix">
						<!-- photograph -->
						<div class="col-md-4 column" style="height: 900px;padding-top: 10px;color: white;">
							<div style="width: 100% ;">
								<h3>PHOTO</h3></div>
							<div class="scroll_wrap" style="height: 800px;">
								<div class="scroll_cont">
									<ul style="list-style-type: none;display:table;padding: 0px;width:100%">
                                        <c:forEach items="${index.photographs}" var="p">
										<li><img class="img-responsive center-block" style="max-width: 300px;" src="${pageContext.request.contextPath}/${p.path}">
											<div class="center-d">${p.title}</div>
										</li>
                                        </c:forEach>
									</ul>
								</div>

								<div class="scroll_bar">
									<div class="scroll_slider"></div>
								</div>
							</div>
							<div style="text-align: center;width: 100%;">
								<button class="btn btn-info">更多</button>
							</div>
						</div>
						<div class="col-md-8 column">
							<!-- blog -->
							<div class="column" style="padding:10px;width: 100%;">
								<div style="color: white;">
									<h3>BLOG</h3>
								</div>
								<div class="tabbable" id="tabs-999059">
									<ul class="nav nav-tabs">
                                        <c:forEach items="${index.kindCustoms}" varStatus="n" var="k">
                                        <li <c:if test="${n.index==0}">class="active"</c:if> >
                                            <a href="#panel-${k.kid}" data-toggle="tab">${k.kname}</a>
                                        </li>
                                        </c:forEach>
									</ul>
									<div class="tab-content">
                                        <c:forEach items="${index.kindCustoms}" varStatus="n" var="k">
                                            <div class="tab-pane <c:if test="${n.index==0}">active</c:if>" id="panel-${k.kid}">
                                                <div style="height: 30px;"></div>
                                                <c:forEach items="${k.journals}" var="j">
                                                <div class="panel panel-default">
                                                    <div class="panel-heading">
                                                        <h3 class="panel-title">${j.title}</h3>
                                                    </div>
                                                    <div class="panel-body">
                                                        ${j.content}
                                                    </div>
                                                </div>
                                                </c:forEach>
                                                <div style="text-align: center;">
                                                    <button class="btn btn-info">更多</button>
                                                </div>
                                            </div>
                                        </c:forEach>
									</div>
								</div>
							</div>

							<!--file-->
							<div class="column" id="file_area">
								<div>
									<h3>FILE</h3></div>
								<ul style="list-style: none;">
									<li><img src="${pageContext.request.contextPath}/static/img/icon/py.jpg" />
										<p>helloworld.py</p>
									</li>
									<li><img src="${pageContext.request.contextPath}/static/img/icon/zip.jpg" />
										<p>hello.zip</p>
									</li>
									<li><img src="${pageContext.request.contextPath}/static/img/icon/py.jpg" />
										<p>hello.py</p>
									</li>
									<li><img src="${pageContext.request.contextPath}/static/img/icon/zip.jpg" />
										<p>ad.zip</p>
									</li>
									<li><img src="${pageContext.request.contextPath}/static/img/icon/zip.jpg" />
										<p>awd.zip</p>
									</li>
									<li><img src="${pageContext.request.contextPath}/static/img/icon/zip.jpg" />
										<p>agd.zip</p>
									</li>
									<li><img src="${pageContext.request.contextPath}/static/img/icon/more.png" style="height: 50%; width: 50%;margin-bottom: 25px;"/>
										<p>更多</p>
									</li>
								</ul>
							</div>
						</div>
					</div>
				</div>
			</div>

            <%--中间图片--%>
            <div class="middle-img">
            <c:forEach items="${index.indexImgItems}" var="item" varStatus="n">
                <c:if test="${n.count%2==0}">
                    <div class="row clearfix middle-img-item">
                        <div class="col-md-1 column"></div>
                        <div class="col-md-3 column img-i-container"><img class="center-block img1" width="300px" src="${pageContext.request.contextPath}/${item.imgpath}"/></div>
                        <div class="col-md-7 column">
                            <div class="text-center img-content">
                                <div class="img-title">${item.title}</div>
                                <div class="img-text">${item.text}</div>
                            </div>
                        </div>
                        <div class="col-md-1 column"></div>
                    </div>
                </c:if>
                <c:if test="${n.count%2==1}">
                    <div class="row clearfix middle-img-item">
                        <div class="col-md-1 column"></div>
                        <div class="col-md-7 column">
                            <div class="text-center img-content">
                                <div class="img-title">${item.title}</div>
                                <div class="img-text">${item.text}</div>
                            </div>
                        </div>
                        <div class="col-md-3 column img-i-container"><img class="center-block img1" width="300px" src="${pageContext.request.contextPath}/${item.imgpath}"/></div>
                        <div class="col-md-1 column"></div>
                    </div>
                </c:if>
            </c:forEach>
            </div>
			<div class="row clearfix" style="padding: 0px 50px;color: white;">
				<div>
					<h3>REVIEW</h3>
				</div>
				<table class="table table-bordered review-area">
					<c:forEach items="${index.reviewCustoms}" var="r">
						<tr>
							<td class="review-head-area">
								<img src="${pageContext.request.contextPath}/${r.visitor.headpath}"/>
								<p>${r.visitor.name}</p>
							</td>
							<td class="review-content-area">
								<p>${r.content}</p>
								<div style="margin: 5px 0px;text-align: right;width: 95%;position:absolute;bottom: 0px;">
									&nbsp;<a href="#">收藏</a>
									&nbsp;<a href="#">回复</a>
									&nbsp;<a href="#">点赞[${r.thumbs}]</a>
								</div>
							</td>
						</tr>
					</c:forEach>
				</table>
				<table class="table">
					<tr>
						<td class="review-head-area"><img src="${pageContext.request.contextPath}/static/img/head.png"/></td>
						<td class="review-content-area">
							<form>
								<textarea name="content" style="width:100%;height:200px;visibility:hidden;">KindEditor</textarea>
								<button class="btn btn-info" style="margin: 10px auto;">提交</button>
							</form>
						</td>
					</tr>
				</table>
			</div>

			<!-- 底部联系方式 -->
			<div class="row clearfix" style="height: 200px;text-align: center;margin-top: 50px;color: white;">
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
                        <td>${index.contactqq}</td>
                        <td>${index.contectemail}</td>
                        <td>${index.contectmobile}</td>
                        <td>${index.contectaddress}</td>
					</tr>
				</table>
				</div>
			</div>
			<div style="height: 300px;padding-top:50px ;">
				<img class="img-responsive center-block" width="100px" src="${pageContext.request.contextPath}/static/img/head.png" />
			</div>
		</div>
		<script type="text/javascript">
			new CusScrollBar({
				contentSelector: '.scroll_cont', //滚动内容区
				barSelector: '.scroll_bar', //滚动条
				sliderSelector: '.scroll_slider' //滚动滑块
			});
		</script>
	</body>

</html>