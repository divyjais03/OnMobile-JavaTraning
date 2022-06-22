package Polymorphism;

class A{
	void add() {						// method 1
	int a,b,c;
	a=10; b=20;
	c=a+b;
	System.out.println("The sum is:" +c);
}
	void add(int x,int y) {				//method 2
		int c=x+y;
		System.out.println("The sum is: "+c);
	}
	void add(int x,double y) {			//method 3
		double c=x+y;
		System.out.println("The sum is: "+c);
	}
}

public class Compiletime {

	public static void main(String[] args) {
		A obj=new A();
		obj.add(30, 15);
		obj.add();
		obj.add(15, 4.72);
	}

}
