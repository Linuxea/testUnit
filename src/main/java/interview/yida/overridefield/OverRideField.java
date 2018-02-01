package interview.yida.overridefield;

public class OverRideField {

	public static void main(String[] args) {
		Son son = new Son();
		son.print();
	}

}

class Father {
	String name = "father";

	public void print() {
		System.out.println(this); // why is son
		System.out.println(this.name);  // why is not son's field name value ?
	}

}


class Son extends Father {

	String name = "son";
}


