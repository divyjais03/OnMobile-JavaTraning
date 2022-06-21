package DAY1;

public class This1 {
void show() {
	System.out.println(this);
}
	public static void main(String[] args) {
		This1 r=new This1();
		System.out.println(r);
		
		r.show();
	}

}
