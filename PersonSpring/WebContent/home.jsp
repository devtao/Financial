<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<meta http-equiv="Content-type" content="text/html; charset=utf-8" />
	<title>大T的空间</title>
	<link rel="stylesheet" href="resources/mondays/css/style.css" type="text/css" media="all" />
	<script src="resources/mondays/js/jquery-1.4.1.min.js" type="text/javascript"></script>
	<script src="resources/mondays/js/jquery.jcarousel.pack.js" type="text/javascript"></script>
	<script src="resources/mondays/js/jquery-func.js" type="text/javascript"></script>
</head>
<body>
<div id="page" class="shell">
	<!-- Logo + Search + Navigation -->
	<%@include file="navigation.jsp" %>
	<!-- END Logo + Search + Navigation -->
	<!-- Header -->
	<div id="header">
		<!-- Slider -->
		<div id="slider">
			<div id="slider-holder">
				<ul>
				    <li>
				    	<div class="slide-info">
				    		<h2 class="notext txt-we-love-mondays">WE LOVE MONDAYS</h2>
				    		<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc ornare consequat tortor quis porttitor. Aliquam sed fringilla arcu. Maecenas sit amet cursus augue. Donec felis eros, luctus at blandit.</p>
				    		<a href="#" class="button-more">More</a>
				    	</div>
				    	<div class="slide-image">
				    		<img src="resources/mondays/css/images/img1.gif" alt="" />
				    	</div>
				    </li>
				    <li>
				    	<div class="slide-info">
				    		<h2 class="notext txt-we-love-mondays">WE LOVE MONDAYS</h2>
				    		<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc ornare consequat tortor quis porttitor. Aliquam sed fringilla arcu. Maecenas sit amet cursus augue. Donec felis eros, luctus at blandit.</p>
				    		<a href="#" class="button-more">More</a>
				    	</div>
				    	<div class="slide-image">
				    		<img src="resources/mondays/css/images/img1.gif" alt="" />
				    	</div>
				    </li>
				    <li>
				    	<div class="slide-info">
				    		<h2 class="notext txt-we-love-mondays">WE LOVE MONDAYS</h2>
				    		<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc ornare consequat tortor quis porttitor. Aliquam sed fringilla arcu. Maecenas sit amet cursus augue. Donec felis eros, luctus at blandit.</p>
				    		<a href="#" class="button-more">More</a>
				    	</div>
				    	<div class="slide-image">
				    		<img src="resources/mondays/css/images/img1.gif" alt="" />
				    	</div>
				    </li>
				</ul>
			</div>
			<div class="slider-nav">
				<a href="#" class="prev">Previous</a>
				<a href="#" class="next">Next</a>
			</div>
		</div>
		<!-- END Slider -->	
	</div>
	<!-- END Header -->
	<!-- Main -->
	<div id="main">
		<!-- Three Column Content -->
		<div class="cols three-cols">
			<div class="cl">&nbsp;</div>
			<div class="col">
				<h2>What is Mondays?</h2>
				<h3 class="notext txt-monday-again">MONDAY AGAIN</h3>
				<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc ornare consequat tortor quis porttitor. Aliquam sed fringilla arcu. Maecenas sit amet cursus augue. Donec felis eros, luctus at blandit ac.</p>
				<p><a href="#" class="more">Learn more</a></p>
			</div>
			<div class="col">
				<h2>Monday Services</h2>
				<h3 class="notext txt-wedothis">WE DO THIS AND THAT....</h3>
				<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc ornare consequat tortor quis porttitor. </p>
				<p><a href="#" class="more">Learn more</a></p>
			</div>
			<div class="col col-last">
				<h2>Monday Support</h2>
				<h3 class="notext txt-247">24/7 YES REALLY...</h3>
				<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc ornare consequat tortor quis porttitor. Aliquam sed fringilla arcu. Maecenas sit amet cursus augue.</p>
				<p><a href="#" class="more">Learn more</a></p>
			</div>
			<div class="cl">&nbsp;</div>
		</div>
		<!-- END Three Column Content -->
		<!-- Two Column Content -->
		<div class="cols two-cols">
			<div class="cl">&nbsp;</div>
			<div class="col">
				<h2>Why Mondays?</h2>
				<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc ornare consequat tortor quis porttitor. Aliquam sed fringilla arcu. Maecenas sit amet cursus augue. Donec felis eros, luctus at blandit ac.</p>
				<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc ornare consequat tortor quis porttitor. Aliquam sed fringilla arcu. Maecenas sit amet cursus augue. Donec felis eros, luctus at blandit ac.</p>
				<p><a href="#" class="more">Learn more</a></p>
			</div>
			<div class="col col-last">
				<h2>This Solution and That Solution...</h2>
				<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc ornare consequat tortor quis porttitor. Aliquam sed fringilla arcu. Maecenas sit amet cursus augue. Donec felis eros, luctus at blandit ac.</p>
				<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc ornare consequat tortor quis porttitor. Aliquam sed fringilla arcu. Maecenas sit amet cursus augue. Donec felis eros, luctus at blandit ac.</p>
				<p><a href="#" class="more">Learn more</a></p>
			</div>
			<div class="cl">&nbsp;</div>
		</div>
		<!-- END Two Column Content -->
	</div>
	<!-- END Main -->
	<!-- Footer -->
	<%@include file="footer.jsp" %>
	<!-- END Footer -->
	<br />
</div>
</body>
</html>