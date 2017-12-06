package com.ldl.testfactory;

/**
 * 具体的工厂方法实现，目的就是生产电脑
 * 
 * @author Administrator
 *
 */
public class ComputerFactory  {


	public static <T extends Computer> T createComputer(Class<T> c) {
		Computer computer = null;
		try {
			computer = (T) Class.forName(c.getName()).newInstance();
		} catch (Exception e) {

			e.printStackTrace();
		}

		return (T) computer;
	}

}
