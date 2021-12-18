package com.spring.boot.msk.mvc.interfaces;

import java.util.ArrayList;
import java.util.List;

//remove()
//removeAll()
//clear


public class RemoveElementsArraylist {

	public static void main(String[] args) {

		
		List<String> fruits=new ArrayList<>();
		
		fruits.add("Banana");//0
		fruits.add("Apple");//1
		fruits.add("mango");//2
		fruits.add("orange");//3
		fruits.add("Pineapple");//4
		fruits.add("Grapes");//5
		
		System.out.println(fruits);
		fruits.remove(4);
		System.out.println("after removing 4 element list looks like  "+fruits); 
	
		fruits.remove("mango");
		System.out.println("after removing mango element list looks like  "+fruits); 
		
	

		
		List<String> subfruitlist=new ArrayList<>();
		
		subfruitlist.add("Apple");//0
		subfruitlist.add("Banana");//1
		
		fruits.removeAll(subfruitlist);
		System.out.println(fruits );
		
		
		
		fruits.clear();
		System.out.println(fruits);
		
		
		
		
		
		
		
		
		
		
		
	}
}