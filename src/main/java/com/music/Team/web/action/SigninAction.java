package com.music.Team.web.action;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.music.Team.bean.User;
import com.music.Team.biz.UserBiz;


@Controller
public class SigninAction {
	@Resource
	private UserBiz sbiz;
	
	@RequestMapping(path="signin.do")
	public String Signin(User user,HttpServletRequest request){ 
		
		//获取邮箱 跟密码
		user.setUser_email((String) request.getParameter("user_email"));
		user.setUser_pwd((String) request.getParameter("user_pwd"));	
		
			//执行查询方法
			String userName=sbiz.selectUser(user);
			
			if(userName.equals("")){
				//未查询到用户
				request.setAttribute("msg","用户名或者密码错误！");
				return "signin";
			}else{
				//查询到用户 跳转到主页
				request.getSession().setAttribute("user", user);
				return "index";
			}
		
	
	
	}
}
