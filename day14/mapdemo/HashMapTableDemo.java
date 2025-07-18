
package com.tnsif.day14.mapdemo;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Set;

public class HashMapTableDemo {
	
	public static void main(String[] args) {
		Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
		ht.put(101, "Pune");
		ht.put(102, "Pune");
		ht.put(101, "mumbai");
		ht.put(103, "goa");
		ht.put(105, "pune");
		
		System.out.println(ht);
		
		System.out.println(ht.get(103));
		
		System.out.println(ht.replace(101, "nashik"));
		System.out.println(ht);
	
		ht.clone();
		System.out.println(ht);
		
		Set s=ht.keySet();
		System.out.println(s);
		
		Collection<String> c=ht.values();
		System.out.println(c);
		
	}

}
