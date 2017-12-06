package com.ldl.testfactory;

/*
 * 抽象工厂上层
 */
public abstract class AbsrtactComputerFactory {
	// 限制传入类型只能是Computer的子类
	public abstract <T extends Computer> T createComputer(Class<T> c);

}
