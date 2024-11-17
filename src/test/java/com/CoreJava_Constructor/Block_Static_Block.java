package com.CoreJava_Constructor;

public class Block_Static_Block {
	//static block
//	block
	//constructor
	//static method
	// normal
	
	
//	block
	{
		int a =10;
		int b =15;
		int c =a+b;
		System.out.println("block -- c "+c);
	}
	
//static block1
	static {
		int a =10;
		int b =15;
		int c =a+b;
		System.out.println("static block1 -- c "+c);
	}
// static block2
	static {
		String a = "brand";
		System.out.println("static block2 -- a "+a);
	}
	
//static method
	private static void staticMethod() {
		int a =10;
		int b =15;
		int c =a+b;
		System.out.println("static Method -- c "+c);
	}
	public Block_Static_Block() {
		int a =10;
		int b =15;
		int c =a+b;
		System.out.println("Constructor -- c "+c);
	}
	public static void main(String[] args) {
		
//		Block_Static_Block b = new Block_Static_Block();	
//		staticMethod();
		
	}
	
}
