/**
 * 
 */
package com.ldl.iteratortest;

import java.util.ArrayList;
import java.util.List;

/**
 * @author deling 2017年12月6日
 */
public class StrdentImpl implements StudentInderface {
	private List<StudentInderface> studentList = new ArrayList<StudentInderface>();
	private String name;
	private String age;
	private String gender;
	public StrdentImpl() {}
	public StrdentImpl(String name, String age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	@Override
	public String getStudentInfo() {

		return this.name + "\t" + this.age + "\t" + this.gender;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ldl.iteratortest.StudentInderface#add()
	 */
	@Override
	public void add(String name, String age, String gender) {
		this.studentList.add(new StrdentImpl(name, age, gender));

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ldl.iteratortest.StudentInderface#iteratot()
	 */
	@Override
	public StudentIterator iteratot() {
		return new StudentIteratorImpl(this.studentList);
	}

}
