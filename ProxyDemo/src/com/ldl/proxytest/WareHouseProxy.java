package com.ldl.proxytest;

public class WareHouseProxy implements Warehouse {
	private Warehouse warehouse;

	public WareHouseProxy(Warehouse warehouse) {
		super();
		this.warehouse = warehouse;
	}

	@Override
	public void receiveOrder() {
		// TODO Auto-generated method stub
		this.warehouse.receiveOrder();

	}

	@Override
	public void findProduct() {
		// TODO Auto-generated method stub
		this.warehouse.findProduct();
	}

	@Override
	public void packUpProduct() {
		// TODO Auto-generated method stub
		this.warehouse.packUpProduct();
	}

	@Override
	public void sendOutProduct() {
		// TODO Auto-generated method stub
		this.warehouse.sendOutProduct();
	}

}
