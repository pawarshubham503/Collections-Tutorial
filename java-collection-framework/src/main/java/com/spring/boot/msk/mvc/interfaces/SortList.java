package com.spring.boot.msk.mvc.interfaces;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortList {

	public static void main(String[] args) {

//		List<Integer> list = new ArrayList<>();
//		list.add(10);
//
//		list.add(30);
//		list.add(20);
//		
//		list.add(50);
//		list.add(40);
//		
//		//ascending order
//	Collections.sort(list);
//	System.out.println(list);
//	
//	//descending order
//	Collections.reverse(list);
//	System.out.println(list);
//	

		List<Employeee> employees = new ArrayList<>();
		employees.add(new Employeee(10, "shubham", 30, 400000));
		employees.add(new Employeee(20, "Suresh", 29, 350000));
		employees.add(new Employeee(30, "ramesh", 30, 450000));
		employees.add(new Employeee(40, "Rio", 29, 500000));

	Collections.sort(employees,( o1,  o2) ->(int) (o2.getSalary() - o1.getSalary())); 
System.out.println(employees);

	}
//class MySort implements Comparator<Employeee>{
//
//	@Override
//	public int compare(Employeee o1, Employeee o2) {
//		return(int) (o2.getSalary() - o1.getSalary());
//	}
}
