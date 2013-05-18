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
		<script type="text/javascript" src="index.js"></script>

	</head>

	<body class="login-body-bg">
		welcome back!
		<fieldset>
			<legend>
				用户信息
			</legend>
			<ul>
				<li>
					<label>
						用户名:
					</label>
					<c:out value="${user.userName}" />
				</li>
				<li>
					<label>
						姓名：
					</label>
					<c:out value="${user.realName}" />
				</li>
				<li>
					<label>
						生日:
					</label>
					<fmt:formatDate value="${user.registerDate}" pattern="yyyy年MM月dd日"/>
				</li>
			</ul>
		</fieldset>
	</body>
</html>
