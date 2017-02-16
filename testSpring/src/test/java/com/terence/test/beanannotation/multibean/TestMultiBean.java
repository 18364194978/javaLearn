package com.terence.test.beanannotation.multibean;



import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.terence.beanannotation.multibean.BeanInvoker;
import com.terence.test.base.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestMultiBean extends UnitTestBase {
	public TestMultiBean()
	{
		super("classpath*:spring-beanannotation.xml");
	}
	@Test //ͨ�������ļ������������ɨ����µ������࣬�Զ�װ�����鼯�����͵Ķ���
	//����������Խ��ӿ����е�ʵ�����Զ�ע�뵽���ϵ���ȥ
	public void testMultiBean()
	{
		BeanInvoker invoker=super.getBean("beanInvoker");
		invoker.say();
	}
}

