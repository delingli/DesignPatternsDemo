package com.ldl.builder;

public class BaoMaModel extends CarModel {

	@Override
	protected void start() {
		System.out.println("宝马开车发动......");

	}

	@Override
	protected void alarm() {
		// TODO Auto-generated method stub
		System.out.println("宝马开车喇叭响起了......");

	}

	@Override
	protected void stop() {
		// TODO Auto-generated method stub
		System.out.println("宝马汽车熄火停止了......");

	}

	@Override
	protected void engineBoom() {
		// TODO Auto-generated method stub
		System.out.println("宝马汽车引擎响了......");

	}

}
