/**
 * 
 */
package com.ldl.commonmode;

/**
 * @author deling 2017年11月6日
 */
public class UiGroup extends Group {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ldl.commonmode.Group#find()
	 */
	@Override
	public void find() {
		System.out.println("找到Ui组");

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ldl.commonmode.Group#add()
	 */
	@Override
	public void add() {
		System.out.println("让Ui组删除一个界面");

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ldl.commonmode.Group#delete()
	 */
	@Override
	public void delete() {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ldl.commonmode.Group#change()
	 */
	@Override
	public void change() {
		// TODO Auto-generated method stub
		System.out.println("让Ui组修改一个界面");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ldl.commonmode.Group#plan()
	 */
	@Override
	public void plan() {
		// TODO Auto-generated method stub
		System.out.println("让Ui返回给一个具体修改后的计划");

	}

}
