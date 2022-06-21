package DAY2;

public class Else_if {

	public static void main(String[] args) {
		int number=0;
		
        if(number>0)
        {
        	System.out.println("The number is Positive");
        }
        else if(number<0)
        {
        	System.out.println("The number is Negative");
        }
        else
        {
        	System.out.println("The number is Zero");
        }
        System.out.println("Statement outside Else_if block");
	}

}
