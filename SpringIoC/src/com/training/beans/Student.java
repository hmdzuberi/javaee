package com.training.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("stud")
public class Student {

	@Value("Shubham")
	private String studentName;

	public Student() {}

	public String getStudentName() {

		return studentName;
	}

	public void setStudentName(String studentName) {

		this.studentName = studentName;
	}

	@Override
	public String toString() {

		return "Student [studentName=" + studentName + "]";
	}

}
