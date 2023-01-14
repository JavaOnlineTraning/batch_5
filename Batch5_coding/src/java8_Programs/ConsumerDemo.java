package java8_Programs;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo{                          //no need to implement interface

	
	public static void main(String[] args) {
		
		/*
		 * Consumer<Integer>consumer = t -> System.out.println("printing : "+t);     //Lamda Expression
		 * //traditinal way
		 * 
		 * consumer.accept(15);
		 */
		       
		       
		    List<Integer> list1 = Arrays.asList(1,2,3,4,5,6);   //input, when I want list of number 
		                                                                        //using stream API there is forEach
		    list1.stream().forEach(t -> System.out.println("print : "+t));     //forEach always use consumer functional interface
		       
		       
		       
		       
	}

}









//  () -> {body}
//Consumer<T t>