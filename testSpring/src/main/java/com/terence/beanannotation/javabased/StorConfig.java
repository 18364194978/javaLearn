package com.terence.beanannotation.javabased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

@Configuration
@ImportResource("classpath:config.xml")
public class StorConfig {
/*	@Value("${url}")
	private String url;
	@Value("${jdbc.username}")
	private String username;
	@Value("${password}")
	private String password;
	
	@Bean
	public MyDriverManager myDriverManager()
	{
		return new MyDriverManager(url,username,password);
	}*/
	
	
	
	@Bean(name="store" ,initMethod="init",destroyMethod="destroy")
	//�Զ���name,��ʼ�����������ٷ�����������֮ǰִ��init�����������֮��ִ�����ٷ�����
	public Store stringStore1()
	{
		return new StringStore();
	}
	
	@Bean(name="stringStore" ,initMethod="init",destroyMethod="destroy")
	           //�Զ���name,��ʼ�����������ٷ�����������֮ǰִ��init�����������֮��ִ�����ٷ�����
	@Scope(value="prototype",proxyMode=ScopedProxyMode.TARGET_CLASS) 
	           //value="prototype"��ʾÿ�����󶼴���һ���µĶ���,����proxyMode=ScopedProxyMode.TARGET_CLASS��ͬһ��������
	public Store stringStore2()
	{
		return new StringStore();
	}

}
