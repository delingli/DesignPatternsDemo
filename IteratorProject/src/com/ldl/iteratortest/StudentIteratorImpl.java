/**
 * 
 */
package com.ldl.iteratortest;

import java.util.ArrayList;
import java.util.List;

/**
 * @author deling 2017年12月6日
 */
public class StudentIteratorImpl implements StudentIterator {

	private List<StudentInderface> studentList = new ArrayList<StudentInderface>();
	private int currentitem = 0;

	public StudentIteratorImpl(List<StudentInderface> studentList) {
		super();
		this.studentList = studentList;
	}

	@Override
	public boolean hasNext() {
		boolean b = true;
		if (currentitem >= studentList.size() || studentList == null || studentList.isEmpty()) {
			b = false;
		}

		return b;
	}

/* (non-Javadoc)
 * @see java.util.Iterator#next()
 */
@Override
public Object next() {
	// TODO Auto-generated method stub
	return this.studentList.get(this.currentitem++);
}
	@Override
	public void remove() {
		if (!this.studentList.isEmpty() && this.studentList.size() > 0) {
			this.studentList.remove(studentList.size() - 1);
		}

	}

}
