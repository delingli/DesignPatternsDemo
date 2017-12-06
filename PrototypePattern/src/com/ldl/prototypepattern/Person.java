package com.ldl.prototypepattern;

import java.util.ArrayList;
import java.util.List;

public class Person implements Cloneable {
	private String name;
	private String age;
	private int gender;
	private ArrayList<Integer> test = new ArrayList<Integer>();

	public Person(String name, String age, int gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		System.out.println("老夫聊发少年狂......");
	}

	public Person() {
		System.out.println("老夫聊发少年狂......");
	}

	public ArrayList<Integer> getTest() {
		return this.test;
	}

	public void setTest(int temp) {
		this.test.add(temp);
	}

	@Override
	public String toString() {
		String outsex = (gender == 1) ? "男" : "女";
		return "Person [name=" + name + ", age=" + age + ", gender=" + outsex + "]";
	}

	@Override
	protected Object clone() {
		Person person = null;
		try {
			person = (Person) super.clone();
			person.test=(ArrayList<Integer>) this.test.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return person;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}
}
