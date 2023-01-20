package java8_Programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class MapDemo {


	public static void main(String[] args) {
          List<String> list = new ArrayList<>();
          list.add("Snehal");
          list.add("Gargi");
          list.add("Ankit");
          list.add("Kundan");
          
          //Traditional way
          for(String s:list){
        	  System.out.println(s);
          }
           //void accept(T t);
          // t-> System.out.println(t);   //accept () and convert it into lamda exp.
         // using stream API
          list.stream().forEach(t-> System.out.println(t));

	


          Map<Integer, String>map=new HashMap();
          map.put(1,"a");     //1 : a
          map.put(2,"b");    // 2 : b
          map.put(3,"c");    // 3 : c    //output
          map.put(4,"d");    // 4 : d
          
          map.forEach((key,value)-> System.out.println(key+" :"+value));

	//we can't convert map directly into stream so we have entrySet()
	map.entrySet().stream().forEach(obj ->System.out.println(obj));
	
	
	}
}

           
          
