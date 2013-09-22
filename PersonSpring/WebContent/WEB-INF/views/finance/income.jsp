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
<script src="http://code.jquery.com/ui/1.9.0/jquery-ui.min.js"></script>
<script src="resources/idealform/js/min/jquery.idealforms.js"></script>

</head>
<!-- END OF DON'T TOUCH -->

<body>
<div class="wrapper">
	<!-- top -->
	<%@include file="/toper.jsp" %>
    <!-- top -->
   
   <!-- content --> 
    <form id="incomeForm">
    <div><label>金额:</label><input type="number" id="amount" name="amount"/></div>
      <!-- Select -->
    <div>
      <label>收入类别:</label>
      <select name="category">
          <option value="default">选择类别</option>
          <option value="Red">Red</option>
          <option value="Blue">Blue</option>
          <option value="Green">Green</option>
      </select>
    </div>
    <!-- Text -->
    <div><label>记账日期:</label><input type="text" id = "addDate" name="addDate" class="datepicker" placeholder="mm/dd/yy"/></div>
    <div><label>备注:</label><textarea name="comments"></textarea></div>

  <!-- Separator -->
  <div><hr/></div>
  <!-- Buttons -->
  <div>
    <button type="submit">确认</button>
    <button id="reset" type="button">重置</button>
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


<script >
//设置默认日期为当前日期
$('#addDate').val((new Date()).format('mm/dd/yyyy'));

var options = {

	    onFail: function() {
	      alert( $myform.getInvalid().length +' invalid fields.' )
	    },

	    inputs: {
	    	'amount': {
	    		  filters: 'required number range',
	    		  data: { range: [ 1, 100000] }
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