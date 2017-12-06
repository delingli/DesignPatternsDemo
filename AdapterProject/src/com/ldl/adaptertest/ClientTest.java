/**
 * 
 */
package com.ldl.adaptertest;

/**
 * @author deling
 *2017年12月4日
 */
public class ClientTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PowerOutletHK adapter=new AdapterConversions();
		adapter.getModelNumber();
		adapter.charging();
	}

}
