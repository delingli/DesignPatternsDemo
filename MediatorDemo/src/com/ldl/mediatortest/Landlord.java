/**
 * 
 */
package com.ldl.mediatortest;

/**
 * @author deling 2017年11月3日
 */
// 定义一个房东类
public class Landlord extends Colleague {

	private String name;

	public Landlord(HouseMediator mediator, String name) {
		super(mediator);
		this.name = name;
	}

	public void say() {
		System.out.println("你好我叫" + name + "我这有一套三室一厅出租");
	}

	public void houseoffer() {
		System.out.println("我报价3000押一付一");
	}
}
