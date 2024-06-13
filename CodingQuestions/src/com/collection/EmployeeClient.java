package com.collection;

import java.util.Set;

public class EmployeeClient {
	public static void main(String[] args) {
		Set<Employee> ts1 = new java.util.TreeSet<>();
		ts1.add(new Employee(101, "Abhishek", 32));
		ts1.add(new Employee(102, "Ashu", 30));
		ts1.add(new Employee(104, "Annuj", 27));
		ts1.add(new Employee(103, "Anoop", 45));
		ts1.add(new Employee(106, "Atul", 15));
		ts1.add(new Employee(105, "Amit", 25));
		///System.out.println(ts1);
		for(Employee emp:ts1) {
			System.out.println(emp);
		}
	}

}
