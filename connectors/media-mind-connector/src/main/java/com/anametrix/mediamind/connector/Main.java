package com.anametrix.mediamind.connector;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new ClassPathXmlApplicationContext("classpath:META-INF/media_mind_connector_context.xml");
	}

}
