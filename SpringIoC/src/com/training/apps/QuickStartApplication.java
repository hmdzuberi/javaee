package com.training.apps;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.training.beans.Teacher;

public class QuickStartApplication {

	public static void main(String[] args) {

		// BeanFactory ctx = new ClassPathXmlApplicationContext("context.xml");

		// Invoice inv = ctx.getBean("invBean", Invoice.class);
		// System.out.println(inv);
		// // System.out.println(inv.hashCode());
		// System.out.println(inv.getCustomer());
		// System.out.println(inv.getProductList());
		// System.out.println(inv.getInvoiceAmount());
		//
		// Invoice invoice2 = ctx.getBean("constructorBean", Invoice.class);
		// System.out.println(invoice2);
		// System.out.println(invoice2.hashCode());

		// Invoice invoice3 = ctx.getBean("invBean", Invoice.class);
		// System.out.println(invoice3.hashCode());

		// Teacher teacher = ctx.getBean("teacher", Teacher.class);
		//
		// System.out.println(teacher.getTeacherName());
		// System.out.println(teacher.getStud());

		try {

			ApplicationContext ctx = new AnnotationConfigApplicationContext(AppContext.class);

			Teacher teacher = ctx.getBean(Teacher.class);

			System.out.println(teacher.getTeacherName());
			System.out.println(teacher.getStud());

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
