package com.shree.adobeTest.service;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyStringFunctionsTest {

	MyStringFunctions a = new MyStringFunctions();
	
	@Test
	public void test() {
		assertEquals("","");
	}
	
	@Test
	public void test1() {
		assertEquals("Should be hello","a","a");
	}

}
