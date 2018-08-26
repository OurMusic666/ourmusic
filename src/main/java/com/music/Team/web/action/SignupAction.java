package com.music.Team.web.action;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.music.Team.bean.User;
import com.music.Team.biz.UserBiz;
import com.music.Team.util.SendEmailUtil;

@Controller
public class SignupAction {
	@Resource
	private UserBiz sbiz;
	
	
	
	@RequestMapping(path="signup.do")
	public String Signup(User user,HttpServletRequest request) throws DuplicateKeyException{ 				
		//获取邮箱的验证码
		String code = SendEmailUtil.getCode();
		//获取页面验证码
		String signcode = (String) request.getParameter("code");
		//判断输入的验证跟邮箱验证码是否相同
		try{
		if(!code.equals(signcode)&&code!=null){
			request.setAttribute("msg", "验证码输入错误，请稍后再试");
			return "signup";
			
		}else{
		user.setUser_name((String) request.getParameter("user_name"));
		user.setUser_pwd((String) request.getParameter("user_pwd"));	
		user.setUser_email((String) request.getParameter("user_email"));
		
		user.setUser_isMember(0);
		String msg=sbiz.createUser(user);
		System.out.println("msg="+msg);
		}
		request.setAttribute("msg", "恭喜您注册成功！您登陆的邮箱号码为："+user.getUser_email());
		}catch(NullPointerException e){
			e.printStackTrace();
			request.setAttribute("msg", "注册失败，请稍后再试！");
			return "signup";
		}
		
	return "signin";
	}
	//对应ajax sendCode 请求
	@RequestMapping("/sendCode")
	public void sendCode(HttpServletRequest request,String email){
		
		System.out.println("receiveMail="+email);
		SendEmailUtil .sendMail(email);
		
	}
	//对应ajax selectName 请求
	@RequestMapping("/selectName")
	public void selectName(Model model,User user,HttpServletRequest request,String name){
		
		System.out.println("name="+name);
		user.setUser_name(name);
		
		String namemsg= sbiz.selectName(user);
		
		if(namemsg.equals("")||namemsg==null){
			System.out.println("用户名未注册");
			request.setAttribute("", "");
			
		}else{
			System.out.println("用户名已被注册");
			model.addAttribute("msg", "用户名已被注册");
			

		}
		
		
	}
	
}
