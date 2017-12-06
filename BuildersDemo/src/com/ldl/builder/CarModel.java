package com.ldl.builder;

import java.util.ArrayList;
import java.util.List;

public abstract class CarModel {
	private List<String> sequence = new ArrayList<String>();
	// ����
	protected abstract void start();

	// ��������
	protected abstract void alarm();

	// ͣ��
	protected abstract void stop();

	// ��������
	protected abstract void engineBoom();

	final public void run() {
		for (String action : sequence) {
			if (action.equalsIgnoreCase("start")) {
				this.start();

			} else if (action.equalsIgnoreCase("stop")) {

				this.stop();
			} else if (action.equalsIgnoreCase("alarm")) {
				this.alarm();

			} else if (action.equalsIgnoreCase("engineBoom")) {
				this.engineBoom();
			}
		}

	}

	public void setSequence(List<String> sequence) {
		this.sequence = sequence;
	}
}
