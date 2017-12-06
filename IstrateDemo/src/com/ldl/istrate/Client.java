/**
 * 
 */
package com.ldl.istrate;

/**
 * @author deling
 *2017年11月28日
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Strategy strategy=new DiamondMembership();
		Context context=new Context(strategy);
		context.executionStrategy(800);
		strategy=	new SuperMembers();
		context=new Context(strategy);
		context.executionStrategy(300);
		strategy=new SeniorMember();
		context=new Context(strategy);
		context.executionStrategy(300);
	}

}
