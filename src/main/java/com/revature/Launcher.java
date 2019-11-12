package com.revature;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.models.Phone;

public class Launcher {
	public static void main(String[] args) {
		ApplicationContext applicationContext =
				new ClassPathXmlApplicationContext("beans.xml");

	}
}




