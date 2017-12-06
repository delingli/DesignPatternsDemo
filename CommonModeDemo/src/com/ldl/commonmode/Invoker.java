/**
 * 
 */
package com.ldl.commonmode;

/**
 * @author deling 2017��11��6�ն���һ����ͷ�˸��ͻ��Խӽ��տͻ������ִ��
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
