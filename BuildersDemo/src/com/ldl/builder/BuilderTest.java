package com.ldl.builder;

import java.util.ArrayList;
import java.util.List;

public class BuilderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// CarModel benciModel = new BenciModel();
		// List<String> squee = new ArrayList<String>();
		// squee.add("start");
		// squee.add("engineBoom");
		// squee.add("alarm");
		// squee.add("stop");
		// benciModel.setSequence(squee);
		// benciModel.run();
		BuilderHelp builders = new BuilderHelp();
		builders.getBaoMaModel().run();
		builders.getBenciModel().run();
	}

}
