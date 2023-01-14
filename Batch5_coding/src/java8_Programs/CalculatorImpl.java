package java8_Programs;

  @FunctionalInterface 
  interface Calculator{
 
       //void switchOn();
	  //void sum(int input);
	 int subtract(int i1,int i2);
  }
  
  public class CalculatorImpl{
 
           public static void main(String[] args) {
 
				/*
				 * Calculator calculator = () -> System.out.println("Hello java 8");
				 * 
				 * calculator.switchOn();
				 */
 
 
				/*
				 * Calculator calculator = (input) -> System.out.println("sum :"+input);
				 * 
				 * calculator.sum(123);
				 */
 
               Calculator calculator = (i1,i2) ->{ 
            	   if(i2<i1) { 
            	   throw new RuntimeException("SmallNumber");
 
                  }else {
                	  return i2-i1; 
                	  
                	  }
            	   };
 
 
               System.out.println(calculator.subtract(8, 20));
  
  }
  
  
  
 
  }
  
  
  
  //Lamda expression () -> {body}
 
























