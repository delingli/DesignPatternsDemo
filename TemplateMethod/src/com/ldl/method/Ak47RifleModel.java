package com.ldl.method;

/**
 * ��һ��Ak47
 * 
 * @author Administrator
 *
 */
public class Ak47RifleModel extends AbstractRifleModel {

	@Override
	protected void start() {
		System.out.println("Ak47�ӵ�����");

	}

	@Override
	protected void play() {
		System.out.println("Ak47����");

	}

	@Override
	protected void alarm() {
		// TODO Auto-generated method stub
		System.out.println("Ak47������¡һ����......");
	}

	@Override
	protected void stop() {
		// TODO Auto-generated method stub
		System.out.println("Ak47Ϩ��......");
	}

}
