package Test;

public class ObjectManager {
public March_B getB() {
		return b;
	}

	public March_C getC() {
		return c;
	}

private March_B b;
private March_C c;

	
	public ObjectManager() {
		initialize();
	}
	 
	public void initialize() {

		
		this.b = new March_B();
		this.c = new March_C();
	}
	
}
