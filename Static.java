package AllJava8Featuress;

public interface Static {
	static void name() {
		System.out.println("Hello");
	}

}
 class Name implements Static {
	 public static void main (String args []){
		 Name obj = new Name();
		 Static.name();
	 }
 
 {
 }	
}
 //Interfce ke name se call ker sakte hai bss 
 //But default method ko call ker skte hai 