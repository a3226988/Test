package com.demo1;

public interface Demo1 {

	default void test() {
		System.out.println("hello!");
	}
	
	/* void test1(); */
	void login(String name,String pwd);
}
