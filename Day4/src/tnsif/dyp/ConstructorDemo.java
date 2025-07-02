package tnsif.dyp;
import java.util.*;

public class ConstructorDemo {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		String name, city;
		int id;
		System.out.println("Enter customer Id");
		id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter customer name");
		name=sc.nextLine();
		
		System.out.println("Enter your city");
		city=sc.next();
		
		System.out.println(" ");
		Customer c1= new Customer();
		c1.setCustomerCity(city);
		c1.setCustomerId(id);
		c1.setCustomerName(name);
		System.out.println(c1);
		
		
		System.out.println(" ");
		Customer c2= new Customer(name,id,city);
		//System.out.println(c2);
		c2.setCustomerCity(city);
		c2.setCustomerId(id);
		c2.setCustomerName(name);
		System.out.println(c2);
		
		
		
	}

}
