package com.tnsif.day14.setdemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {
	
	public static void main(String[] args) {
		Set<Integer> set=new HashSet<Integer>();
		
		set.add(100);
		set.add(10);
		set.add(20);
		set.add(10);
		set.add(15);
		set.add(30);
		
		System.out.println(set);
		
		boolean b1=set.contains(10);
		System.out.println(b1);
		
		boolean b2=set.isEmpty();
		System.out.println(b2);
		
		Iterator<Integer> i=set.iterator();
		while(i.hasNext()) {
			System.out.print(i.next()+" ");
		}
		
	}

}
