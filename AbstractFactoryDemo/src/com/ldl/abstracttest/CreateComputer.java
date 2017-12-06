package com.ldl.abstracttest;

public class CreateComputer {

	public static void main(String[] args) {
		AbstractComputerFactory create1 = new ComputerFalgShipFactory();
		AbstractComputerFactory create2 = new ComputerFamilyFractory();
		create1.createComputerA().makeComputer();

		create1.createComputerB().makeComputer();

		create2.createComputerA().makeComputer();

		create2.createComputerB().makeComputer();

	}

}
