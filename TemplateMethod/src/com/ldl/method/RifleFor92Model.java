package com.ldl.method;

/**
 * ��һ��92ʽ��ǹ
 * 
 * @author Administrator
 *
 */
public class RifleFor92Model extends AbstractRifleModel {

	@Override
	protected void start() {
		// TODO Auto-generated method stub
		System.out.println("92ʽ�ӵ�����");
	}

	@Override
	protected void play() {
		// TODO Auto-generated method stub
		System.out.println("92ʽ����......");
	}

	@Override
	protected void alarm() {
		// TODO Auto-generated method stub
		System.out.println("92ʽ������¡һ����......");
	}

	@Override
	protected void stop() {
		// TODO Auto-generated method stub
		System.out.println("92ʽϨ��......");
	}

	@Override
	protected boolean isAlarm() {
		// TODO Auto-generated method stub
		return false;
	}
}
