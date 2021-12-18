package com.spring.boot.msk.mvc.interfaces;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class DifferentWaystoiterateOverList {

	public static void main(String[] args) {

		List<String> courses= Arrays.asList("C","C++","Java","spring","hibernate");
		
		//iterate using basic for loop
		
//		for(int i=0 ;i<courses.size();i++) {
//			System.out.println(courses.get(i));
//		}
//		
		//enhanced fro loop
//		for(String element :courses) {
//			System.out.println(element);
//			
		//}
	//
		

//		//basic loop with iterator
//		
//	}
		
	//iterator with whileloop
//		Iterator iterator=courses.iterator();
//
//		while(iterator.hasNext()) {
//			String course=(String) iterator.next();
//			System.out.println(course);
//		}
//	
//	
	
		//lamda expression
		courses.forEach((e)->System.out.println(e+","));
		
		
		//java 8 stream and lambda
		courses.stream().forEach(course-> System.out.println(course));
	
	
	

	} 
}
