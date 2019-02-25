package com.example.JavaFileCopier;

import org.apache.camel.Handler;

public class MyBean {

	public String test(String name) {
		String result = "Hello " + name;
		System.out.println(result);
		return result;
	}

	@Handler
	public String test2(String name) {
		System.out.println("Hello2 "+name);
		return "Hello";
	}

}
