package com.ldl.builder;

import java.util.List;

/**
 * 奔驰车建造者
 * 
 * @author Administrator
 *
 */
public class BenziBulder extends CarBuilder {
	private BenciModel bencimodel = new BenciModel();

	@Override
	public void setSqueen(List<String> aqueen) {
		// TODO Auto-generated method stub
		this.bencimodel.setSequence(aqueen);

	}

	@Override
	public CarModel getCarModel() {
		// TODO Auto-generated method stub
		return this.bencimodel;
	}

}
