/**
 * 
 */
package com.ldl.iteratortest;

import java.util.Random;

/**
 * @author deling
 *2017年12月5日
 */
public class IteratorClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StudentInderface studentL=new StrdentImpl();
		studentL.add("张三", "22", "男");
		studentL.add("李四", "23", "女");
		studentL.add("王五", "24", "男");
		Random random=new Random();
		for(int i=0;i<15;++i) {
			
			studentL.add("老炮儿"+(i+1)+"号",random.nextInt(100)+"",random.nextBoolean()?"男":"女");
		}
		StudentIterator studentIterator=studentL.iteratot();
		while(studentIterator.hasNext()) {
			StudentInderface item=	(StudentInderface) studentIterator.next();
	System.out.println(item.getStudentInfo());
		}

	}

}
