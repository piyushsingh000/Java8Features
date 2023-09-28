package AllJava8Featuress;

public class LambdaEx {

	public static void main(String[] args) {
		A obj = ()-> {
			System.out.println("Hello Piyush");
			
		};
		obj.name();
	
	}

}
interface A {
	 void name() ;
		
}
@FunctionalInterface
interface B extends A {
	void name();
}