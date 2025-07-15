package tnsif.dyp;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Set;


	 public class HashMapTableDemo {

	 	public static void main(String[] args) {
	
	 		Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
	 		ht.put(101, "Pune");
	 		ht.put(102, "Mumbai");
	 		ht.put(101, "Delhi");
	 		ht.put(103, "Mumbai");
	 		ht.put(104, "Gujarat");
	 		System.out.println(ht);
	 		
	 		ht.putIfAbsent(105, "PCMC");
	 		ht.put(101, "Baramati");
	 		System.out.println(ht);
	 		System.out.println(ht.get(103));
	 		System.out.println(ht.replace(102,"Bombay"));
	 		System.out.println(ht);
	 		ht.clone();
	 		System.out.println(ht);
	 		Set s=ht.keySet();
	 		System.out.println(s);
	 		Collection<String> c=ht.values();
	 		System.out.println(c);
	 	}

	 



}
