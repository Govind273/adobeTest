package com.shree.adobeTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.shree.adobeTest.service.MyStringFunctions;

@SpringBootApplication
public class AdobeTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdobeTestApplication.class, args);
		
		MyStringFunctions a = new MyStringFunctions();
		String m = a.callFunction("Govind");
		System.out.println(m);
	}

}
