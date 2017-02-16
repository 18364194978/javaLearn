package com.terence.test.beanannotation.injection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.terence.beanannotation.injection.service.InjectionService;
import com.terence.test.base.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestInjection extends UnitTestBase {
	public TestInjection()
	{
		super("classpath*:spring-beanannotation.xml");
	}
	@Test //ͨ�������ļ������������ɨ����µ������࣬�Զ�װ�����
	public void testAutowired()
	{
		InjectionService service=super.getBean("injectionServiceImpl");
		service.save("This is Autowired");
	}
}