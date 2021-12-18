package com.spring.boot.msk.mvc.interfaces;

import java.util.ArrayList;
import java.util.List;

//how to check if arraylist is empty using the isEmpty()methos
//to find the size of an Arraylist using the size () method
//to access the elemnt at a particular index using get()
//to modify element at particular index using set ()
public class AccessElementsFromArraylistExample {

	
	public static void main(String[] args) {
		
		List<String> topProgrammingLanguages =new ArrayList<>();
	//check if list is empty	
	System.out.println(" is it empty  ->  " + topProgrammingLanguages.isEmpty());	
		
	topProgrammingLanguages.add("C");
	
	topProgrammingLanguages.add("JAVA");
	
	topProgrammingLanguages.add("PYTHON");
	
	topProgrammingLanguages.add(".NET");
	
	//check size of list
	System.out.println(" here are top prg languages  " + topProgrammingLanguages.size());	
	
	
	//retrieve element from given index
	String bestProgramminglang=topProgrammingLanguages.get(1);
	
	System.out.println("is best prg lang   "+bestProgramminglang);
	
	//retrieve element from given index
	String secondProgramminglang=topProgrammingLanguages.get(2 );
	
	System.out.println("is second prg lang   "+secondProgramminglang);
	
	//modify element at given index
	
	topProgrammingLanguages.set(3, "C#");
	System.out.println(topProgrammingLanguages);
	
	
	
	
	
	
	
	
	
	}


	

}
