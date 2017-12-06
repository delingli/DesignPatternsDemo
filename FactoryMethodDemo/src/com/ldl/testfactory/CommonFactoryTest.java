package com.ldl.testfactory;

import java.lang.reflect.Constructor;

public class CommonFactoryTest {
	private static CommonFactoryTest singleton;
	static {
		try {
			Class cl = Class.forName(CommonFactoryTest.class.getName());
			// 获得无参构造
			Constructor constructor = cl.getDeclaredConstructor();
			// 设置无参构造是可访问的
			constructor.setAccessible(true);
			// 产生一个实例对象
			singleton = (CommonFactoryTest) constructor.newInstance();
		} catch (Exception e) {
			// 异常处理
		}
	}

	public static CommonFactoryTest getSingleton() {
		return singleton;
	}

}
