package com.terence.beanannotation.injection.dao;

import org.springframework.stereotype.Repository;

@Repository
public class InjectionDAOImpl implements InjectionDAO {

	public void save(String arg) {
		//ģ�����ݿⱣ�����
		System.out.println("�������ݣ�"+arg);
	}
}
