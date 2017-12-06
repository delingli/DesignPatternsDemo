/**
 * 
 */
package com.ldl.adaptertest;

/**
 * @author deling
 * 国产插头
 *2017年12月4日
 */
public interface PowerOutletDomestic {
	/**
	 * 获取插座型号
	 * @return
	 */
	public String getDomesticModelNumber();
	/**
	 * 充电
	 */
	public void chargingforDomestic();
}
