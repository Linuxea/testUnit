package interview.yida.overridefield;

public class OverRideField {
	
	public static void main(String[] args) {
		Son son = new Son();
		son.print();
		son.printName();
	}
	
}

class Father {
	
	String name = "father";
	
	public void print() {
		System.out.println(this);
		// why is son
	}
	
	public void printName() {
		// why is not son's field name value ?
		System.out.println(this.name);
	}
	
}


class Son extends Father {
	
	String name = "son";
	
}


