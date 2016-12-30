package com.terence.mvcdemo.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//��һ����ǩ��spring֪������һ��controller 
//ʹ�ø�ע�����ᱻdispatcherɨ��ע�Ტ��ʹ�ø����˵ķ���ͬʱ���
@Controller
//���ظ�Ŀ¼�µ�hello��
@RequestMapping("/hello") 
public class HelloMvcController {
	
	//����URL
	@RequestMapping("/mvc")
	//���Controller����Ӧ����һ������host:8080/hello/mvc
	public String helloMvc()
	{
		return "home";
	}
	@RequestMapping("login")
	public String loginMvc()
	{
		
		return "login";
	}
	

}
