<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>理工新闻-理工</title>
<meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1">
<meta name="renderer" content="webkit">
<meta name="viewport"
	content="width=device-width, initial-scale=1,maximum-scale=1">
<link href="./home_files/main-2ada0a57df.css" rel="stylesheet">
</head>
<body class="news-index">
	<div class="logo-search area">
		<div class="logo left">
			<a href="#">新闻首页</a>
		</div>
		<form action="HomeSearchServlet" method="post">
			<div class="search left" id="search">
				<input type="text" class="search-input left" value="大家都在搜：印巴启动和平走廊"
					data-val="key" data-spm-acode="8066" name="text"> 
				<span class="search-btn"><input type="submit" class="search-icon icon" value=""></span>
			</div>
		</form>
		<div class="product-list right">
			<c:choose>
				<c:when test="${user_login != null}">
					欢迎：${user_login.name}
				</c:when>
				<c:otherwise>
					<div class="icon-user">
						<button class="button"><a href="userlogin.html">登陆</a></button>
						<button class="button"><a href="regist.html">注册</a></button>
					</div>
				</c:otherwise>
			</c:choose>
		</div>
	</div>

	<div class="news-nav area">
		<ul>
			<li class="index cur"><a href="#"
				target="">首页</a></li>
			<c:forEach items="${cateGory_list }" var="catelist">
				<li><a target="_blank" href="CategorySearchServlet?categoryId=${catelist.id}">${catelist.name }</a></li>
			</c:forEach>
		</ul>
	</div>
	<div class="contentA public area clearfix">
		<div class="main left">
			<div class="main-modA clearfix">
				<div class="main-left left">
					<!--焦点图-->
					<div class="news-focus">
						<a data-param="_f=index_chan08focus_0" title="通信技术试验卫星三号升空 进入预定轨道"
							href="#" target="">
							<img src="./home_files/df29b019d9904127ebe9261dbf20fd4a.jpg"
							alt=""> <span class="linear-box"> <em
								class="linear-bg"></em> <em class="linear-txt">通信技术试验卫星三号升空
									进入预定轨道</em>
						</span>
						</a>
					</div>
					<div class="pic-group clearfix">
						<ul>
							<li><a data-param="_f=index_chan08focus_1"
								title="游客摩洛哥遭残忍杀害 13人被捕"
								href="#">
									<img src="./home_files/a081e124a19f2d394482ca685f5012dd.jpg"
									alt=""> <span class="txt">游客摩洛哥遭残忍杀害 13人被捕</span>
							</a></li>
							<li class="end"><a data-param="_f=index_chan08focus_2"
								title="泰国11具婴儿尸体被盗 疑被制成“古曼童”"
								href="#">
									<img src="./home_files/836fa6ebdc5afc5cf1df76cd8ff8b2b0.jpg"
									alt=""> <span class="txt">泰国11具婴儿尸体被盗 疑被制成“古曼童”</span>
							</a></li>
						</ul>
					</div>
					<!--热点视频-->


					<div class="video-mod clear">
						<div class="titleL">
							<span class="tt">热点视频</span>
						</div>
						<div class="video-focus-pic" data-video-wrapper="video1">
							<a data-clev="10220169" data-video-clicker="video3"
								data-vid="114042240" data-title="老人乘公交强行坐女孩腿上 遭乘客殴打"
								data-site="2" href="javascript:void(0)" target="#"
								title="老人乘公交强行坐女孩腿上 遭乘客殴打"><img
								src="./home_files/cut@m=force,w=160,h=90.jpg" alt=""><span
								class="linear-box video-txt"><em class="linear-bg"></em><em
									class="txt">老人乘公交强行坐女孩腿上 遭乘客殴打</em></span><i class="icon icon-video"></i></a>
						</div>
						<div class="list-link clearfix">
							<ul>
								<li><a data-clev="10220170" data-video-clicker="video3"
									data-vid="114111812" data-title="客运班车行驶中遭私家车撞翻 贴地滑行数米"
									data-site="2" href="javascript:void(0)" target="#"
									title="客运班车行驶中遭私家车撞翻 贴地滑行数米"><i class="icon icon-video"></i>客运班车行驶中遭私家车撞翻
										贴地滑行数米</a></li>
								<li><a data-clev="10220171" data-video-clicker="video3"
									data-vid="114109382" data-title="男辅导员闯女寝叫起床？ 回应称：不做评价"
									data-site="2" href="javascript:void(0)" target="#"
									title="男辅导员闯女寝叫起床？ 回应称：不做评价"><i class="icon icon-video"></i>男辅导员闯女寝叫起床？
										回应称：不做评价</a></li>
								<li><a data-clev="10220172" data-video-clicker="video3"
									data-vid="114041573" data-title="硬核开颅手术现场 音乐家躺手术台上弹吉他"
									data-site="2" href="javascript:void(0)" target="#"
									title="硬核开颅手术现场 音乐家躺手术台上弹吉他"><i class="icon icon-video"></i>硬核开颅手术现场
										音乐家躺手术台上弹吉他</a></li>
								<li><a data-clev="10220173" data-video-clicker="video3"
									data-vid="114047322" data-title="出租司机维权屡遭推诿 引发千辆出租车停运"
									data-site="2" href="javascript:void(0)" target="#"
									title="出租司机维权屡遭推诿 引发千辆出租车停运"><i class="icon icon-video"></i>出租司机维权屡遭推诿
										引发千辆出租车停运</a></li>
								<li><a data-clev="10220174" data-video-clicker="video3"
									data-vid="114040770" data-title="男子醉酒后在列车上放火 连续3次点燃布座套"
									data-site="2" href="javascript:void(0)" target="#"
									title="男子醉酒后在列车上放火 连续3次点燃布座套"><i class="icon icon-video"></i>男子醉酒后在列车上放火
										连续3次点燃布座套</a></li>
								<li><a data-clev="10220175" data-video-clicker="video3"
									data-vid="114039628" data-title="泰国11具婴儿尸体被盗 疑被用于制做“古曼童”"
									data-site="2" href="javascript:void(0)" target="#"
									title="泰国11具婴儿尸体被盗 疑被用于制做“古曼童”"><i class="icon icon-video"></i>泰国11具婴儿尸体被盗
										疑被用于制做“古曼童”</a></li>
							</ul>
						</div>
					</div>

				</div>
				<div class="main-right right">

					<div class="focus-news">
						<div class="news">
							<p>
								<a data-param="_f=index_chan08cpc_0"
									href="#"
									 title="启示——习近平纵论改革开放的宝贵经验">启示——习近平纵论改革开放的宝贵经验</a>
							</p>
							<p>
								<a data-param="_f=index_chan08cpc_1_0"
									href="#"
									 title="正确认识我国发展的重要战略机遇期">正确认识我国发展的重要战略机遇期</a> <em
									class="line-mg">|</em> <a data-param="_f=index_chan08cpc_1_1"
									href="#" title="打井修路为致富">打井修路为致富</a>
							</p>
						</div>

						<div class="list16">
							<ul>
								<c:forEach items="${news }" var="list">
									<li>
										<a title="${$list.title }">
										${list.title }
										</a>
									</li>
								</c:forEach>
							</ul>
						</div>
					</div>

				</div>

			</div>
		</div>
		<div class="sidebar right">
			<!--理工精选-->
			<div class="choice-mod bordR clearfix">
				<div class="titleR">
					<span class="tt">理工精选</span>
				</div>
				<div class="choice-pic">
					<a data-param="_f=index_chan08select_0"
						title="刘大蔚网购仿真枪被判无期案再审宣判：改判为7年3个月"
						href="#" ><img
						src="./home_files/b669e3f5695043909a37914b33fd0f62.jpeg" alt=""><span
						class="linear-box"><em class="linear-bg"></em><em
							class="linear-txt">刘大蔚网购仿真枪被判无期案再审宣判：改判为7年3个月</em></span></a>
				</div>
				<div class="choice-list">
					<ul>

						<li><a data-param="_f=index_chan08select_1"
							title="华为董事长梁华：困难和挑战只会让华为更坚强"
							href="#" >华为董事长梁华：困难和挑战只会让华为更坚强</a></li>
						<li><a data-param="_f=index_chan08select_2"
							title="鲁梅尼格揭续约罗贝里真因 海因克斯曾强烈要求"
							href="#">鲁梅尼格揭续约罗贝里真因
								海因克斯曾强烈要求</a></li>
						<li><a data-param="_f=index_chan08select_3"
							title="售价300万美元，兰博基尼将推插混版超跑"
							href="#">售价300万美元，兰博基尼将推插混版超跑</a></li>
						<li><a data-param="_f=index_chan08select_4"
							title="A股开盘 | 沪指低开0.9%，隔夜美股大跌超2%"
							href="#">A股开盘
								| 沪指低开0.9%，隔夜美股大跌超2%</a></li>
						<li><a data-param="_f=index_chan08select_5"
							title="上港U23队5天3次苦战加时 夺冠得益于超强体能"
							href="#">上港U23队5天3次苦战加时
								夺冠得益于超强体能</a></li>
						<li><a data-param="_f=index_chan08select_6"
							title="字母哥泡椒荣膺上周最佳 库里杜兰特哈登获提名"
							href="#">字母哥泡椒荣膺上周最佳
								库里杜兰特哈登获提名</a></li>
					</ul>
				</div>
			</div>
			
			<div class="godR" data-role="god_side" data-god-id="15868"
				data-monitorkey="0e3d44d97630f9764_0_0">
				<a href="http://www.iac-i.org/privacy/" 
					class="got-i-icon"></a> <span class="god-mark">广告</span> <a
					class="swf-top" href="#"></a>
				<div>
					<img src="./home_files/02bfafa3bdc842188911508e40ada073.jpg">
				</div>
			</div>
			
		</div>
	</div>

	<footer class="footer area">
	<p>
		<a href="#" rel="nofollow">搜狗输入法</a>
		- <a href="#" rel="nofollow">支付中心</a>
		- <a href="#" rel="nofollow">理工招聘</a>
		- <a href="#" rel="nofollow">广告服务</a>
		- <a href="#"
			rel="nofollow">联系方式</a> - <a href="#"
			 rel="nofollow">About SOHU</a> - <a
			href="#"
			rel="nofollow">公司介绍</a>
	</p>
	<p>
		Copyright © 2018 Sohu All Rights Reserved. 理工公司 <a
			href="#"
			rel="nofollow">版权所有</a>
	</p>
	<p>
		理工不良信息举报邮箱：<a href="mailto:logic_c@163.com">logic_c@163.com</a>
	</p>
	</footer>
	<div id="float-btn" class="float-links">
		<ul data-spm="user-feedback">

			<li class="back-sohu prize-survey" data-role="on_back"><a
				href="#" ><em>返回<br>首页
				</em></a></li>

			<li class="user-feedback"><a
				href="#"
				 data-spm-acode="8072"><em>用户<br>反馈
				</em></a></li>

			<li class="back-top" data-role="go_top"><a
				href="javascript:void(0)" style="display: none;"><i class="icon"></i></a></li>
		</ul>
	</div>
</body>
</html>