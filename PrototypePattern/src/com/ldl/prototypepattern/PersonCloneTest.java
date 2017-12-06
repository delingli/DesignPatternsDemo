package com.ldl.prototypepattern;

public class PersonCloneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person("Darling", "22", 1);
		person.setTest(100);
		Person cloneperson = (Person) person.clone();
		cloneperson.setTest(9999);
		cloneperson.setName("ÀÏÅÚ¶ù");
		cloneperson.setAge("99");

		cloneperson.setGender(0);
		System.out.println("²âÊÔÒ»ÏÂ" + person.getTest());
		// System.out.println(person.toString());
		// System.out.println(cloneperson.toString());
	}

}
