package com.terence.test.bean;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.terence.bean.BeanScope;
import com.terence.test.base.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestBeanScope extends UnitTestBase{
	public TestBeanScope()
	{
		super("classpath*:spring-beanscope.xml");
	}
	@Test
	public void testSay()
	{
		BeanScope beanScope=super.getBean("beanScope");
		beanScope.sayHello(beanScope);
		
		BeanScope beanScope1=super.getBean("beanScope");
		beanScope.sayHello(beanScope1);
		System.out.println("��������������ͬһ�����Է����µģ���ϣ��ַ��ͬ�����ʾ---����ģʽ");
	}
	@Test
	public void testSay2()
	{
		BeanScope beanScope=super.getBean("beanScope");
		beanScope.sayHello(beanScope);
		System.out.println("���һ��������testSay2���������еģ���ϣ��ַ����ͬ");
	}
	

}
