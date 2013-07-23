<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/taglib.jsp"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
	 <head>
	     <meta charset="UTF-8" />
	     <!-- <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">  -->
	      <base href="<%=basePath%>">
	      <title>Welcome to Da T Space</title>
	      <meta name="viewport" content="width=device-width, initial-scale=1.0"> 
	      <meta name="description" content="Login and Registration Form with HTML5 and CSS3" />
	      <meta name="keywords" content="html5, css3, form, switch, animation, :target, pseudo-class" />
	      <link rel="stylesheet" type="text/css" href="resources/css/demo.css" />
	      <link rel="stylesheet" type="text/css" href="resources/css/style3.css" />
		  <link rel="stylesheet" type="text/css" href="resources/css/animate-custom.css" />
	</head>
	<body>
		<form id="emailForm" action="sendEmail.do" method = "post">
			<input type=submit id = "mysubmit" value = "发送">			
		</form>
	
	</body>

    
</html>
