package com.ldl.method;

//步枪模板
public abstract class AbstractRifleModel {
	// 能上子弹
	protected abstract void start();

	// 发射
	protected abstract void play();

	// 发出崩绷得一声响
	protected abstract void alarm();

	// 熄火了
	protected abstract void stop();

	// 是否添加消声器
	protected boolean isAlarm() {
		return true;
	}

	/**
	 * 开枪
	 */
	public void run() {
		this.start();
		this.play();
		if (isAlarm()) {
			this.alarm();
		}

		this.stop();
	}
}
