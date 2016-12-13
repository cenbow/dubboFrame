<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/view/include/taglib.jsp"%>
<c:set var="basePath" value="${pageContext.request.contextPath}" />
<div class="back-top"><img src="${basePath}/static/images/top.png" height="49" width="48" alt="" /></div>
<div class="head-wrap">
	<div class="head">
		<div class="left">
			<ul>
				<li><img src="${basePath}/static/images/tel.png" height="22" width="20" alt="" />热线电话 <span class="tel"> 400-010-9881</span></li>
				<li class="li2"><i>关注我们</i><a class="weibo" href="#"><img src="${basePath}/static/images/weibo.png" height="22" width="23" alt="" /></a><a class="weixin" href="#"><img src="${basePath}/static/images/weixin.png" alt="" /></a></li>
				<li><i class="zixun">在线咨询</i><a href="#"><img src="${basePath}/static/images/qq.png" height="22" width="23" alt="" /></a></li>
			</ul>
		</div>
		<div class="right">
			<ul>
				<Li class="li1"><a href="#">注册</a><a href="#">登录</a>|</Li>
				<Li class="li2"><a href="#">新手指引</a>|</Li>
				<Li><a href="#">客户端下载</a></Li>
			</ul>
		</div>
	</div>
</div>
<div class="nav-wrap">
	<div class="nav">
		<h1 class="logo"><a href="#"><img src="${basePath}/static/images/logo.png" height="55" width="195" alt="" /></a></h1>
		<div class="nav-right">
			<ul>
				<Li><a class="current" href="index.html">首页</a></Li>
				<Li><a class="current1" href="借贷撮合网修改我要投资前页面.html">我要投资</a></Li>
				<Li><a href="借贷撮合网修改我要借款.html">我要借款</a></Li>
				<Li><a href="借贷撮合网修改我的账户-新浪存钱罐.html">新浪存钱罐</a></Li>
				<Li><a href="借贷撮合网修改我的账号-小贷币专属页面.html">小贷币</a></Li>
				<Li><a href="借贷撮合网修改我的账户-账户详情.html">我的账户</a></Li>
				<Li><a href="借贷撮合网修改我的账户-关于我们.html">关于我们</a></Li>
			</ul>
		</div>
		<div class="login">
			<span><a class="login1 current" href="#">登录</a></span>
			<span><a class="login2" href="#">注册</a></span>
			<div class="login3">
				<input class="int1" type="text" placeholder="用户名/邮箱/手机号" onfocus="if(placeholder=='用户名/邮箱/手机号'){placeholder=''}" onblur="if(placeholder==''){placeholder='用户名/邮箱/手机号'}">
				<input class="int1 int2" style="margin-top:20px;" type="password" placeholder="请输入密码" onfocus="if(placeholder=='请输入密码'){placeholder=''}" onblur="if(placeholder==''){placeholder='请输入密码'}">
				<a href="#" style=" color:#3fc8f6; font-size:12px;display:block; text-align: right; width:70px; height:26px; line-height:26px;">忘记密码？</a>
				<a href="#" style=" color:#fff; font-size:16px;display:block; text-align: center; width:175px; height:30px; line-height:30px; background:#3fc8f6; border-radius:4px;">登录</a>
			</div>
			<div class="slide"></div>
		</div>

	</div>
</div>