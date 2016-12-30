package com.terence.mvcdemo.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public  class Test1Interceptor implements HandlerInterceptor {

	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2,
			Exception arg3) throws Exception {
		System.out.println("ִ�е���afterCompletion1����");
		
	}

	public void postHandle(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2,
			ModelAndView arg3) throws Exception {
		arg3.addObject("msg","����������postHandle�����޸�֮�����Ϣ");//���Ĵ��صĲ���ֵ��
		arg3.setViewName("hello2");//��������ҳ�棬�������ض���
		System.out.println("ִ�е���postHandle1����");	
	}

	public boolean preHandle(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2)
			throws Exception {
		arg0.setCharacterEncoding("utf-8");
		
		System.out.println("ִ�е���preHandle1����");
		//����û�û�е�¼������ֹ����,�����ص���¼ҳ��
//		if(arg0.getSession().getAttribute("user")==null)
//		{
//			arg0.getRequestDispatcher("/login").forward(arg0, arg1);
//				//return false;
//		}
		return true;
	}
}
