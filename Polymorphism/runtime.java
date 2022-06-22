package Polymorphism;

class shape{
	void draw() {
		System.out.println("Can't say shape type");
	}
}
class square extends shape {
	@Override 										// function overriding
	void draw() {
		super.draw();									// super keyword for calling super class
		System.out.println("This is square shape");
	}
}

public class runtime {

	public static void main(String[] args) {
		shape r=new square();   		// ref. of super class & obj of subclass
		r.draw();
	}

}
