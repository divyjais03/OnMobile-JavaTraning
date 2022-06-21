package Inheritance;

interface P{
	void show();
}
interface Q{
	void show();
}


public class Multiple implements P,Q {				// interface implements in class Multiple
public void show() {
	System.out.println("Interface A&B");
}
	
	public static void main(String[] args) {
		Multiple m=new Multiple();					//object creation
		m.show();

	}

}
