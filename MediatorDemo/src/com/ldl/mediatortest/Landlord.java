/**
 * 
 */
package com.ldl.mediatortest;

/**
 * @author deling 2017��11��3��
 */
// ����һ��������
public class Landlord extends Colleague {

	private String name;

	public Landlord(HouseMediator mediator, String name) {
		super(mediator);
		this.name = name;
	}

	public void say() {
		System.out.println("����ҽ�" + name + "������һ������һ������");
	}

	public void houseoffer() {
		System.out.println("�ұ���3000Ѻһ��һ");
	}
}
