<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%  
String path = request.getContextPath();  
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";  
%>  
    
<link rel="stylesheet" href="<%=basePath%>/resources/mondays/css/style.css" type="text/css" media="all" />
<script src="<%=basePath%>/resources/mondays/js/jquery-1.4.1.min.js" type="text/javascript"></script>
<script src="<%=basePath%>/resources/mondays/js/jquery.jcarousel.pack.js" type="text/javascript"></script>
<script src="<%=basePath%>/resources/mondays/js/jquery-func.js" type="text/javascript"></script>

<base href="<%=basePath%>">  
    
<div id="top">
		<div class="cl">&nbsp;</div>
		<h1 id="logo"><a href="#">MONDAYS</a></h1>
		<form action="" method="post" id="search">
			<div class="field-holder">
				<input type="text" class="field" value="Search" title="Search" />
			</div>
			<input type="submit" class="button" value="Search" />
			<div class="cl">&nbsp;</div>
		</form>
		<div class="cl">&nbsp;</div>
		<div id="navigation">
			<ul>
			    <li>
			    	<a href="home.jsp" class="active"><span>首页</span></a>
			     <!-- <ul>
			    		<li><a href="#">个人理财</a></li>
			    		<li><a href="#">日历</a></li>
			    		<li><a href="#">密码备忘</a></li>
			    		<li><a href="#">计划目标</a></li>
			    		<li><a href="#">名人名言</a></li>
			    		<li><a href="#">关于大T</a></li>
			    	</ul>  -->
			    </li>
			    <li>
			    	 <span style="color: #FFFFFF;">个人理财</span>
			    	<ul>
			    		<li><a href="finance/spend">支出</a></li>
			    		<li><a href="finance/income">收入</a></li>
			    		<li><a href="finance/reports">报表统计</a></li>
			    		<li><a href="finance/category">记账类别</a></li>
			    		<li><a href="finance/regular">固定收入</a></li>
			    		<li><a href="finance/debt">外债</a></li>
			    		<li><a href="finance/invest">投资</a></li>
			    	</ul>
			    </li>
			    <li>
			    	<a href="#"><span>日历</span></a>
			    	<ul>
			    		<li><a href="#">日历</a></li>
			    	</ul>
			    </li>
			    <li>
			    	<a href="#"><span>密码备忘</span></a>
			    	<ul>
			    		<li><a href="#">密码备忘</a></li>
			    	</ul>
			    </li>
			    <li>
			    	<a href="#"><span>计划目标</span></a>
			    	<ul>
			    		<li><a href="#">计划目标</a></li>
			    	</ul>
			    </li>
			    <li>
			    	<a href="#"><span>名人名言</span></a>
			    	<ul>
			    		<li><a href="#">名人名言</a></li>
			    	</ul>
			    </li>
			    <li>
			    	<a href="#"><span>关于大T</span></a>
			    	<ul>
			    		<li><a href="#">大T是谁</a></li>
			    	</ul>
			    </li>
			</ul>
		</div>	
	</div>