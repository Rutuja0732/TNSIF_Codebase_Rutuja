package com.tnsif.day14.mapdemo;

import java.util.LinkedHashMap;

public class LinkedHashMap1 {
	
	public static void main(String[] args) {
		LinkedHashMap ht=new LinkedHashMap();
		ht.put(101,1000);
		ht.put(102,4000);
		ht.put(103,10);
		ht.put(104,5000);
		ht.put(101,2000);
		
		System.out.println(ht);
	}

	

}
