package com.ldl.builder;

import java.util.List;

/**
 * ���۳�������
 * 
 * @author Administrator
 *
 */
public class BaoMaBulder extends CarBuilder {
	private BaoMaModel baomamodel = new BaoMaModel();

	@Override
	public void setSqueen(List<String> aqueen) {
		// TODO Auto-generated method stub
		this.baomamodel.setSequence(aqueen);

	}

	@Override
	public CarModel getCarModel() {
		// TODO Auto-generated method stub
		return baomamodel;
	}

}
