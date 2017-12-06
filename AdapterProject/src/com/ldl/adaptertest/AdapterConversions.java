/**
 * 
 */
package com.ldl.adaptertest;

/**
 * @author deling 2017年12月4日
 * 适配器
 */
public class AdapterConversions extends PowerOutletDomesticImpl implements PowerOutletHK {
	@Override
	public String getModelNumber() {
		System.out.println("您好我是港版A666号插座");
		return null;
	}

	@Override
	public void charging() {
//		System.out.println("港版A666号插座为您服务");
		chargingforDomestic();
	}
}
