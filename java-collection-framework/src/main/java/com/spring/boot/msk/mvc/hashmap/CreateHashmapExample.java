package com.spring.boot.msk.mvc.hashmap;

import java.util.HashMap;
import java.util.Map;

public class CreateHashmapExample {

	
	public static void main(String[] args) {
		//example to map numbers to string
		Map<String, Integer> numberMapping=new HashMap<>();
		//add key value pair to map
		numberMapping.put("One",1);
		numberMapping.put("Two",2);
		numberMapping.put("Three",3);
		numberMapping.put("Four",4);
		numberMapping.put("Five",5);
		numberMapping.put(null,7);
		System.out.println(numberMapping);
		
		//check if map is empty
		System.out.println(!numberMapping.isEmpty());
		
		//check size of map
		System.out.println(numberMapping.size());
		
		//check key exists or not
		if(numberMapping.containsKey("Four")) {
			System.out.println("exists");
		}else {
			System.out.println("not exists");
		}
		
		
		//check value exists or not
		
		if(numberMapping.containsValue(8)) {
			System.out.println("exists");
		}else {
			System.out.println("not exists");
		}
		
		//get value using key
		Integer v1=numberMapping.get("One");
		System.out.println(v1);
		
		//remove key and values from map
		
		numberMapping.remove("One");
		System.out.println(numberMapping);
		
	}
}
