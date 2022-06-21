package Java8Features;
@FunctionalInterface
interface MyInterface{
	public void myMethod();
}

public class LambdaExpression {

	public static void main(String[] args) {
		int variable=10;
		
		MyInterface myInterface=()->{						// syntax : ()-> {...};   //myInterface is object of interface 
			System.out.println("variable= "+variable);
		};
		myInterface.myMethod();								// calling interface method

	}

}
