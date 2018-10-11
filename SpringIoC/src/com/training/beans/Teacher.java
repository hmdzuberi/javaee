package com.training.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class Teacher {

	@Value("Jagadish")
	private String teacherName;

	@Autowired
	@Qualifier("stud")
	private Student stud;

	public Teacher() {}

	public String getTeacherName() {

		return teacherName;
	}

	public void setTeacherName(String teacherName) {

		this.teacherName = teacherName;
	}

	public Student getStud() {

		return stud;
	}

	public void setStud(Student stud) {

		this.stud = stud;
	}

	@Override
	public String toString() {

		return "Teacher [teacherName=" + teacherName + ", stud=" + stud + "]";
	}

}
