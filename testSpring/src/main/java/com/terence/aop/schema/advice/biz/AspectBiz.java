package com.terence.aop.schema.advice.biz;

//ҵ����
public class AspectBiz {
	
	public void biz() {
		System.out.println("AspectBiz biz.");
		//throw new RuntimeException(); //��ҵ���߼����Ƿ��׳��쳣
	}
	
	public void init(String bizName, int times) {
		System.out.println("AspectBiz init : " + bizName + "   " + times);
	}
	
}
