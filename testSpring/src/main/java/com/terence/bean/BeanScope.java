package com.terence.bean;

public class BeanScope {
	public void sayHello( BeanScope bs)
	{
		System.out.println("Hello I'm BeanScope");
		System.out.println("��ϣ��ַ��"+bs.hashCode());
	}

}
