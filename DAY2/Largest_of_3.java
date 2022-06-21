package DAY2;

public class Largest_of_3 {

	public static void main(String[] args) {
		double n1=5.2, n2= -2.4, n3=3.7;
		
		if(n1>n2)    //comparision btw n1 & n2
		{
			if(n1>n3)	// comparision btw n1 & n3
			{
				System.out.println(n1+" is the greatest");
			}
			else
			{
				System.out.println(n3+" is the greatest");
			}
		}
		else
		{
			if(n2>n3)		//comparision btw n2 & n3
			{
				System.out.println(n2+" is the greates");
			}
			else
			{
				System.out.println(n3+" is the greatest");
			}
		}
		System.out.println("Out side the block");		// Outside the if else block
	}

}
