package com.ldl.method;

/**
 * 造一个Ak47
 * 
 * @author Administrator
 *
 */
public class Ak47RifleModel extends AbstractRifleModel {

	@Override
	protected void start() {
		System.out.println("Ak47子弹上膛");

	}

	@Override
	protected void play() {
		System.out.println("Ak47发射");

	}

	@Override
	protected void alarm() {
		// TODO Auto-generated method stub
		System.out.println("Ak47发出轰隆一声响......");
	}

	@Override
	protected void stop() {
		// TODO Auto-generated method stub
		System.out.println("Ak47熄火......");
	}

}
