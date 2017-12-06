/**
 * 
 */
package com.ldl.commonmode;

/**
 * @author deling 2017年11月6日 添加一个需求的命令
 */
public class AddRequirementCommand extends Command {

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		super.productGroup.find();
		super.productGroup.add();
		super.productGroup.plan();
	}

}
