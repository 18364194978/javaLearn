package com.terence.ioc.injection.service;

import com.terence.ioc.injection.dao.InjectionDAO;
import com.terence.ioc.injection.dao.InjectionDAOImpl;

public class InjectionServiceImpl implements InjectionService {
	
	private InjectionDAO injectionDAO;
	
	//����ע��
	public InjectionServiceImpl(InjectionDAOImpl injectionDAO) {
		this.injectionDAO = injectionDAO;
	}
	
	//��ֵע��
	public void setInjectionDAO(InjectionDAOImpl injectionDAO) {
		this.injectionDAO = injectionDAO;
	}

	public void save(String arg) {
		
		System.out.println("����ע��InjectionSservice���ܵĲ�����"+arg);
		arg=arg+":"+this.hashCode();
		injectionDAO.save(arg);
	}

}
