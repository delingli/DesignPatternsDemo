/**
 * 
 */
package com.ldl.mediatortest;

/**
 * @author deling 2017年11月3日
 */
public class MediatorTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 定义一个中介
		HouseMediator houseMediator = new HouseMediatorInfo();
		Landlord landlord = new Landlord(houseMediator, "二房东");
		ColleagueImpl tenant = new ColleagueImpl(houseMediator, "darling");
		// 中介绑定两个客户
		houseMediator.setLandlord(landlord);
		houseMediator.setTenant(tenant);
		landlord.say();
		tenant.tenantSay();
		landlord.houseoffer();

	}

}
