package DAY2;

public class Labeled_break {

	public static void main(String[] args) {
		
		first: for (int i=0;i<3;i++)		// labeled for loop
		{
			second: for (int j=0;j<3;j++)
			{
				System.out.println("i="+i+"j="+j);
				
				if(j==1) break second;    	// Labeled break used here
			}
		//if(i==1) break first;	
		}
	}

}
