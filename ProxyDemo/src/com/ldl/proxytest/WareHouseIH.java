package com.ldl.proxytest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class WareHouseIH implements InvocationHandler {
	// ��������
	private Class cls;
	// ����˭(�����������ʵ��)
	private Object obj;

	public WareHouseIH(Object obj) {
		super();
		this.obj = obj;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object result = method.invoke(obj, args);
		return result;
	}

}
