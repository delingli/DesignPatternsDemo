package com.ldl.method;

public class TestRifle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractRifleModel ak47Rifle = new Ak47RifleModel();
		AbstractRifleModel riflefor92 = new RifleFor92Model();
		ak47Rifle.run();
		riflefor92.run();
	}

}
