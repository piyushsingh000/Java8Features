package AllJava8Featuress;

public class Default {

	public static void main(String[] args) {
		Y obj = new Y ();
		obj.name();
		
		X obj1 = new Y ();
		obj1.name();
		
		

	}

}
interface X{
	//Default means with body....
	default void name() {
		System.out.println("Piyush is my name");
		
	}
}
 class Y implements X{
	 @Override 
	 public void name() {
		 System.out.println("Haahahaha");
	 }
	
}