<%@ page language="java" import="java.util.*;" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/taglib.jsp"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort();
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">

		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<title>My Dev Platform</title>

	</head>

	<body class="login-body-bg">
		<fieldset>
			<legend>
				登录
			</legend>
			<form:form commandName="user">
				<form:hidden path="userID" />
				<ul>
					<li>
						<form:label path="userName">用户名:</form:label>
						<form:input path="userName" />
					</li>
					<li>
						<form:label path="password">密码:</form:label>
						<form:password path="password" />
					</li>
					<li>
						<button type="submit">
							登录
						</button>
						<button type="reset">
							重置
						</button>
					</li>
				</ul>
			</form:form>
		</fieldset>
	</body>
</html>
