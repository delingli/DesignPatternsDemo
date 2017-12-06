package com.ldl.testfactory;

/**
 * ����Ĺ�������ʵ�֣�Ŀ�ľ�����������
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
