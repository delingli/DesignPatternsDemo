/**
 * 
 */
package com.ldl.adaptertest;

/**
 * @author deling
 *2017年12月4日
 */
public class PowerOutletDomesticImpl implements PowerOutletDomestic {

	/* (non-Javadoc)
	 * @see com.ldl.adaptertest.PowerOutletDomestic#getDomesticModelNumber()
	 */
	@Override
	public String getDomesticModelNumber() {
	System.out.println("您好我是大陆产A863号插座......");
		return null;
	}

	/* (non-Javadoc)
	 * @see com.ldl.adaptertest.PowerOutletDomestic#chargingforDomestic()
	 */
	@Override
	public void chargingforDomestic() {
		System.out.println("国产A863三孔插头为您服务......");
		
	}



}
