package com.ldl.proxytest;

public class WarehouseImpl implements Warehouse {
	private String address;

	public WarehouseImpl(String address) {
		super();
		this.address = address;
	}

	@Override
	public void receiveOrder() {
		System.out.println(address + "�յ�������");

	}

	@Override
	public void findProduct() {
		System.out.println(address + "��Ѱ�Ҷ���");

	}

	@Override
	public void packUpProduct() {
		// TODO Auto-generated method stub
		System.out.println(address + "�ڴ��������");

	}

	@Override
	public void sendOutProduct() {
		// TODO Auto-generated method stub
		System.out.println(address + "��������������");

	}

}
