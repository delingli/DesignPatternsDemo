/**
 * 
 */
package com.ldl.commonmode;

/**
 * @author deling 2017年11月6日 修改一个需求的命令
 */
public class ChangeCommand extends Command {

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		super.productGroup.find();
		super.productGroup.change();
		super.productGroup.plan();
	}

}
