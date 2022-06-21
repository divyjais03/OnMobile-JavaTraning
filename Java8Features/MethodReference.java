package Java8Features;

interface Sayable{
	void say();			// Functional Interface
}

public class MethodReference {

	public static void saySomething() {
		System.out.println("Hello this is static Method");		// static method
	}
	
	public static void main(String[] args) {
		Sayable sayable=MethodReference::saySomething;			//refering static method
		
		sayable.say(); 										//calling interface method
	}
}
