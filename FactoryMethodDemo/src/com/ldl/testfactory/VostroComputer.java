package com.ldl.testfactory;

public class VostroComputer implements Computer {
	@Override
	public String getModelNumber() {
		// TODO Auto-generated method stub
		return "Vostro 5459-1528";
	}

	@Override
	public String getComputerPrice() {
		// TODO Auto-generated method stub
		return "¥ 4499.00";
	}

	@Override
	public String getComputerDesc() {
		return "适用场景	 商务办公 家庭娱乐";}

}
