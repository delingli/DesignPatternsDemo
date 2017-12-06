/**
 * 
 */
package com.ldl.commonmode;

/**
 * @author deling 2017年11月6日
 */
class Products extends Group {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ldl.commonmode.Group#find()
	 */
	@Override
	public void find() {
		System.out.println("找到Products组");

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ldl.commonmode.Group#add()
	 */
	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("让Products组添加一个需求");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ldl.commonmode.Group#delete()
	 */
	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("让Products组删除一个需求");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ldl.commonmode.Group#change()
	 */
	@Override
	public void change() {
		// TODO Auto-generated method stub
		System.out.println("让Products组修改一个需求");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ldl.commonmode.Group#plan()
	 */
	@Override
	public void plan() {
		// TODO Auto-generated method stub
		System.out.println("让Products组返回一个改变后的计划书");
	}

}
