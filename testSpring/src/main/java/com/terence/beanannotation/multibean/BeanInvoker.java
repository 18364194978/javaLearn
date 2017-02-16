package com.terence.beanannotation.multibean;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BeanInvoker {
	@Autowired
	private List<BeanInterface> list;
	@Autowired
	private Map<String,BeanInterface> map;
	@Autowired
	@Qualifier("beanImplTwo") //��С��Χָ��������ķ�Χ��
	private BeanInterface beanInterface;
	
	public void say()
	{
		System.out.println("list���Խ����");
		if(null!=list&&list.size()!=0)
		{
			for(BeanInterface bean:list)
			{
				System.out.println(bean.getClass().getName());
			}
		}
		else
		{
			System.out.println("List<BeanInterface> list is null������������������");
		}
		System.out.println("map���Խ����");
		if(map!=null&&map.size()!=0)
		{
			for(Map.Entry<String, BeanInterface> entry:map.entrySet())
			{
				System.out.println(entry.getKey()+"     "+entry.getValue().getClass().getName());
			}
			
		}
		else
		{
			System.out.println("Map<String,BeanInterface> map is null������������������");
		}
		System.out.println();
		if(null!=beanInterface)
		{
			System.out.println(beanInterface.getClass().getName());
		}
		else
		{
			System.out.println("beanInterface is null.........");
		}
		
		
		
	}
	
	
	

}
