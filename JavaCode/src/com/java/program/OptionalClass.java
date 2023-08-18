package com.java.program;

import java.util.Optional;



public class OptionalClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name=null;
		
		
		//System.out.println(name.toUpperCase());
		
		Optional<String> optional= Optional.ofNullable(name);	
		System.out.println(optional.isPresent());
		System.out.println(optional.isEmpty());
		System.out.println(optional.of("tgis is null value"));
		//System.out.println(optional.get());
		optional.ifPresent(t ->System.out.println(t));
		System.out.println(optional.orElse("no value found"));
//		System.out.println(optional.orElseGet(()->));





		
	}}
		


