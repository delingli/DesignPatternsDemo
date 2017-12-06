package com.ldl.proxytest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import com.sun.corba.se.impl.presentation.rmi.DynamicAccessPermission;
//����ģʽ
public class ProxyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Warehouse wareHouse = new WarehouseImpl("����");
		InvocationHandler proxyHandler = new WareHouseIH(wareHouse);
		// ���Ƕ�̬����һ���������
		Warehouse proxy = (Warehouse) Proxy.newProxyInstance(wareHouse.getClass().getClassLoader(),
				wareHouse.getClass().getInterfaces(), proxyHandler);

		proxy.receiveOrder();
		proxy.findProduct();
		proxy.packUpProduct();
		proxy.sendOutProduct();
		// Warehouse wareHouseProxy = new WareHouseProxy(wareHouse);
		// wareHouseProxy.receiveOrder();
		// wareHouseProxy.findProduct();
		// wareHouseProxy.packUpProduct();
		// wareHouseProxy.sendOutProduct();
	}

}
