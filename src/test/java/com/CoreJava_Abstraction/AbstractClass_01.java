package com.CoreJava_Abstraction;

public abstract class AbstractClass_01 {

 int a = 10;
 static int b = 20;
 final int c = 110;

 public void method1() {
 a = 15;
 b = 25;
 System.out.println("AbstractClass_01 method1");
 }

 public void method2() {
 System.out.println("AbstractClass_01 method2");
 }

 abstract void method3();

 final void method4() {
 int a = 2;
 System.out.println("finalmethod4");
 }

 static void method5() {
 System.out.println("staticmethod5");
 }

 public static void main(String[] args) {
//	AbstractClass_01 a = new AbstractClass_01() ;
 }
 }
