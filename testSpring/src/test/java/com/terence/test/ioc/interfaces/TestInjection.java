package com.terence.test.ioc.interfaces;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.terence.ioc.injection.service.InjectionService;
import com.terence.test.base.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestInjection extends UnitTestBase {
	
	public TestInjection() {
		super("classpath:spring-injection.xml");
	}

	//��Ԫ���Ե�ʱ��Ҫ˫��ѡ����Ӧ�ķ�����
	@Test
	public void testSetter() {
		InjectionService service = super.getBean("injectionService");
		service.save("Terence");
	}
	
	@Test
	public void testCons() {
		InjectionService service = super.getBean("injectionService");
		service.save("Terence");
	}
	
}