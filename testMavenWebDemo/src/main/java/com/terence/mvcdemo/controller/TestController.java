package com.terence.mvcdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class TestController {
	@RequestMapping("/login")
	public String login()
	{
		return "login";
	}
	@RequestMapping("/viewAll")
	public ModelAndView viewAll(String name,String pwd)
	{
		ModelAndView mv=new ModelAndView();
		System.out.println("�����˿�������viewAll������������");
		System.out.println("name="+name);
		System.out.println("pwd="+pwd);
		mv.setViewName("hello1");
		mv.addObject("msg", "���Ǵ�Controller�µ�viewAll�������ص�һ����Ϣ");
		return mv;
	}
}
