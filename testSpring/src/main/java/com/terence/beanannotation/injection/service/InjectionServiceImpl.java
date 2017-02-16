package com.terence.beanannotation.injection.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.terence.beanannotation.injection.dao.InjectionDAO;

@Service
public class InjectionServiceImpl implements InjectionService {

	//@Autowired //�����Զ�ע�뷽ʽ����Ա����ע�룬setע�룬������ע��
	private InjectionDAO injectionDAO;
	

	@Autowired
	public InjectionServiceImpl(InjectionDAO injectionDAO) {
		super();
		this.injectionDAO = injectionDAO;
	}

	//@Autowired
	public void setInjectionDAO(InjectionDAO injectionDAO) {
		this.injectionDAO = injectionDAO;
	}

	public void save(String arg) {
		//ģ��ҵ�����
		System.out.println("Service���ܲ�����"+arg);
		arg=arg+":"+this.hashCode();
		injectionDAO.save(arg);
	}
}
