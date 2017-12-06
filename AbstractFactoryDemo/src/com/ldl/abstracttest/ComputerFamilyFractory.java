package com.ldl.abstracttest;

public class ComputerFamilyFractory extends AbstractComputerFactory {

	@Override
	public ComputerProductA createComputerA() {
		// TODO Auto-generated method stub
		return new ComputerProductAFamily();
	}

	@Override
	public ComputerProductB createComputerB() {
		// TODO Auto-generated method stub
		return new ComputerProductBFamily();
	}

}
