<%@ page language="java" pageEncoding="UTF-8"%>  
  
<%     
    request.setCharacterEncoding("UTF-8");  
    response.setCharacterEncoding("UTF-8");  
    String json = "{totalProperty : 10,root:["+  
        "{month:'1月', number: 20},"+  
        "{month:'2月', number: 80},"+  
        "{month:'3月', number: 50},"+  
        "{month:'4月', number: 60},"+  
        "{month:'5月', number: 45},"+  
        "{month:'6月', number: 70},"+  
        "{month:'7月', number: 80},"+  
        "{month:'8月', number: 60},"+  
        "{month:'9月', number: 40},"+  
        "{month:'10月', number: 30},"+  
        "{month:'11月', number: 55},"+  
        "{month:'12月', number: 32}]}";  
    System.out.print(json);  
    response.getWriter().write(json);  
%>  