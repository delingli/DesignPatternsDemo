/**
 * 
 */
package com.ldl.commonmode;

/**
 * @author deling 2017��11��6�� ���һ�����������
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
