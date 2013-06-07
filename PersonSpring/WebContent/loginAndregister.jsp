<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/taglib.jsp"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<!--[if lt IE 7 ]> <html lang="en" class="no-js ie6 lt8"> <![endif]-->
<!--[if IE 7 ]>    <html lang="en" class="no-js ie7 lt8"> <![endif]-->
<!--[if IE 8 ]>    <html lang="en" class="no-js ie8 lt8"> <![endif]-->
<!--[if IE 9 ]>    <html lang="en" class="no-js ie9"> <![endif]-->
<!--[if (gt IE 9)|!(IE)]><!--> <html lang="en" class="no-js"> <!--<![endif]-->
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
		
		<script type="text/javascript" language="javascript">
				function openDiv()
				{
					 var loginId =  "${login.loginId}" ; 
					 alert(loginId);
					 if(loginId ==null ){
						 document.getElementById("loginfail").style.visibility="visible";
						 document.getElementById("loginfail").style.display="block";
					} 
				}
				function closeDiv()
				{
						document.getElementById("loginfail").style.visibility="hidden";
						document.getElementById("loginfail").style.display="none";
				}
	</script>
		
		
		
    </head>
    <body >
        <div class="container">
            <header>
                <h1>Hey gay ! <span>welcome to da t.'s space</span></h1>
				<nav class="codrops-demos">
					<span>Click <strong>"Join us"</strong> to get an account</span>
				</nav>
            </header>
            <section>				
                <div id="container_demo" >
                    <!-- hidden anchor to stop jump http://www.css3create.com/Astuce-Empecher-le-scroll-avec-l-utilisation-de-target#wrap4  -->
                    <a class="hiddenanchor" id="toregister"></a>
                    <a class="hiddenanchor" id="tologin"></a>
                    <div id="wrapper">
                        <div id="loginin" class="animate form" >
                             <form:form commandName="login">
                            	<h1>Log in</h1> 
								<div  id="loginfail"  style="visibility:hidden ; display:none" class="codrops-demos">用户名或密码不对 请重新输入 !</div>
								<form:hidden path="loginId" />
                                <p> 
                                    <form:label  path = "loginName" for="username" class="uname" data-icon="u" > Your email or username </form:label>
                                    <form:input path = "loginName" id="username" name="username" required="required" type="text" placeholder="username or email all is ok !"/>
                                </p>
                                <p> 
                                    <form:label path = "loginPwd"  for="password" class="youpasswd" data-icon="p"> Your password </form:label>
                                    <form:input path = "loginPwd"   id="password" name="password" required="required" type="password" placeholder="" /> 
                                </p>
                                <p class="keeplogin"> 
									<form:checkbox path = "loginkeeping"   name="loginkeeping" id="loginkeeping" value="loginkeeping" /> 
									<form:label path = "loginkeeping"   for="loginkeeping">Keep me logged in</form:label>
								</p>  
                                <p class="login button"> 
                                    <input   type="submit" value="Login" /> 
								</p>
                                <p class="change_link">
									Not a member yet ?
									<a href="#toregister" class="to_register">Join us</a>
								</p>
                            </form:form> 
                            
                        </div>

                        <div id="register" class="animate form">
                            <form  action="mysuperscript.php" autocomplete="on"> 
                                <h1> Sign up </h1> 
                                <p> 
                                    <label for="usernamesignup" class="uname" data-icon="u">Your username</label>
                                    <input id="usernamesignup" name="usernamesignup" required="required" type="text" placeholder="simple username " />
                                </p>
                                <p> 
                                    <label for="emailsignup" class="youmail" data-icon="e" > Your email</label>
                                    <input id="emailsignup" name="emailsignup" required="required" type="email" placeholder="input  email like : dev.tao@gmail.com"/> 
                                </p>
                                <p> 
                                    <label for="passwordsignup" class="youpasswd" data-icon="p">Your password </label>
                                    <input id="passwordsignup" name="passwordsignup" required="required" type="password" placeholder="strong password like : eg.X8df!90EO"/>
                                </p>
                                <p> 
                                    <label for="passwordsignup_confirm" class="youpasswd" data-icon="p">Please confirm your password </label>
                                    <input id="passwordsignup_confirm" name="passwordsignup_confirm" required="required" type="password" placeholder="strong password like : eg.X8df!90EO"/>
                                </p>
                                <p class="signin button"> 
									<input type="submit" value="Sign up"/> 
								</p>
                                <p class="change_link">  
									Already a member ?
									<a href="#tologin" class="to_register"> Go and log in </a>
								</p>
                            </form>
                        </div>
						
                    </div>
                </div>  
            </section>
        </div>
    </body>
</html>
