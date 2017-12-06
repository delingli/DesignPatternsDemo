/**
 * 
 */
package com.ldl.adaptertest;

/**
 * @author deling 2017年12月4日
 */
public interface PowerOutletHK {
	/**
	 * 获取插座型号
	 * 
	 * @return
	 */
	public String getModelNumber();

	/**
	 * 充电
	 */
	public void charging();
}
