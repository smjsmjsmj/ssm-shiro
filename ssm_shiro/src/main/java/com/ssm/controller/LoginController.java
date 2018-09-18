package com.ssm.controller;

import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ssm.entity.Users;

@Controller
@RequestMapping("/login")
public class LoginController {
	@RequestMapping("")
	public String login(){
	    return "login";
	}
	
	@RequestMapping(value = "/doLogin",method = RequestMethod.POST)
    public String doLogin(@RequestParam String username, @RequestParam String password, Model model,HttpSession session){
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        token.setRememberMe(true);
        try {
            subject.login(token);
            Users loginUser = (Users)session.getAttribute("loginUser");
            model.addAttribute("loginUser",loginUser);
            return  "redirect:/index";
        }catch (Exception e){
            return "login";
        }
    }
	@RequiresPermissions("admin")
	@RequestMapping("/logout")
	public String logout(){
		 Subject subject = SecurityUtils.getSubject();
		 subject.logout();
		 return "login";
	}
	
}
