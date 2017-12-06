/**
 * 
 */
package com.ldl.mediatortest;

/**
 * @author deling 2017��11��3��
 */
public class MediatorTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// ����һ���н�
		HouseMediator houseMediator = new HouseMediatorInfo();
		Landlord landlord = new Landlord(houseMediator, "������");
		ColleagueImpl tenant = new ColleagueImpl(houseMediator, "darling");
		// �н�������ͻ�
		houseMediator.setLandlord(landlord);
		houseMediator.setTenant(tenant);
		landlord.say();
		tenant.tenantSay();
		landlord.houseoffer();

	}

}
