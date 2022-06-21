package DAY2;

public class Forloop_break {
	 public static void main(String[] args) {
		 
		for(int i=0;i<=10;i++)		//for loop
		{
			if (i==3)
			{
				continue;		//skip this iteration for i=3
			}
			if(i==5)			// exit the loop when i==5
			{
				break;
			}
			System.out.println(i);
		}
	}

}
