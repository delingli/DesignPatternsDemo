/**
 * 
 */
package com.ldl.istrate;

/**
 * @author deling 执行策略 2017年11月28日
 */
public class Context {
	private Strategy strategy;

	/**
	 * 执行策略
	 */
	public void executionStrategy(double consumptionAmount) {
		this.strategy.operateStrategy(consumptionAmount);
	}

	public Context(Strategy strategy) {
		super();
		this.strategy = strategy;
	}

}
