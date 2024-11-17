package com.CoreJava_Constructor;

public class ObjectClass {

	private ConsClassA a;
	private ConsClassB b;
	private ConsClassC c;
	
	public ConsClassA getA() {
	return a;
	}

	public ConsClassB getB() {
	return b;
	}

	public ConsClassC getC() {
	return c;
	}

	public ObjectClass() {
	this.a = new ConsClassA();
	this.b = new ConsClassB();
	this.c = new ConsClassC();
	}
	}
