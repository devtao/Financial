<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/taglib.jsp"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'register.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<script type="text/javascript" src="script/calendar.js"></script>
  </head>
  
  <body>
    <fieldset>
    	<legend>用户注册</legend>
    	<form:form commandName="user">
    		<ul>
    			<li>
    				<form:label path="userName">用户名:</form:label>
    				<form:input path="userName" />
    			</li>
    			<li>
    				<form:label path="password">密码:</form:label>
    				<form:password path="password"/>
    			</li>
    			<li>
    				<form:label path="birthday">生日：</form:label>
    				<form:input path="birthday" onfocus="calendar.show(this);" size="10" maxlength="10" readonly="readonly"/>
    			</li>
    			<li>
					<form:label path="realName">真实姓名</form:label>
					<form:input path="realName"/>    			
    			</li>
    			<li>
    				<form:label path="phoneNum">联系方式：</form:label>
    				<form:input path="phoneNum"/>
    			</li>
    			<li>
    				<button type="submit">注册</button>
    				<button type="reset">重置</button>
    			</li>
    		</ul>
    	</form:form>
    </fieldset>
  </body>
</html>
