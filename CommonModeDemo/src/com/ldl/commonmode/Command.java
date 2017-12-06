/**
 * 
 */
package com.ldl.commonmode;

/**
 * @author deling 2017��11��6�� ͬ�ⶨ��һ�·��������
 */
public abstract class Command {
	protected CodeGroup codeGroup = new CodeGroup();
	protected Products productGroup = new Products();
	protected UiGroup uiGroup = new UiGroup();

	public abstract void execute();
}
