/**
 * 
 */
package com.ldl.commonmode;

/**
 * @author deling 2017年11月6日 同意定义一下发布的命令；
 */
public abstract class Command {
	protected CodeGroup codeGroup = new CodeGroup();
	protected Products productGroup = new Products();
	protected UiGroup uiGroup = new UiGroup();

	public abstract void execute();
}
