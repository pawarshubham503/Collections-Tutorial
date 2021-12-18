package com.spring.boot.msk.mvc.interfaces;

import java.util.ArrayList;
import java.util.List;

public class CreateArraylistFromCollectionExample {

	public static void main(String[] args) {

		
		//create arraylist class object
		
		List<Integer> firstFivePrimeNumbers= new ArrayList<>();
	
		firstFivePrimeNumbers.add(2);
		firstFivePrimeNumbers.add(3);
		firstFivePrimeNumbers.add(5);
		firstFivePrimeNumbers.add(7);
		firstFivePrimeNumbers.add(11);
		
		//create an arraylist from another arraylist to add elements
		List<Integer> firstTenPrimeNumbers=new ArrayList<>(firstFivePrimeNumbers);
		
		
		List<Integer> nextFIvePrimeNumbers=new ArrayList<>();
		nextFIvePrimeNumbers.add(13);
		nextFIvePrimeNumbers.add(17);
		nextFIvePrimeNumbers.add(19);
		nextFIvePrimeNumbers.add(23);
		nextFIvePrimeNumbers.add(29);
		
		//used arraylist and addall method to add all elements of another arraylist
		firstTenPrimeNumbers.addAll(nextFIvePrimeNumbers);
		
		System.out.println(firstTenPrimeNumbers);
	} 

}
