package com.CoreJava_Constructor;

import java.lang.reflect.Method;

public class ConsClassC {
 String name = "mahathuva";
 
	private static ConsClassA x;
	private static ConsClassB y;
	public ConsClassC() {
		this.x = new ConsClassA();
		this.y = new ConsClassB();
	}
	public void method() {
		x.classAMethod();
		y.classBMethod();
			}
//	static {
//		x = new ConsClassA();
//		y = new ConsClassB();
//	}
//	public void method() {
//x.classAMethod();
//y.classBMethod();
//	}
	
	public static void main(String[] args) {
		ConsClassC c = new ConsClassC();
		c.method();
	}
	
}
