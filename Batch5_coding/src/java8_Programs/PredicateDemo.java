package java8_Programs;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

 /******************** Traditional way ********************/

//public class PredicateDemo implements Predicate<Integer>{       //implement interface
	
	/*
	 * @Override 
	 * public boolean test(Integer t)
	 *  { return false; }
	 */
	
	//public static void main(String[] args) {
		
		
		//we need to creat object and call the method by reference of an object
		
		// but if we use Lamda expression these all things are optional
		
 /********************* Lamda Expression *********************/		
		
		public class PredicateDemo{  // no need to implements interface here
			
			public static void main(String[] args) {
				
		   Predicate<Integer>predicate = (t)-> t%2==0;    //Lamda Expression  () -> {body}		    
		   System.out.println(predicate.test(2));
             
             
 /******************** By stream API,forEach method ***************/
		   
		   
          List<Integer> list1 = Arrays.asList(1,2,3,4,5,6);  
		     
		  list1.stream().filter(t-> t%2==0).forEach(t->System.out.println("print Even :"+t));
	}
	
	


}

