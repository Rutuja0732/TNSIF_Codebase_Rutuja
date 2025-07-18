package com.tnsif.day14.setdemo;

import java.util.HashSet;
import java.util.Set;

public class StudentMain {
	
	public static void main(String[] args) {
		
		Set<Student> set=new HashSet<Student>();
		set.add(new Student(10, "jyoti", 50.05));
		set.add(new Student(20, "asd", 60.50));
		set.add(new Student(20, "asd", 60.50));
		set.add(new Student(30, "dik", 35.50));
		set.add(new Student(40, "jyoti", 60.50));
		
		System.out.println(set);
		
	}

}
