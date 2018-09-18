<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
	<title>测试</title>
  </head>
  
  
  <body>
  <shiro:hasPermission name="admin">
   <a href="/demo/user/showUser?id=1">click</a>
  </shiro:hasPermission>
    ${user.userName}
      <shiro:hasPermission name="admin1">
   <a href="/demo/login/logout">logout</a>
  </shiro:hasPermission>
    
    
  </body>
  </html>
