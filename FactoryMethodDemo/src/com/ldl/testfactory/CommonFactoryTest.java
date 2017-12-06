package com.ldl.testfactory;

import java.lang.reflect.Constructor;

public class CommonFactoryTest {
	private static CommonFactoryTest singleton;
	static {
		try {
			Class cl = Class.forName(CommonFactoryTest.class.getName());
			// ����޲ι���
			Constructor constructor = cl.getDeclaredConstructor();
			// �����޲ι����ǿɷ��ʵ�
			constructor.setAccessible(true);
			// ����һ��ʵ������
			singleton = (CommonFactoryTest) constructor.newInstance();
		} catch (Exception e) {
			// �쳣����
		}
	}

	public static CommonFactoryTest getSingleton() {
		return singleton;
	}

}
