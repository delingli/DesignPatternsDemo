
package com.ldl.commonmode;

/**
 * @author deling 2017��11��6��
 */
public class GloabCommand extends Command {
	private Group gloabGroup;

	public GloabCommand(Group gloabGroup) {
		super();
		this.gloabGroup = gloabGroup;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ldl.commonmode.Command#execute()
	 */
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.gloabGroup.find();
	}

}
