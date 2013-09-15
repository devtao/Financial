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
<link href="http://code.jquery.com/ui/1.9.0/themes/base/jquery-ui.css" rel="stylesheet"/>
<link href="resources/idealform/css/jquery.idealforms.min.css" rel="stylesheet" media="screen"/>

</head>
<!-- END OF DON'T TOUCH -->

<body>
<div class="wrapper">
	<!-- top -->
	<%@include file="/toper.jsp" %>
    <!-- top -->
   
   <!-- content --> 
    <form id="incomeForm">

  <!-- TAB -->
    <!-- Text -->
    <div><label>Username:</label><input type="text" name="username"/></div>
    <div><label>Date:</label><input type="text" name="date" class="datepicker" placeholder="mm/dd/yy"/></div>
    <div><label>Comments:</label><textarea name="comments"></textarea></div>

  <!-- Separator -->
  <div><hr/></div>

  <!-- Buttons -->
  <div>
    <button type="submit">Submit</button>
    <button id="reset" type="button">Reset</button>
  </div>

</form>
    <!-- content -->
    <section id="bottom"> <!-- Last Words Section Start -->
    	<h3>Thanks for looking at my new website!</h3>
    </section><!-- Last Words Section End-->
</div>

<!-- TO MAKE THE PHP FORM WORK, ALL YOU NEED TO DO IS OPEN UP THE FILE CALLED 'submitemail.php' AND CHANGE WHERE IT SAYS 'your email goes here' -->

<!-- footer -->
<%-- 
<%@include file = "footer.jsp" %>
  --%> 
<!-- footer -->

<script src="resources/idealform/js/min/jquery.idealforms.js"></script>
<script >
var options = {

	    onFail: function() {
	      alert( $myform.getInvalid().length +' invalid fields.' )
	    },

	    inputs: {
	      'password': {
	        filters: 'required pass',
	      },
	      'username': {
	        filters: 'required username',
	        data: {
	          //ajax: { url:'validate.php' }
	        }
	      }
	    }
	  };

  var $myform = $('#incomeForm').idealforms(options).data('idealforms');
</script>


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