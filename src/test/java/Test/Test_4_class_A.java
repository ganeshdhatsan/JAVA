package Test;

public class Test_4_class_A extends Test_5_Class_B {
	private ObjectManager om;
	public Test_4_class_A() {
		this.om = new ObjectManager();
	}
	
	public void method1() {
    String name1 = "apple";
    System.out.println (name1);
    om.getB().method();
	}

    public static void main (String [] args) {
// type 1:
  Test_4_class_A ref	= new Test_4_class_A ();
  ref.method1();
  ref.method2();
    	
// type 2:
    Test_5_Class_B a = new Test_5_Class_B () ;
    a.method2 ();
    
// type 3:
    Test_5_Class_B b =  new Test_4_class_A ();
    a.method2 ();
       }
// type 4: not possible bcz Constructor must be as current class for diff class
//  Test_4_class_A ref c = new Test_5_Class_B (); 
 
    }
