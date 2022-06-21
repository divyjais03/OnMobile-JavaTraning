package DAY1;


class A{
	int a=20;
	void show() {
		System.out.println("Hello class A");
	}
}
class B extends A{
	int a=15;
	void show() {
		System.out.println(a);
		System.out.println(super.a);
		super.show();
		System.out.println("Hey class B");
	}
}

public class Super_keyword {
     public static void main(String[] args) {
		B r=new B();
		r.show();
		
		
		
	}
}
