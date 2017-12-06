/**
 * 
 */
package com.ldl.mediatortest;

/**
 * @author deling 2017Äê11ÔÂ3ÈÕ
 */
public class HouseMediatorInfo extends HouseMediator {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ldl.mediatortest.HouseMediator#landlordSay()
	 */
	@Override
	public void landlordSay() {
		super.landlord.say();

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ldl.mediatortest.HouseMediator#houseoffer()
	 */
	@Override
	public void houseoffer() {
		// TODO Auto-generated method stub
		super.landlord.houseoffer();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ldl.mediatortest.HouseMediator#tenantSay()
	 */
	@Override
	public void tenantSay() {
		// TODO Auto-generated method stub
		super.tenant.tenantSay();

	}

}
