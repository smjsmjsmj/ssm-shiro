package com.ssm.controller;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index")
public class IndexController {
	
	@RequiresPermissions("admin")
	@RequestMapping("")
	public String login(){
	    return "index";
	}
}
