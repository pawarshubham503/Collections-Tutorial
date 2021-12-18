package com.spring.boot.msk.mvc.interfaces;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {

	public static void main(String[] args) {
		Collection<String> fruitCollection = new ArrayList<>();

		fruitCollection.add("banana");
		fruitCollection.add("apple");
		fruitCollection.add("mango");
		System.out.println(fruitCollection);
		
		//removes apple from collection
		fruitCollection.remove("banana");
		System.out.println(fruitCollection);
	    //check if collection contains apple	
	System.out.println(fruitCollection.contains("apple"));	
	
	System.out.println(!fruitCollection.isEmpty());
	
	
	//to print each element using for each
	fruitCollection.forEach((element)->{
		System.out.println(element);
	});
	
	fruitCollection.clear();
	System.out.println(fruitCollection);
	}
}
