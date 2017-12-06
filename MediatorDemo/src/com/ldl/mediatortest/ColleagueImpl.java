/**
 * 
 */
package com.ldl.mediatortest;

/**
 * @author deling 2017��11��3�� �����⻧
 */
public class ColleagueImpl extends Colleague {

	public ColleagueImpl(HouseMediator mediator, String name) {
		super(mediator);
		this.name = name;
	}

	private String name;

	public void tenantSay() {
		System.out.println("�������" + name + "��׼�����׷���3��һ���ľ���");
	}

}
