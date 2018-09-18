<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<div style="text-align: left;border-color: grey;">
    <h3>登陆</h3>
    <form action="/demo/login/doLogin" method="post">
        username:<input name="username" /><br><br>
        password:<input type="password" name="password" /><br><br>
        <input type="submit" value="submit"/>
    </form>
</div>