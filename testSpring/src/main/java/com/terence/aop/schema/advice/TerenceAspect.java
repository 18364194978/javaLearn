package com.terence.aop.schema.advice;

import org.aspectj.lang.ProceedingJoinPoint;

public class TerenceAspect {
	
	public void before() {
		System.out.println("TerenceAspect before.");
	}
	
	public void afterReturning() {
		System.out.println("TerenceAspect afterReturning.");
	}
	
	public void afterThrowing() {
		System.out.println("TerenceAspect afterThrowing.");
	}
	
	public void after() {
		System.out.println("TerenceAspect after.");
	}
	
	public Object around(ProceedingJoinPoint pjp){
		Object obj = null;
		try {
			System.out.println("TerenceAspect around 1.");
			obj = pjp.proceed();
			System.out.println("TerenceAspect around 2.");
		} 
		catch (Throwable e) { //��׽�쳣�������ڷ������׳��쳣
			e.printStackTrace();
		}
		return obj;
	}
	
	public Object aroundInit(ProceedingJoinPoint pjp,String bizName,int times)
	{
		System.out.println(bizName+" "+times);
		Object obj = null;
		try {
			System.out.println("TerenceAspect around 1.");
			obj = pjp.proceed();
			System.out.println("TerenceAspect around 2.");
		} 
		catch (Throwable e) { //��׽�쳣�������ڷ������׳��쳣
			e.printStackTrace();
		}
		return obj;
		
	}
	
}
