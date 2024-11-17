package Test;

public class March26 {
	public void method1 () {
	int [] value = {1,2,3,4,5,6,7,8,9,10};
//	for (int i=0; i<value.length; i++) {
//		System.out.println(value[i]);
//	}
//	for (int single:value) {
//	System.out.println(single);
//	}
//	for (int i=1; i<=10; i++) {
//		if (i==5) {
//				
//		break;
//		}
//		System.out.println(i);
//	}
	for (int i=1; i<=10; i++) {
		if (i==5) {
				
		continue;
		}
		System.out.println(i);
	}	
	}

	
	public static void main (String [] args) {
		March26 ref = new March26();
		ref.method1();
	}

}
