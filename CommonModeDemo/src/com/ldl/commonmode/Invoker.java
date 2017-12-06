/**
 * 
 */
package com.ldl.commonmode;

/**
 * @author deling 2017年11月6日定义一个接头人跟客户对接接收客户命令并且执行
 */
public class Invoker {
	private Command command;

	public Command getCommand() {
		return command;
	}

	public void setCommand(Command command) {
		this.command = command;
	}

	public void action() {
		this.command.execute();
	}
}
