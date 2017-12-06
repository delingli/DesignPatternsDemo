package com.ldl.method;

/**
 * 造一个92式步枪
 * 
 * @author Administrator
 *
 */
public class RifleFor92Model extends AbstractRifleModel {

	@Override
	protected void start() {
		// TODO Auto-generated method stub
		System.out.println("92式子弹上膛");
	}

	@Override
	protected void play() {
		// TODO Auto-generated method stub
		System.out.println("92式发射......");
	}

	@Override
	protected void alarm() {
		// TODO Auto-generated method stub
		System.out.println("92式发出轰隆一声响......");
	}

	@Override
	protected void stop() {
		// TODO Auto-generated method stub
		System.out.println("92式熄火......");
	}

	@Override
	protected boolean isAlarm() {
		// TODO Auto-generated method stub
		return false;
	}
}
