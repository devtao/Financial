<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/commons/taglibs.jsp"%>

<!DOCTYPE HTML>
<!-- DON'T TOUCH THIS SECTION -->
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, minimum-scale=1.0, maximum-scale=1.0">

<!--[if lt IE 9]>
<script src="//html5shiv.googlecode.com/svn/trunk/html5.js"></script>
<![endif]-->

<!-- END OF DON'T TOUCH -->

<!-- Website Title -->
<title>Liquid Gem</title>
<!-- END OF Website Title -->

<!--  Website description - Change the 'content' section to whatever you want -->
<meta name="description" content="Replace this text with a summary of your website. i.e. John Smith - Web Developer and Photographer - Welcome to my portfolio website! Here you will find all of my latest work. Enjoy!">
<!-- END OF Website description -->

<!-- DON'T TOUCH THIS SECTION -->
<%@include  file = "/WEB-INF/views/commons/jscss.jsp" %>
</head>
<!-- END OF DON'T TOUCH -->

<body>
<div class="wrapper">
	<!-- top -->
	<%@include file="toper.jsp" %>
    <!-- top -->
    
    <header>	<!-- Header Title Start -->
    	<h1>Hello there, I'm <span>&quot;Da T&quot;</span>. Welcome to my design portfolio!</h1>
        <h2>&ndash; Photographer and Web Developer &ndash;</h2>
    </header>	<!-- Header Title End -->
    <section id="slideshow">	<!-- Slideshow Start -->
        <div class="html_carousel">
			<div id="slider">
            
				<div class="slide">
					<img src="resources/liquid/images/slideshow/sliderimage1.jpg" width="3000" height="783" alt="image 1"/><!-- Replace these images with your own but make sure they are 3000px wide and 783px high or the same ration -->
				</div><!--/slide-->
                
				<div class="slide">
					<img src="resources/liquid/images/slideshow/sliderimage2.jpg" width="3000" height="783" alt="image 2"/><!-- Replace these images with your own but make sure they are 3000px wide and 783px high or the same ration -->
				</div><!--/slide-->
                
                <div class="slide">
					<img src="resources/liquid/images/slideshow/sliderimage3.jpg" width="3000" height="783" alt="image 3"/><!-- Replace these images with your own but make sure they are 3000px wide and 783px high or the same ration -->
				</div><!--/slide-->
                
			</div><!--/slider-->
			<div class="clearfix"></div>
		</div><!--/html_carousel-->
    </section>	<!-- Slideshow End -->
    
    
    <aside id="about" class=" left"> <!-- Text Section Start -->
    	<h3>about me</h3><!-- Replace all text with what you want -->
    	<p>Hey there, my name is &quot;Da T&quot; and I am a photographer and web developer! This is my brand new portfolio. It's super cool because it's completely responsive! That means you can re-size it to whatever size you like and it always looks great. Have a look around and enjoy.</p>
    </aside>
    <aside class="right">
    	<h3>my work</h3>
    	<p>Below, you will be able to find lots of my work. I take loads of pretty pictures and I also make websites. If you like what you see then you can contact me below! Maybe you would like to hire me or just have a chat, either way, I look forward to hearing from you.</p>
    </aside>
    <div class="clearfix"></div> <!-- Text Section End -->
    
    
    <section id="work"> <!-- Work Links Section Start -->
    	<div class="item">
        	<a href="work-template.jsp"><img src="resources/liquid/images/work/thumbs/item.png" alt="image 1"></a><!-- Image must be 400px by 300px -->
            <h3>Skies Of Spain</h3><!--Title-->
            <p>photography</p><!--Category-->
        </div><!--/item-->
        
        <div class="item">
        	<a href="work-template.jsp"><img src="resources/liquid/images/work/thumbs/item2.png" alt="image 2"></a><!-- Image must be 400px by 300px -->
        	<h3>Beautiful Bahrain</h3><!--Title-->
            <p>photography</p><!--Category-->
        </div><!--/item-->
        
        <div class="item">
        	<a href="work-template.jsp"><img src="resources/liquid/images/work/thumbs/item3.png" alt="image 3"></a><!-- Image must be 400px by 300px -->
        	<h3>Wild Stripes</h3><!--Title-->
            <p>photo manipulation</p><!--Category-->
        </div><!--/item-->
        
        <div class="item">
        	<a href="work-template.jsp"><img src="resources/liquid/images/work/thumbs/item4.png" alt="image 4"></a><!-- Image must be 400px by 300px -->
        	<h3>Lazy Days</h3><!--Title-->
            <p>photo manipulation</p><!--Category-->
        </div><!--/item-->
        
        <div class="item">
        	<a href="work-template.jsp"><img src="resources/liquid/images/work/thumbs/item5.png" alt="image 5"></a><!-- Image must be 400px by 300px -->
        	<h3>Trapped</h3><!--Title-->
            <p>photography</p><!--Category-->
        </div><!--/item-->
        
        	<div class="item">
        	<a href="work-template.jsp"><img src="resources/liquid/images/work/thumbs/item6.png" alt="image 6"></a><!-- Image must be 400px by 300px -->
            <h3>Quad-Core</h3><!--Title-->
            <p>photography</p><!--Category-->
        </div><!--/item-->
        
        <div class="item">
        	<a href="work-template.jsp"><img src="resources/liquid/images/work/thumbs/item7.png" alt="image 7"></a><!-- Image must be 400px by 300px -->
        	<h3>Retro Blast</h3><!--Title-->
            <p>illustration</p><!--Category-->
        </div><!--/item-->
        
        <div class="item">
        	<a href="work-template.jsp"><img src="resources/liquid/images/work/thumbs/item8.png" alt="image 8"></a><!-- Image must be 400px by 300px -->
        	<h3>Gates Of The Sun</h3><!--Title-->
            <p>photography</p><!--Category-->
        </div><!--/item-->
        
        <div class="item">
        	<a href="work-template.jsp"><img src="resources/liquid/images/work/thumbs/item9.png" alt="image 9"></a><!-- Image must be 400px by 300px -->
        	<h3>Winter Touch</h3><!--Title-->
            <p>photography</p><!--Category-->
        </div><!--/item-->
        
         <div class="item">
        	<a href="work-template.jsp"><img src="resources/liquid/images/work/thumbs/item10.png" alt="image 10"></a><!-- Image must be 400px by 300px -->
        	<h3>Burn</h3><!--Title-->
            <p>photo manipulation</p><!--Category-->
        </div><!--/item-->
        
        <div class="clearfix"></div>
    </section> <!-- Work Links Section End -->
    
    
    <section id="bottom"> <!-- Last Words Section Start -->
    	<h3>Thanks for looking at my new website!</h3>
    </section><!-- Last Words Section End-->
</div>

<!-- TO MAKE THE PHP FORM WORK, ALL YOU NEED TO DO IS OPEN UP THE FILE CALLED 'submitemail.php' AND CHANGE WHERE IT SAYS 'your email goes here' -->

<!-- footer -->
<%-- 
<%@include file = "/footer.jsp" %>
  --%>
<!-- footer -->

<!-- SLIDESHOW SCRIPT START -->
<script type="text/javascript">
$("#slider").carouFredSel({
	responsive	: true,
	scroll		: {
		fx			: "crossfade",
		easing		: "swing",
		duration	: 1000,
		
	},
	items		: {
		visible		: 1,
		height		: "27%"
	}
});
</script>
<!-- SLIDESHOW SCRIPT END -->
</body>
</html>

<!-- Thanks for looking at Liquid Gem! I hope you find it useful :) -->