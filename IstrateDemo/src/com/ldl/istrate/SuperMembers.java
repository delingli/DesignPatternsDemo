/**
 * 
 */
package com.ldl.istrate;

/**
 * 超级会员
 * 
 * @author deling 2017年11月28日
 */
public class SuperMembers implements Strategy {

	/* (non-Javadoc)
	 * @see com.ldl.istrate.Strategy#operateStrategy(double)
	 */
	@Override
	public void operateStrategy(double consumptionAmount) {
		if(consumptionAmount-400<=0) {
			System.out.println("您是超级会员消费"+0+"元");
		}else {
			System.out.println("您是超级会员消费"+(consumptionAmount-400)+"元");
		}
				
	}



}
