package Inheritance;

class X{							// super class
	void input() {
		System.out.println("Enter your name:");
	}
}
class Y extends X{						// sub class1
	void disp() {
		System.out.println("My name is Divyanshu");
	}
}
class Z extends X{						//sub class2
	void show() {
		System.out.println("My name is Ankit");
	}
}

public class Hierarchical {

	public static void main(String[] args) {
		Y y=new Y();					//object of sub class1
		Z z=new Z();					//object of sub class2
		y.input();  y.disp();
		z.input();  z.show();
	}

}
