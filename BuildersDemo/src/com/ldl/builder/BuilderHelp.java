package com.ldl.builder;

import java.util.ArrayList;
import java.util.List;

public class BuilderHelp {
	private List<String> squeen = new ArrayList<String>();
	private BaoMaBulder baomabuilder = new BaoMaBulder();
	private BenziBulder bencibuilder = new BenziBulder();

	public BaoMaModel getBaoMaModel() {
		squeen.clear();
		squeen.add("start");
		squeen.add("engineBoom");
		squeen.add("alarm");
		squeen.add("stop");
		baomabuilder.setSqueen(squeen);
		return (BaoMaModel) baomabuilder.getCarModel();
	}

	public BenciModel getBenciModel() {
		squeen.clear();
		squeen.add("start");
		squeen.add("alarm");
		squeen.add("engineBoom");
		squeen.add("stop");
		bencibuilder.setSqueen(squeen);
		return (BenciModel) bencibuilder.getCarModel();
	}
}
