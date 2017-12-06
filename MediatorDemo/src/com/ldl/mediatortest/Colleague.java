/**
 * 
 */
package com.ldl.mediatortest;

/**
 * @author deling 2017年11月3日 抽象用户类
 */
public abstract class Colleague {
	protected HouseMediator mediator;

	public Colleague(HouseMediator mediator) {
		super();
		this.mediator = mediator;
	}

}
