package com.ldl.simgletest;

public class CommonSingleton {
	private volatile static CommonSingleton mInstance;

	public static CommonSingleton getInstance() {
		if (mInstance == null) {
			synchronized (CommonSingleton.class) {

				if (mInstance == null) {
					mInstance = new CommonSingleton();
				}
			}
		}
		return mInstance;
	}

	private CommonSingleton() {

	}

	public static void sayHello() {
		System.out.println("Hello Œ“ «ª µ€Œ“∂¿◊");
	}

	public static void main(String[] args) {
		for(int i=0;i<5;++i) {
			CommonSingleton.getInstance().sayHello();
		}

	}

}
