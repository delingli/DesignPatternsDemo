/**
 * 
 */
package com.ldl.istrate;

/**
 * @author deling 高级会员 2017年11月28日
 */
public class SeniorMember implements Strategy {

	@Override
	public void operateStrategy(double consumptionAmount) {
		if (consumptionAmount >= 1500) {
			System.out.println("您是高级会员消费" + (consumptionAmount - 200) + "元");
		} else {
			System.out.println("您是高级会员消费" + consumptionAmount + "元");
		}

	}

}
