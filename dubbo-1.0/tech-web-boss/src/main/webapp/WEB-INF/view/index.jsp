<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/view/include/taglib.jsp"%>
<c:set var="basePath" value="${pageContext.request.contextPath}" />

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<jsp:include page="include/meta.jsp" />
<title>首页${basePath}</title>
	<link rel="stylesheet" href="${basePath}/static/css/public.css" />
	<script src="${basePath}/static/js/jquery-1.7.2.min.js"></script>
	<script src="${basePath}/static/js/jquery-ui-1.10.3.min.js"></script>
	<script src="${basePath}/static/js/jquery.animateNumber.min.js"></script>
	<script src="${basePath}/static/js/run.js"></script>
	<script type="text/javascript">
	
		$(function() {
	
			/*
			* 数字动画效果
			*/
			var animateTxt = $.animateNumber.numberStepFactories.separator(',');
			var tex = '';
			var txtArray = $('.wunian-wrap .wunian span'); 
			$.each(txtArray, function(target, val){ 
				tex = parseInt($(this).text()+"");
				$(this).animateNumber(
				  	{
				    	number: tex,
				    	easing: 'easeInQuad',
				    	numberStep: animateTxt
				  	},
				  	3000
				);
			});  
			
		});	
		
	</script>
</head>
<body>
	
	<jsp:include page="include/header.jsp"></jsp:include>

	<div class="banner-wrap">
		<div class="box">
			<ul>
				<li><a href="#"><img src="${basePath}/static/images/banner1.jpg" height="462" width="2500" alt="" /></a></li>
				<li><a href="#"><img src="${basePath}/static/images/banner2.jpg" height="462" width="2500" alt="" /></a></li>
				<li><a href="#"><img src="${basePath}/static/images/banner3.jpg" height="462" width="2500" alt="" /></a></li>
				<li><a href="#"><img src="${basePath}/static/images/banner4.jpg" height="462" width="2500" alt="" /></a></li>
				<li><a href="#"><img src="${basePath}/static/images/banner5.jpg" height="462" width="2500" alt="" /></a></li>
			</ul>
		</div>
		<ol>
			<li class="current">1</li>
			<li>2</li>
			<li>3</li>
			<li>4</li>
			<li>5</li>
		</ol>
		<div class="login">
			<p class="txt1">撮合网，预期年化收益<</p>
			<p class="txt2"><i class="num">11</i><span class="baifen">%</span><i class="num">-</i><i class="num">15</i><span class="baifen">%</span></p>
			<p class="txt3">30倍活期存款收益3.5倍定期存款收益</p>
			<a class="reg" href="借贷撮合网修改-注册页面1.html">免费注册</a>
			<a class="txt txt4" href="#">已有账号？</a> <a style="text-decoration: underline;" class="txt " href="#">立即登录</a>
		</div>
	</div>

	<div style="width: 100%; background: #def1fc;">
		<div class="gonggao">
			<a style="color:#cccccc; line-height: 40px;" href="#">
				<strong style="color:#666;">撮合网官方公告：</strong>
				<span style="color:#666;">
					<a href="###" title="撮合网官方公告："> 
					  	撮合网官方公告：啊啊啊啊
					</a>
				</span>
				&nbsp;&nbsp;&nbsp;[阿斯大声达到大]<fmt:message key="LeftMenu.dangan"/>	
			</a>
		</div>
	</div>
	

	<div class="wunian-wrap">
		<div class="wunian">
			<span class="txt1">5620000000</span>
			<span class="txt2">52000</span>
			<span class="txt3">489000000</span>
		</div>
	</div>
	
	
	<div class="icom-wrap">
			<div class="icom">
				<ul>
					<li>
						<dl style="margin-top:40px">
							<dt><img src="${basePath}/static/images/iocm_6.png" height="80" width="81" alt=""></dt>
							<dd><h4>投资理财</h4> <span>理财产品，灵活多样，年化收益高达<i style="color:#f08200;">8%-12%</i></span></dd>
						</dl>
					</li>
					<li>
						<dl style="margin-top:40px">
							<dt><img src="${basePath}/static/images/iocm_7.png" height="80" width="81" alt=""></dt>
							<dd><h4>低金额起投</h4> <span>最低<i style="color:#f08200;">100元</i>可以投资，债权可转让,即时回款</span></dd>
						</dl>
					</li>
					<li>
						<dl style="margin-top:40px">
							<dt><img src="${basePath}/static/images/iocm_12.png" height="80" width="81" alt=""></dt>
							<dd><h4>安全保障</h4> <span>所有投资标的<i style="color:#f08200;">100%</i>适用本金保障,保证资金安全</span></dd>
						</dl>
					</li>
					
				</ul>
			</div>
		</div>

		<div class="main-wrap">
			<div class="main">
				<div class="touzizhuan_q">
					<dl>
						<dt><img src="${basePath}/static/images/pic_1.jpg" height="380" width="283" alt=""> <img class="pic1" src="${basePath}/static/images/iocm_8.png" height="42" width="143" alt=""></dt>
						<dd>
							<li class="li1" style="">
								<div><span class="txt1">月月盈</span><span style="margin:3px 0 0 4px;" class="txt2"><i style="color:#3fc8f7;">活期理财，收益远超余额宝</i><br>小额开始、拒绝月光</span></div>
								<p class="txt3"><span style="font-size:66px; color: #3fc8f7;">8</span><i style="font-size:40px; color: #3fc8f7;">%</i><br>年化收益</p>
								<p class="txt4"><span>1个月</span>投资期限</p>
								<a href="/invest/indexlist-1">我要投资</a>
							</li>
							<li class="li2" style="border-right:2px solid #efefef; border-left:2px solid #efefef;">
								<div><span style="color:#86cc54;border-color: #86cc54;" class="txt1">季季增</span><span style="margin:3px 0 0 4px;" class="txt2"><i style="color:#86cc54;">活期理财，收益远超余额宝</i><br>灵活理财、轻松管家</span></div>
								<p class="txt3" style="color:#86cc54;"><span style="font-size:66px; color: #86cc54;">10</span><i style="font-size:40px; color: #86cc54;">%</i><br>年化收益</p>
								<p class="txt4" style="color:#86cc54;"><span style="color:#86cc54;">3个月</span>投资期限</p>
								<a href="/invest/indexlist-2" style="color:#86cc54; border-color: #86cc54;">我要投资</a>
							</li>
							<li class="li3">
								
									<div><span class="txt1" style="color:#fb955c; border-color: #fb955c">半年丰</span><span style="margin:3px 0 0 4px; " class="txt2"><i style="color:#fb955c;">活期理财，收益远超余额宝</i><br>安全有保障、未来有规划</span></div>
									<p class="txt3" style="color:#fb955c;"><span style="font-size:66px; color: #fb955c;">12</span><i style="font-size:40px; color: #fb955c;">%</i><br>年化收益</p>
									<p class="txt4" style="color:#fb955c;"><span style="color:#fb955c;">6个月</span>投资期限</p>
									<a href="/invest/indexlist-3" style="color:#fb955c; border-color: #fb955c">我要投资</a>
								
							</li>
						</dd>
					</dl>
				</div>
				<div class="touzizhuan_q touzizhuan_q2">
					<dl>
						<dt><img src="${basePath}/static/images/pic_2.jpg" height="380" width="283" alt=""> <img class="pic1" src="${basePath}/static/images/iocm_9.png" height="42" width="143" alt=""></dt>
						<dd>
							<li class="li1" style="">
								<div style="color:#3fc8f7; font-size:18px;">直通各大银行，快速解决用款需求！</div>
								<p class="txt3" style="font-size:20px; color: #3fc8f7;"><span style="font-size:40px; color: #3fc8f7; font-weight:bold;">银速通</span><br>(适用长期借款)</p>
								<a href="/bankLoan/toAddLoansDetailPage?loanType=3">查看详情</a>
							</li>
							<li class="li2" style="border-right:2px solid #efefef; border-left:2px solid #efefef;">
								<div style="color:#86cc54; font-size:18px;">1000万以内借款当天放款，手续便捷！</div>
								<p class="txt3" style="font-size:20px; color: #86cc54;"><span style="font-size:40px; color: #86cc54; font-weight:bold;">房速贷</span><br>(适用一般借款)</p>
								<a href="/bankLoan/toAddLoansDetailPage?loanType=1" style="border-color:#86cc54; color:#86cc54;">查看详情</a>
							</li>
							<li class="li3">
								<div style="color:#fb955c; font-size:18px;">周期短，用款灵活，省心省力！</div>
								<p class="txt3" style="font-size:20px; color: #fb955c;"><span style="font-size:40px; color: #fb955c; font-weight:bold;">速垫宝</span><br>(适用长期借款)</p>
								<a href="/bankLoan/toAddLoansDetailPage?loanType=2" style="border-color:#fb955c; color:#fb955c;">查看详情</a>
							</li>
						</dd>
					</dl>
				</div>

				<div class="touzi-r" style="display:none;">
					<img style="dispaly：block; float:left;" src="${basePath}/static/images/pic_3.jpg" height="391" width="283" alt="">
					<div class="right">
						<p style=" margin-top:14px;" class="txt-1"><span class="txt-2"><img src="${basePath}/static/images/iocm_10.png" height="24" width="19" alt="">按日计息</span><span class="txt-2"><img src="${basePath}/static/images/iocm_11.png" height="24" width="19" alt="">提取收益当日到账</span></p>
						<h2 class="tit2">小贷币</h2>
						<p class="txt-3">小贷币是借贷撮合网用来奖励投资人的体验金别名，是借贷撮合网专属的虚拟货币。<br>* 8%+高收益远超银行定存<br>* 期限：1个月<br><br>今日利率：<i style="color:#2ea7e1; font-size:20px; font-weight:bold;">8%</i><br>今日开放加入额度：无上限<br>今日本金提取限额：无上限 <a href="/smallLoanGold"> 立即投资</a></p>
						
					</div>
				</div>
				
				<div class="touzi-r" style="display:block; ">			
							<div class="top">
							<dl>
								<dt><a href="/index#"><img style="margin-right:15px;" src="${basePath}/static/images/number5.png" height="100" width="100" alt=""></a></dt>
								<dd>
									<h3>撮合网·中秋加息活动</h3>
									<p class="p1">
										<span style="width:250px;">总额度</span>
										<span style="width:250px;">可投金额</span>
										<span style="width:250px;">年化收益率</span>
										<span style="width:150px;" class="txt4">投资期限</span>
									</p>
									<p class="p1">
										<span style="width:250px !important;">
											<i style="color:#3fc8f7">
												50,000
											</i> （元） 
										</span>
										<span style="width:250px;">
											<i style="color:#535353;">
												50,000
											</i> （元）
										</span>
										<span style="width:250px;">
											<i style="color:#3fc8f7;">
												14.00% + 4.00%
											</i>
										</span>
										<span style="width:150px;" class="txt4">
											<i style="color:#3fc8f7;">
												6
											</i> 
		                                    	（个月）
										</span>
									</p>
								</dd>
								<dd>
									<a class="btn" href="/loan/300704">
										已结束 
									</a>
									<div class="jindu"><i>0%</i><span w="0%" style="overflow: hidden; width: 0%;"></span></div>
								</dd>
							</dl>
						</div>
					
							<div class="top" style="border:0;">
						
							<dl>
								<dt><a href="/index#"><img style="margin-right:15px;" src="${basePath}/static/images/number5.png" height="100" width="100" alt=""></a></dt>
								<dd>
									<h3>撮合网·中秋加息活动</h3>
									<p class="p1">
										<span style="width:250px;">总额度</span>
										<span style="width:250px;">可投金额</span>
										<span style="width:250px;">年化收益率</span>
										<span style="width:150px;" class="txt4">投资期限</span>
									</p>
									<p class="p1">
										<span style="width:250px !important;">
											<i style="color:#3fc8f7">
												20,000
											</i> （元） 
										</span>
										<span style="width:250px;">
											<i style="color:#535353;">
												14,500
											</i> （元）
										</span>
										<span style="width:250px;">
											<i style="color:#3fc8f7;">
												10.00% + 4.00%
											</i>
										</span>
										<span style="width:150px;" class="txt4">
											<i style="color:#3fc8f7;">
												6
											</i> 
		                                                                                                        （个月）
										</span>
									</p>
								</dd>
								<dd>	
									<a class="btn" href="/loan/300702">
										已结束 
									</a>		
									<div class="jindu"><i>28%</i><span w="28%" style="overflow: hidden; width: 28%;"></span></div>
								</dd>
							</dl>
						</div>
					
				</div>
				
					

				<div class="sanfen-wrap">
					<div class="touzi-l">
						<h3>投资金额榜<img class="jinbei" src="${basePath}/static/images/number4.png" height="41" width="40" alt=""></h3>
						<ul>
							<li class="li1" style="margin-top:10px;"><span class="txt1">排名</span><span class="txt2">用户名</span><span class="txt3">投资金额</span></li>

								<li>
									<span class="txt1">
										<img src="${basePath}/static/images/number1.png" height="24" width="19" alt="">
									</span>
									<span class="txt2" style="margin-left: -7px;">13****</span>
									<span style="color:#2ea7e1" class="txt3">1010000.00元</span>
								</li>	
							
								<li>
									<span class="txt1">
										<img src="${basePath}/static/images/number2.png" height="24" width="19" alt="">
									</span>
									<span class="txt2" style="margin-left: -7px;">yg****</span>
									<span style="color:#2ea7e1" class="txt3">873600.00元</span>
								</li>	
							
								<li>
									<span class="txt1">
										<img src="${basePath}/static/images/number3.png" height="24" width="19" alt="">
									</span>
									<span class="txt2" style="margin-left: -7px;">li****</span>
									<span style="color:#2ea7e1" class="txt3">758400.00元</span>
								</li>	
							
								<li>
									<span class="txt1">
										<img src="${basePath}/static/images/number4.png" height="24" width="19" alt="">
									</span>
									<span class="txt2" style="margin-left: -7px;">13****</span>
									<span style="color:#2ea7e1" class="txt3">547000.00元</span>
								</li>	
							
								<li>
									<span class="txt1">
										<img src="${basePath}/static/images/number5.png" height="24" width="19" alt="">
									</span>
									<span class="txt2" style="margin-left: -7px;">18****</span>
									<span style="color:#2ea7e1" class="txt3">500500.00元</span>
								</li>	
							
						</ul>
					</div>
					<div class="touzi-l xinwen">
						<h4><span>公司动态</span> <a href="${basePath}/static/notice">更多&gt;</a></h4>
						<ul>
								<li>
									<a href="${basePath}/static/notice-315">
										专家顾问呜呜呜 
									</a>
								</li>
							
								<li>
									<a href="${basePath}/static/notice-314">
										专家顾问呜呜呜 
									</a>
								</li>
							
								<li>
									<a href="${basePath}/static/notice-309">
										专家顾问 
									</a>
								</li>
							
								<li>
									<a href="${basePath}/static/notice-307">
										【公告】中秋国庆双节放假安排 
									</a>
								</li>
							
								<li>
									<a href="${basePath}/static/notice-306">
										【公司新闻】首届回龙观地区异业.. 
									</a>
								</li>
							
								<li>
									<a href="${basePath}/static/notice-305">
										【武女士工程项目（五期）CH2.. 
									</a>
								</li>
							
								<li>
									<a href="${basePath}/static/notice-304">
										【武女士工程项目（三期）CH2.. 
									</a>
								</li>
							
						</ul>
					</div>
					<div class="touzi-l xinwen">
						<h4><span>行业新闻</span> <a href="${basePath}/static/industry">更多&gt;</a></h4>
						<ul>
							
							<li>
								<a href="${basePath}/static/notice-338">
									专家顾问 
								</a>
							</li>
						
							<li>
								<a href="${basePath}/static/notice-334">
									专家顾问3333 
								</a>
							</li>
						
							<li>
								<a href="${basePath}/static/notice-333">
									专家顾问短短的 
								</a>
							</li>
						
							<li>
								<a href="${basePath}/static/notice-331">
									专家顾问11212 
								</a>
							</li>
						
							<li>
								<a href="${basePath}/static/notice-330">
									专家顾问 
								</a>
							</li>
						
							<li>
								<a href="${basePath}/static/notice-329">
									专家顾问111 
								</a>
							</li>
						
							<li>
								<a href="${basePath}/static/notice-326">
									专家顾问专家顾问1
								</a>
							</li>
							
						</ul>
					</div>

				</div>
			</div>
		</div>
	</div>
	<!-- 尾部 -->
	<jsp:include page="include/footer.jsp"></jsp:include>
</body>