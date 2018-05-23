package interview.yida.overridefield;

/**
 *
 */
public class OverRideField2 {
	
	public static void main(String[] args) {
		Son2 son = new Son2();
		son.print();
		son.printName();
	}
	
}

class Father2 {
	
	String name = "father";
	
	public void print() {
		// why is son
		System.out.println(this);
	}
	
	public void printName() {
		// why is not son's field name value ?
		System.out.println(this.getName());
	}
	
	public String getName() {
		return "father";
	}
	
}


class Son2 extends Father2 {
	
	String name = "son";
	
	@Override
	public String getName() {
		return "son";
	}
}


