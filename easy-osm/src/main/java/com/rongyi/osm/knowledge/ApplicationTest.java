package com.rongyi.osm.knowledge;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rongyi.osm.listener.WorkThreadLoadListener;

public class ApplicationTest {

	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("spring/applicationContext*.xml");

		@SuppressWarnings("unused")
		WorkThreadLoadListener listener = context.getBean(WorkThreadLoadListener.class);

		while (true) {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
