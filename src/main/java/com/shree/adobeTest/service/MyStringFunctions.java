package com.shree.adobeTest.service;

import org.springframework.stereotype.Service;

@Service
public class MyStringFunctions {

	public String callFunction(String s) {
		return s + "Hello";
	}
}
