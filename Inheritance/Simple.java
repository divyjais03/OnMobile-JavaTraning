package Inheritance;

class student{
	int roll, marks;
	String name;
	void input() {
		System.out.println("Enter Name, Roll no., Marks:");
	}
}
class Simple extends student{
	
	void disp() {
		roll=1; name="Ankit"; marks=89;
		System.out.println(roll+" "+name+" "+marks);
	}
	public static void main(String[] args) {
		Simple r= new Simple();
		r.input();
		r.disp();
	}		
}
/*public class Simple {

public static void main(String[] args) {     // or we can declare in seperate class as well..!
	Simple r= new Simple();
	r.input();
	r.disp();
}		

}*/
