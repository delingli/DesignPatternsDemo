/**
 * 
 */
package com.ldl.commonmode;

/**
 * @author deling 2017年11月6日
 */
public class CommonModeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 定义一个接头人
		Invoker invoker = new Invoker();
		Command addCommand = new AddRequirementCommand();
		Command changeCommand = new ChangeCommand();
		invoker.setCommand(addCommand);
		invoker.action();
		invoker.setCommand(changeCommand);
		invoker.action();
		Command gloabCommand=new GloabCommand(new CodeGroup());
		invoker.setCommand(gloabCommand);
		invoker.action();
	}

}
