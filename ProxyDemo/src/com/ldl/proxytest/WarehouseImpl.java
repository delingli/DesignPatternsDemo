package com.ldl.proxytest;

public class WarehouseImpl implements Warehouse {
	private String address;

	public WarehouseImpl(String address) {
		super();
		this.address = address;
	}

	@Override
	public void receiveOrder() {
		System.out.println(address + "收到订单了");

	}

	@Override
	public void findProduct() {
		System.out.println(address + "在寻找订单");

	}

	@Override
	public void packUpProduct() {
		// TODO Auto-generated method stub
		System.out.println(address + "在打包订单了");

	}

	@Override
	public void sendOutProduct() {
		// TODO Auto-generated method stub
		System.out.println(address + "发出订单包裹了");

	}

}
