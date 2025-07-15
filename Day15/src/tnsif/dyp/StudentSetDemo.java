package tnsif.dyp;

import java.util.HashSet;
import java.util.Set;

public class StudentSetDemo {
public static void main(String[] args) {
	

	Set <Student> set= new HashSet <Student>();
	set.add(new Student(101,"rutuja",12.54));
	set.add(new Student(102,"gayatri",13.54));
	set.add(new Student(103,"jyoti",16.54));
	set.add(new Student(104,"diksha",19.54));
	set.add(new Student(105,"shrutika",20.54));
	
	System.out.println(set);
	
}
}
