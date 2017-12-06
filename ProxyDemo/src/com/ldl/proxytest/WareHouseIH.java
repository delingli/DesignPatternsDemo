package com.ldl.proxytest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class WareHouseIH implements InvocationHandler {
	// 被代理者
	private Class cls;
	// 代理谁(被代理的势力实例)
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
