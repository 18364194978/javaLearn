package com.terence.beanannotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Scope("prototype")//������
@Component("beanAnnotation") //bean��ע������
public class BeanAnnotation {
	public void say(String arg)
	{
		System.out.println("BeanAnnotation:"+arg);
	}
	public void myHashCode()
	{
		System.out.println("BeanAnnotation:"+this.hashCode());
	}

}
