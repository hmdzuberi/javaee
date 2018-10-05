package com.training.listeners;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class MySessionListener implements HttpSessionListener, HttpSessionAttributeListener {

	public MySessionListener() {

	}

	public void sessionCreated(HttpSessionEvent se) {

		System.out.println("Inside Listener: " + se.getSession().getCreationTime());
		System.out.println("Inside Listener: " + se.getSession().getId());

	}

	public void sessionDestroyed(HttpSessionEvent se) {

		System.out.println("Inside Destroy method: " + se.getSession().getId() + " destroyed");

	}

	@Override
	public void attributeAdded(HttpSessionBindingEvent se) {

		System.out.println("Attribute added in session: " + se.getSession().getId());
	}

	@Override
	public void attributeRemoved(HttpSessionBindingEvent se) {

		System.out.println("Attribute removed in session: " + se.getSession().getId());

		// if (se.getSession().getAttribute("name") == null) {
		// throw new RuntimeException("Should not remove this attribute");
		// }
	}

	@Override
	public void attributeReplaced(HttpSessionBindingEvent se) {

		HttpSessionAttributeListener.super.attributeReplaced(se);
	}

}
