/**
 * 
 */
package com.ldl.commonmode;

/**
 * @author deling 2017年11月6日 定义命令的接收者具体由其子类接收
 */
public abstract class Group {
	// 找到这个组
	public abstract void find();

	// 添加需求
	public abstract void add();

	// 删除需求
	public abstract void delete();

	// 修改需求
	public abstract void change();

	// 给出一个具体修改后的计划
	public abstract void plan();
}
