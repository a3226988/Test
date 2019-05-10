package com.demo1;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		/*
		 * Demo1 t = new Demo1() { }; System.out.println(t);
		 */
		/*
		 * Demo1 t = ()->System.out.println(1); t.test();
		 */
		/*
		 * Demo1 t = (x,y)->System.out.println(x+"  "+y); t.login("zs","123");
		 */
		List names = new ArrayList();
	      names.add("Google");
	      names.add("Runoob");
	      names.add("Taobao");
	      names.add("Baidu");
	      names.add("Sina");
	      names.forEach(System.out::println);
	}

}
