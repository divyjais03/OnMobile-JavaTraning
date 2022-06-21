package Inheritance;

class A{				//super class
	int a,b,c;
	void add() {
		a=10; b=20;
		c=a+b;
		System.out.println("The sum of numbers is: "+c);
	}
	void sub() {
		a=40; b=20;
		c=a-b;
		System.out.println("The subtraction of numbers is: "+c);
	}
}

class B extends A{					// sub classs 1
	void mul() {
		a=5; b=8;
		c=a*b;
		System.out.println("The multiplication of numbers is: "+c);
	}
	void div() {
		a=36; b=6;
		c=a/b;
		System.out.println("The division of numbers is: "+c);
	}
	
}
class C extends B{					// sub class 2
	void rem() {
		a=25; b=3;
		c=a%b;
		System.out.println("The remainder of two numbers is: "+c);
	}
}

public class Multilevel {

	public static void main(String[] args) {
		
		C obj=new C();				// object of sub class 2
		obj.add();					//superclass function
		obj.sub();					//superclass function
		obj.mul();					//sub class1 function
		obj.div();					//sub class1 function
		obj.rem();					//sub class2 function
	}

}
