package com.ldl.testfactory;

/*
 * ���󹤳��ϲ�
 */
public abstract class AbsrtactComputerFactory {
	// ���ƴ�������ֻ����Computer������
	public abstract <T extends Computer> T createComputer(Class<T> c);

}
