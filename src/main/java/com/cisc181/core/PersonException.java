package com.cisc181.core;
import java.lang.Exception;

public class PersonException extends Exception {
	
	int age;
	
	public PersonException(int age) {
		this.age = age;
	}
	

	public PersonException() {
		System.out.println("Are you sure that you're over 100 years old?");
	}


	public int setPersonException() {
		return age;
	}
	

	
}
