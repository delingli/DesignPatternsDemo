/**
 * 
 */
package com.ldl.mediatortest;

/**
 * @author deling 2017年11月3日 具体租户
 */
public class ColleagueImpl extends Colleague {

	public ColleagueImpl(HouseMediator mediator, String name) {
		super(mediator);
		this.name = name;
	}

	private String name;

	public void tenantSay() {
		System.out.println("你好我是" + name + "我准备租套房子3室一厅的就行");
	}

}
