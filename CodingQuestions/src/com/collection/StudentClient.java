package com.collection;

import java.util.Set;
import java.util.TreeSet;

public class StudentClient {
	public static void main(String[] args) {
		Set<Student> set = new TreeSet<>((s1, s2) -> s1.getId().compareTo(s2.getId()));
		set.add(new Student(100L, "Ashish", (byte) 25));
		set.add(new Student(101L, "Amit", (byte) 29));
		set.add(new Student(102L, "Ajay", (byte) 30));
		set.add(new Student(103L, "Abhay", (byte) 35));
		set.add(new Student(104L, "Anil", (byte) 22));
		set.add(new Student(105L, "Atul", (byte) 28));
		set.add(new Student(106L, "Akash", (byte) 26));
		System.out.println("Sorting by id");
		for (Student stu : set) {
			System.out.println(stu);
		}
		
		Set<Student> set2 = new TreeSet<>((s1, s2) -> s2.getId().compareTo(s1.getId()));
		set2.addAll(set);
		System.out.println("=======================================");
		for (Student stu : set2) {
			System.out.println(stu);
		}
		
	}
}
