package Java8Features;
@FunctionalInterface
 interface MyInterface1{
	default void newDefaultMethod() {
		System.out.println("New Default Method");
	}
	static void newStaticMethod() {
		System.out.println("New Static Method");
	}
	void existingMethod(String str);
}

public class DefaultStatic_Interface implements MyInterface1 {     		//for interface we use implements
	public void existingMethod(String str) {
		System.out.println("String: "+str);
	}
	public static void main(String[] args) {
		DefaultStatic_Interface obj=new DefaultStatic_Interface();
		obj.newDefaultMethod();
		MyInterface1.newStaticMethod();
		obj.existingMethod("This is new Java 8 Feature");
	}

}
