package com.custom;

import java.util.ArrayList;
import java.util.List;

public class CustomerClient {
	public static void main(String[] args) {
		List<Customer> listOfCustomer = new ArrayList<>();
		listOfCustomer.add(new Customer(1, "Ashish", "9554024356", 26));
		listOfCustomer.add(new Customer(2, "Anam", "9554454567", 26));
		listOfCustomer.add(new Customer(3, "Akash", "8554024356", 36));
		listOfCustomer.add(new Customer(4, "Isha", "6554024356", 36));
		listOfCustomer.add(new Customer(5, "Disha", "8854024356", 34));
		listOfCustomer.add(new Customer(6, "Ashmita", "8884024356", 23));
		listOfCustomer.add(new Customer(7, "Atul", "7554024356", 29));
		listOfCustomer.add(new Customer(8, "Avinash", "9554077356", 28));
		listOfCustomer.add(new Customer(9, "Amit", "9554024377", 24));
		listOfCustomer.add(new Customer(10, "Ajay", "9554024355", 23));
		System.out.println(listOfCustomer);
	}
}
