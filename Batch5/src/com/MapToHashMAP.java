package com.java.array;

import java.util.*;

public class MapToHashMAP {

	public static void main(String[] args) {
		
		
		
   Map<Integer, String> map = new HashMap<>();
		map.put(1,"a");
		map.put(2,"b");
		map.put(3,"c");
		map.put(4,"d");
		
	
		map.forEach((key,value)->System.out.println(key+":"+value));
		
		
	map.entrySet().stream().forEach((obj) -> System.out.println(obj));
	
	
	} 

}
