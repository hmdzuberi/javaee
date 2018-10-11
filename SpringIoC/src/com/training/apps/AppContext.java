package com.training.apps;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.training.beans.Student;
import com.training.beans.Teacher;

@Configuration
@ComponentScan(basePackages = "com.training.beans")
public class AppContext {

	@Bean
	public Teacher getTeacher() {

		return new Teacher();
	}

	@Bean
	public Student getStudent() {

		return new Student();
	}

}
