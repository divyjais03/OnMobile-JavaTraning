package DAY2;

public class Switch_case {

	public static void main(String[] args) {
		int Result=1;
		
		switch (Result) {		//switch case
		case 1: {
			
			System.out.println("Yup!!, Passed");
			break;
		}
		case 2:{
			System.out.println("Oops!!, Failed");
			break;
		}
	
		default:						// Default switch case
			System.out.println("Default case executed!!");
		}

	}

}
