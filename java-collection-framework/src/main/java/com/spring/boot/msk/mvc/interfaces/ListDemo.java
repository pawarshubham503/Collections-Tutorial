package com.spring.boot.msk.mvc.interfaces;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		// list allows us to duplicate elements
//
//		list.add("element1");
//		list.add("element1");
//		list.add("element2");
//		list.add("element2");
//		System.out.println(list);
//		
		// list allows us to null elements
//		
//		list.add(null);
//		list.add(null);
//		System.out.println(list);
		
		//list insertionn order is maintained
		
		list.add("element 1");//0
		list.add("element 2");//1
		list.add("element 4");//2
		list.add("element 3");//3
		list.add("element 5");//4
		System.out.println(list);
		
		
		//access elements from list
		System.out.println(list.get(0));
		System.out.println(list.get(4));
	}
}

















