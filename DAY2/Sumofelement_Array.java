package DAY2;

public class Sumofelement_Array {

	public static void main(String[] args) {
		int[] Arr= {1,2,3,4,5};		// Array declaration
		int sum=0;
		
		for(int A: Arr)		// for each loop
		{
			sum=sum+A;
		}
	System.out.println("The sum of Array elements "+sum);
	}

}
