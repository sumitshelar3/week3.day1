package org.student;

import org.department.Department;

          /* Assignment2 - MultiLevel Inheritance*/
public class Student extends Department {

	public void studentName() {
	}

	public void studentDept() {
	}

	public void studentId() {
	}

	public static void main(String[] args) {

		Student s = new Student();
		System.out.println(s.collegeName());
		s.collegeCode();
		s.collegeRank();
		s.deptName();
		s.studentName();
		s.studentId();
		s.studentDept();
	}
}
