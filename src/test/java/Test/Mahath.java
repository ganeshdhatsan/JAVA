package Test;

import com.CoreJava_DataTypes.WrapperClassConcept;

public class Mahath {
// Class signature: AM AS keyword name  { }
// method signature: AM AS RT name () {}	// return type
//                   AM AS void name () { } // without return type
// object signature: classname ref = new classname ();
//	                 ref.name();
	                 
// 1. Access Modifier & Specifier
// 1.1 Access Modifier:	
//	public - we can use this for the entire project
// 	syntax: public class name1 { }

//	default - we can use this within the package
//  syntax: class name2 { }

//	protected - we can use outside the package with conditions (we will see in inheritance)
//  syntax: protected class name3 { }

//	private - we can use with in a class
//  syntax: private class name4 { }
	
// multiple modifiers are not possible in main class//
// multiple modifiers are not possible in method//

// 1.2 Access Specifier:
// default - we can use in both the class & method level
// class // syntax : public class shop {}
// method // syntax (with out return type): public void method1 () {}
// method // syntax (with return type): public int method1 () {
//	                                    int a = 10;
//	                                    return a;
//	                                     }
// (return should always be in the last line of code)
	
// abstract - we can use in both the class & method level (will see detailly in further class)
// purpose of abstract in method: doesn't have any logic
// Ex: public abstract void method2 ();
// class  // syntax : public abstract class Name {}
// method // syntax (with out return type): public abstract void method2 ();
// Abstract method dont have any logic, so we never create a return type. 
// we cant declare abstract for variable
	
// static - we can use only in a method level
// purpose of static: 
// 1.whenever a necessity to call a method without using an object, then we can go with static
// 2.static method will be store in stack memory (stack memory la irundha no need to create an object.)
// 3.No need to create an object to call a static method

// class  // syntax : we cannot use "static" for class 
// method // syntax (with out return type): public static void method3 () {}
// method // syntax (with return type): public static int method3 () {
//                                      int a = 10;
//                                      return a;
//                                      }
// (return should always be in the last line of code)	
 	
// final - we can use in a class & method level
// purpose of final: 
// 1. if we declare a class as "final", we cannot inherit 
// 2. if we declare a variable as "final", we cannot modify in other class (but we can use)
// 3. if we declare a method as "final", we cannot override
// (we cannot ovverride the final method, but we can use inside the method)
// class  // syntax : public final class shop {}	
// method // syntax (with out return type): public final void method4 () {}
// method // syntax (with return type): public final int method4 () {
//                                      int a = 10;
//	                                    return a;
//	                                    }
	
// multiple specifiers are not possible in main class//
// multiple specifiers are possible in method level but see the below://
// abstract - Static  - No
// abstract - final   - No
// final - static     - Yes // public final static void method2 () {}

// 2. Data Type (types of data types and how to declare & Wrapper class)
// Data types:
// byte 
// short
// int = 456523;
// float = 0.0f;
// double = 0.00;
// long = 15421212l;
// char = 'a';
// String = "apple";
// boolean	= false;
	 
// Wrapper Class: 
// we can manipulate from one data type in to another data type

// int = Integer // wrapper class
// convert any data type to String:
// convert int to String
// int to String = Integer.toString ();	

// char = Character // wrapper class
// convert char to String	
// char to String = Character.toString ();

// float = Float // wrapper class
// convert float to String		
// float to String = Float.toString ();

// long = Long // wrapper class
// convert long to String
// long to String = Long.toString ();

// double = Double // wrapper class
// convert double to String
// double to String = Double.toString();

// boolean = Boolean  // wrapper class
// convert boolean to String
// boolean to String = Boolean.toString(false);	

// String = String // wrapper class
// String to any data type:
// convert String to int
// String to int = Integer.parseInt("1254045");
// convert String to double
// String to double = Double.parseDouble("0.54546");
// convert String to long
// String to long = Long.parseLong("1254045");
// convert String to float
// String to float = Float.parseFloat("0.54546")
// convert String to boolean
// String to boolean = Boolean.parseBoolean("True");
	
// 3. Variable
// Types of variables: 1.Instance variable; 2.static variable; 3.local variable	

// 1.Instance variable:
// i)class level declaration
// ii)scope of the variable for the entire class
// iii)limitation of instance variable based on the object
// iv)only using object reference we can call instance variable or method
// Ex:
// public class InstanceVariable {
// String name ="mahathuva";
// int a ;
// }
	
// 2.static variable:
// i)can be declare in class level using static keyword
// ii)scope of the static variable for the entire class
// iii)limitation not based on the object. based on the class
// iv)whenever a necessity to call a method or variable without using object,we can go with static
// v)static method/variable will be store in stack memory
// vi)no need to create an object to call a static method and static variable 
// vii)by directly or using class name or using object reference we can call  static variable and method
// Ex:
// public class StaticVariable {
// static int a;	
// }

// 3.local variable
// i)can be declare only in the method
// ii)scope of the local variable is applicable only for the specific method
// iii)we can call using obj ref or if it is a static we can call using class name
// iv)class variable and method variable, 1st preference method variable	
// Ex:
// public class LocalVariable  {
// private void method1() {
// int a = 10;
// int b= 20;
// int c = a+b;
// System.out.println("c --> "+c);
// }
// }

// 4. Control Statements: (for, for each, while & do while)
// 1. For: (we know the exact size)
// print 1-50
// public void method1 () {
// for (int i=1; i<=50; i++) {
// System.out.println(i);
// }
// }
	
// 2. For each: (without knowing the size we are fetching only the existing data)
// declare an array and fetch the 4 names
// public void method2 () { 
// String [] names = {"Java", "Python", "Selenium", "array"};
// for (String single : names) {
// System.out.println(single);
// }

// 3. while: (unlimited iteration with condition)
// print upto 100 by descending order  
// int count = 100;
// while (count <= 100) {
// System.out.println(count);
// count --;
// }
	
// 4. do while: first implementation, then only check the condition (unlimited iteration with condition )	
// public void method4 ( ) {
//	int count = 0;
//	do {
//	System.out.println("Mahathuva");
//	count ++;
//	}
//	while (count < 10) ;
//	}	
 
// 5. Conditional Statements: (if, else if & else)
// if kulla dhan condition irukanum
// else kulla condition iruka koodadhu, implementation mattum dhan irukanum. 
// 6. Array
// doubt - diff btw type1 & type2
// 7. String
// 8. Array
// 9. Inheritance:
// inheritance: 

// If we are using inheritance, we don't need to create an object 
// for the another class, so we can save the memory. 
// This is the purpose for inheritance. 

// access one class property into another class
// can be achieve using extends and implements keyword

// class to class - extends
// class extends class
// interface to interface - extends
// interface extends interface
// interface to interface1, interface2
// interface extends interface1, interface2
// class to interface - implements
// class implements interface
// interface to class - not possible (x) bcz interface never 
// extends/implements any class
// class extends class implements interface1, interface2, interface3

// ore package la iruka class oda property a access panrathuku 
// import no needed. But Different package la iruka class oda property 
// a access panrathuku import venum. 

// without doing inheritance we can call another class property. 
// we can create an object for that class in the current class, then we 
// can call the method/ access the property of the another class.

	
// 1. single Inheritance = 1 to 1
// 2. Multilevel Inheritance = tree level - one by one inheritance
// 3. Hierarchy Inheritance = 1 property inherit with multiple child property
// 4. Multiple Inheritance = more than 1 property inherit with 1 property at a time (not support for class. only support for interface)
// 5. Hybrid Inheritance = Single+Multiple Inheritance (not support for class)

// 1. Single Inheritance:
// 
	
//	oru class oda oru interface a implement pannumbodhu, andha interface la iruka 
//	unimplemented method, andha class la override aagum. 

// andha override aana method ku, implementation kuduthu use panrom. 

//	4 objects epdi create pannanum
//	4 implementation (extends/implemets)

// Abstraction:
// 2 types of Abstraction:
// i) Abstract Class
// ii) Interface

// Abstract Class: (partial abstraction)
// 1. may contain or may not contain abstract method or non abstract method
// possibilities: 
// having fully defined method (non abstract method)
// having partial defined method (abstract & non-abstract method)
// having fully undefined method (abstract method)
// 2. We never create an object for abstract class, but we can create main method 
// (we cannot initialize constructor for abstract class)
// (If class contain any one of undefined method (without implementation) Java class never allow to create an object)
// (for execution for the un/defined method we have to inherit with normal class 
//	& create an object for current class and using object ref we can call both the class method)
//  A class contains any one of abstract method, that should be declare as an abstract class
//	Abstract method & Abstract class should contain "abstract" keyword
//	The methods in abstract class should be in "public"
//	all abstract methods by default it is public
//	all un-implemented methods always be a abstract method
// 	abstract class or any class supports only static, non-static & final variable. 
//	we can't declare a variable as abstract
	
//	while we inherit the abstract class, the normal method can not override.
//	bcz normal method is implemented method. So while inherit, java can override only
//	unimplemented methods only. 
//	
//	final & static method can't be override, but we can call inside the method
//	bcz the scope of final method & static method within the class
//  
//	if a method having static & final in superclass, we can't create a same method in subclass.
//	but we can create a normal method in the same name in both the subclass & superclass
//	
//	in abstract class support static, final, normal & abstract method.
//	But in interface supports only abstract & static methods.
//	
//	in abstract class supports all variables (static, instance & final)
//	in interface supports all variable (static, instance & final)
	
//	in both abstract class & interface we can create a main method, but
//	we can't create an object. 
//	
//	

//	Polymorphism:oru method a different form create panrom

//Compile time polymorphism - Overloading - before execution have to confirm that which method going to execute by passing he values in the args.
//Run time polymorphism - Overriding
	
//	Method Overloading:
//	1. without changing the method name by changing argument in methods.
//	i) using different data types
//  ii)modifying data type order
//	iii)modifying data type count by increasing/decreasing
//Note: the datatype must not be the same 
//	Ex: 
//public void m1 (int a, int b) { } // possible
//public void m1 (int b, int a) {} // not possible 

//	public void m1 (int a, String b) {} // possible
//	public void m1 (String b, int a) {} // possible

//	all methods can be overloaded. (non-static, static, final, abstract, main, constructor)
//	whereas all methods can not be override. we can override only non-static & abstract methods.
//	we can not override final, static, constructor & main method. 

//purpose: override
//1. we are not satisfying with implementation of superclass, without changing 
//	 the method signature, we are modifying the implementation in sub class. 
//2. without creating new method in a subclass. we have to use the same method 
//	 of superclass.

//	Constructor
	/*
	 * block,static block 
	 * method , static method 
	 * constructor, parameterized constructor
	 */
	/*
//Constructor is just like a method but not a method. its a special method
//Rule 1 : Constructor name and Class name must be same 
//Rule 2 : Constructor doesn't have any return type because constructor never return anything
//Note: no need to initialize or call constructors, once object created 
//constructors will be invoked(Automatically call) implicitly. 
//if a class doesn't have a constructor, a default constructor has taken place implicitly
//If a implementation inside the method in the sense we have to create an object
//using ref, have to call the method. then only implementation will be executed 
//whereas If a implementation inside the constructor in the sense,
//No need to call the constructor for execution, once object created constructor 
//will be called automatically
//no need to provide any access specifier,modifier, void or any return type
	 
//	Types of Constructor
	/*1.default constructor
	  2.parameterized constructor
	*/
		
//	Constructor can be overloaded, but can not be override. 
//	bcz a constructor must be in the name of class name, so each class having unique constructor.

//	constructor can be call inside the constructor.
//	but constructor cannot be called inside the method.
//	whether in the same class or another class. 
//	a method can be call inside the constructor and inside the method. 
//	whether it is the same class or another class.
//	we cannot call the constructor in the main method of another class. 
	
	
	
// constructor can be call inside the constructor only, 
// can not be call inside the method in the same/another class.
// we can not be call the constructor to another class using extends for method/main method.
// method/variable can be call inside the method & constructor.
//	while using "this/super" keyword for constructor, this/super must be the 1st statement.

// Block / Static Block / Static Method / Constructor
// static block - without creating object. only creating a main method, static block will execute.
//	no need to create an object.
	
//	once object created, 1st static block will execute, then block will execute.
//	as per the order, constructor/static method may execute.

//	only by using object ref other methods will execute. 

// Singleton:
//	we are using this concept to avoid multiple creation of object, so that we can save the memory.
//	Rule1 : declare a static private variable
//	Rule2 : declare a private constructor
//	Rule3 : create a static method and put if condition in it and then create an object for it.
//	Ex: public class WrapperClassConcept {
//	private static WrapperClassConcept wc;
//	private WrapperClassConcept() {
//		
//	}
//	public static WrapperClassConcept getInstance() {
//		if (wc==null) {
//			wc = new WrapperClassConcept();
//		}
//	return wc;
//	}
// now we call this class method into another class method
// Ex:	WrapperClassConcept.getInstance().wrapperTest();



































}

