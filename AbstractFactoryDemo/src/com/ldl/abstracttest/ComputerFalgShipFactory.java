package com.ldl.abstracttest;

public class ComputerFalgShipFactory extends AbstractComputerFactory {

	@Override
	public ComputerProductA createComputerA() {
		// TODO Auto-generated method stub
		return new ComputerProductAFalgShip();
	}

	@Override
	public ComputerProductB createComputerB() {
		// TODO Auto-generated method stub
		return new ComputerProductBFalgShip();
	}

}
