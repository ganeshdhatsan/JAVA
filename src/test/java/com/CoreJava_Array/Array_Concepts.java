package com.CoreJava_Array;

public class Array_Concepts {

//  Type 1 declaration
	public void language() {
//  DataType    []  Value = new String [size];
//	String      []  name  = new String [4];

//  [0]    [1]       [2]   [3]
//  [java] [phython] [sql] [angularJS]

	String[] unit = new String[3];
//	unit[0] = "Java";
//	unit[1] = "Python";
//	unit[2] = "angular";
//	for (int i = 0; i < unit.length; i++) {
//  System.out.println(unit[i]);
//	}
	
	int a = 20;
    int [] b = {20, 10, 30};
//  System.out.println("1  --> " + b[0]);
//  System.out.println("2  --> " + b[1]);
//  System.out.println("3  --> " + b[2]);

    for (int i=0; i<b.length; i++) {
	System.out.println("1  --> " + b[i]);
    }
	}

//  Type2 declaration
	public void alpha() {
	int[] nova = { 56, 1, 78, 56 };
	for (int i = 0; i < nova.length; i++) {
	System.out.println(nova[i]);
	}
	}

	public static void main(String[] args) {
	Array_Concepts output = new Array_Concepts();
	output.language();
	}
    }
