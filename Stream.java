package AllJava8Featuress;
import java.util.*;
import java.util.stream.IntStream;

public class Stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Normal way ///////
//		int arr[] = {1,2,3,4,5};
//		int sum = 0 ;
//		 for(int i=0;i<arr.length;i++) {
//			 if(arr[i]%2 == 0) {
//				 sum=sum+i;
//			 }
//		 
//		 }
//System.out.println(sum);



// By usinng Stream..

//int arr [] = {1,2,3,4,5};
//
//IntStream sum = Arrays.stream(arr).filter(n ->n%2 == 0);
		
		
		///KAise banta hai ....
		
		List <String> list =  Arrays.asList("Apple" , "Banana" , "Mango" , "Orange");
//		Stream<String > stream = list.stream();
		list.stream() ;
		
		int arr[] = {1,22,3,4,5};
		Stream stream = (Stream) Arrays.stream(arr);
		

	}

}
