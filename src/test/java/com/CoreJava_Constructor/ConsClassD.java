package com.CoreJava_Constructor;

public class ConsClassD {

	private ObjectClass o;
	public ConsClassD() {
    this.o = new ObjectClass();
	}
	private void meth() {
    o.getA().classAMethod();
    o.getB().classBMethod(); 
	}
    }
