package com.hdu.terence.util;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class AnnotationTest {
	/*
	 * @Test ��һ���������γɲ��Է��� 
	 *   @Test(excepted=XX.class)
	 *   @Test(timeout=����)
	 * @BeforeClass ���������еķ�������ǰ��ִ�У�static����
	 * @AfterClass  ���������еķ������������У�static����
	 * @Before ����ÿһ�����Է���������ǰִ��һ��
	 * @After  ����ÿһ�����Է������к�ִ��һ�Ρ�
	 * @Ignore �����εķ����ᱻ�������������� ������Լ��� ("����˵������")
	 * @RunWith:���Ը��Ĳ��������� org.junit.runner.Runner
	 * 
	 */
	
	/*
	 * expected=ArithmeticException.class��ʾԤ���׳��쳣�����дﵽ���н������ʾ���гɹ���
	 */
	@Test(expected=ArithmeticException.class)
	public void testAdd()
	{
		assertEquals(3,new Calculate().divide(6, 0));
	}
	
	
	/*
	 * @Test(timeout=2000)	��ʾ����ִ����2s��ѭ��ִ�У�������ʱ�����ѭ��ֹͣ����ʾ���Կ��ܳ��ֵĴ���ִ�еõ���ֹ��
	 */
	@Ignore("����������ܱ�ִ��")
	@Test(timeout=2000)	
	public void testWhile()
	{
		while(true)
		{
			System.out.println("run forever����");
		}		
	}
	
	/*
	 * ����ִֻ�����롣
	 */
	@Test(timeout=3000)
	public void testReadFile()
	{
		try{
			Thread.sleep(2000);
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}
