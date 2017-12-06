package com.ldl.builder;

public class BenciModel extends CarModel {

	@Override
	protected void start() {
		System.out.println("开车发动......");

	}

	@Override
	protected void alarm() {
		// TODO Auto-generated method stub
		System.out.println("开车喇叭响起了......");

	}

	@Override
	protected void stop() {
		// TODO Auto-generated method stub
		System.out.println("汽车熄火停止了......");

	}

	@Override
	protected void engineBoom() {
		// TODO Auto-generated method stub
		System.out.println("汽车引擎响了......");

	}

}
