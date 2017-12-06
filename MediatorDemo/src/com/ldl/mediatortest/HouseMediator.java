/**
 * 
 */
package com.ldl.mediatortest;

/**
 * @author deling 2017年11月3日 抽象中介
 */
public abstract class HouseMediator {
	protected Landlord landlord;

	protected ColleagueImpl tenant;
	public Landlord getLandlord() {
		return landlord;
	}

	public void setLandlord(Landlord landlord) {
		this.landlord = landlord;
	}

	public ColleagueImpl getTenant() {
		return tenant;
	}

	public void setTenant(ColleagueImpl tenant) {
		this.tenant = tenant;
	}



	public abstract void landlordSay();

	public abstract void houseoffer();

	public abstract void tenantSay();

}
