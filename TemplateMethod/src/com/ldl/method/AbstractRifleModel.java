package com.ldl.method;

//��ǹģ��
public abstract class AbstractRifleModel {
	// �����ӵ�
	protected abstract void start();

	// ����
	protected abstract void play();

	// ����������һ����
	protected abstract void alarm();

	// Ϩ����
	protected abstract void stop();

	// �Ƿ����������
	protected boolean isAlarm() {
		return true;
	}

	/**
	 * ��ǹ
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
