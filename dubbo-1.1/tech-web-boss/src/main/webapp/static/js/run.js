$(function() {

	//回到顶部js
	var h=$(window).height();
	$(window).scroll(function(){
		var num=$(this).scrollTop();
		if (num>h) {
			$('.back-top').show(500);
		} else{
			$('.back-top').hide(500);
		};
	})
	$('.back-top').click(function(event) {
		$('html,body').stop().animate({scrollTop:0}, 500)
	});
	//banner js
	var time1=1000 //淡入淡出时间
	var time2=3000 //轮播间隔时间
	var speed=1000 //图片轮播速度
	canshu(time1,time2,speed);

	//首页进度条js；
		$('dl dd .jindu span').each(function(index, el) {
			var a=$(el).attr("w");
			$(this).siblings('i').html(a);
			$(el).animate({width:a}, 1000)
		});

	//注册js
	$('.banner-wrap .login').animate({right:17.7+'%'}, 1000,'easeInOutQuint' );


	//登录注册 js
	$('.nav-wrap .nav .login span').hover(function() {
		var i = $(this).index();
		$('.nav-wrap .nav .login .slide').stop().animate({left:i*62}, 200);
		if (i==0) {
			$('.nav-wrap .nav .login .login3').fadeIn(500);
		} else{$('.nav-wrap .nav .login .login3').fadeOut(200);};
		$('.nav-wrap .nav .login span').eq(i).children('a').addClass('current')
		$('.nav-wrap .nav .login span').eq(i).siblings('span').children('a').removeClass('current');
	});

	$('.nav-wrap .nav .login .login3 input').focus(function(event) {
		$(this).parents('.login3').addClass('current');
	}).blur(function(event) {
		$(this).parents('.login3').removeClass('current')
	});

	$('.nav-wrap .nav .login').mouseleave(function(event) {
		$('.nav-wrap .nav .login .login3').fadeOut(200);
	});



	//银速通 js
	$('.main-wrap .main1 .txt-1 span').click(function(event) {
		var n=$(this).index();
		$(this).addClass('current').siblings('span').removeClass('current');
		$('.main-wrap .main1 .tabs').eq(n).addClass('current').siblings('.tabs').removeClass('current');
	});
	//银行tabs js
	$('.main-wrap .main1 .tabs .left li').click(function(event) {
		var n1=$(this).index();
		$(this).addClass('current').siblings('li').removeClass('current');
		$(this).parents('.left').siblings('.right').children('div').eq(n1).addClass('current');
		$(this).parents('.left').siblings('.right').children('div').eq(n1).siblings('div').removeClass('current');

	});
	



	
		

	
});

// banner js
function canshu(time1,time2,speed){
	
		var timer=null;
		var num=0
		var li_w=$('.banner-wrap ul li').width();
		// alert(li_h)
		//点击下角标事件
		
		var w=$('.banner-wrap ul li img').width()

		$('.banner-wrap ol li').click(function(event) {
			var n=$(this).index();
			$(this).addClass('current').siblings('li').removeClass('current');
			$('.banner-wrap ul li').eq(n).hide().fadeTo(time1,1);
			$('.banner-wrap ol li img').addClass('current1').siblings('li').removeClass('current1');

			$('.banner-wrap ul').stop().animate({left:-n*li_w}, speed,'easeOutExpo' );
			num=n;

		});

		function autoPlay(){
			num++;
			if (num>4) {num=0};
			$('.banner-wrap ol li').eq(num).addClass('current').siblings('li').removeClass('current');
			$('.banner-wrap ul li').eq(num).hide().fadeTo(time1,1);

			$('.banner-wrap ul').stop().animate({left:-num*li_w}, speed,'easeOutExpo' );
		}
		timer=setInterval(autoPlay, time2);


		$('.banner-wrap ul li').hover(function() {
			clearTimeout(timer);

		}, function() {
			clearTimeout(timer);
			timer=setInterval(autoPlay, time2);
		});
	}

