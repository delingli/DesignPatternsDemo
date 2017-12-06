package com.ldl.testfactory;

public class ComputerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer comp=ComputerFactory.createComputer(InspirationComputer.class);
//		AbsrtactComputerFactory compFactory = new ComputerFactory();
//		Computer inspirationComputer = compFactory.createComputer(InspirationComputer.class);
//		System.out.println(inspirationComputer.getComputerDesc() + "\n" + inspirationComputer.getModelNumber() + "\n"
//				+ inspirationComputer.getComputerPrice());
//		Computer vostroComputer = compFactory.createComputer(VostroComputer.class);
//		System.out.println(vostroComputer.getComputerDesc() + "\n" + vostroComputer.getModelNumber() + "\n"
//				+ vostroComputer.getComputerPrice());
		System.out.println(comp.getComputerDesc() + "\n" + comp.getModelNumber() + "\n"
				+ comp.getComputerPrice());
	}

}
