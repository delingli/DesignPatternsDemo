/**
 * 
 */
package com.ldl.istrate;

/**
 * @author deling
 * 钻石会员
 *2017年11月28日
 */
public class DiamondMembership implements Strategy {

	/* (non-Javadoc)
	 * @see com.ldl.istrate.Strategy#operateStrategy(double)
	 */
	@Override
	public void operateStrategy(double consumptionAmount) {
		if(consumptionAmount>=1000) {
			System.out.println("我是钻石会员消费"+(consumptionAmount-200)+"元");
		}else {
			System.out.println("我是钻石会员消费"+consumptionAmount+"元");
		}
		
	}



}
