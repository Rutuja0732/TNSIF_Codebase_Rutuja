package day3tnsif;
import java.util.Scanner;

public class scDemo {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		String name;
		System.out.println("enter your name ");
		name = sc.next();
		
		String Gender;
		System.out.println("enter your gender ");
		Gender = sc.next();
		
		int age;
		System.out.println("enter your age ");
		age = sc.nextInt();
		
		long mobileNumber;
		System.out.println("enter your mobile number ");
		mobileNumber = sc.nextLong();
		
		int income;
		System.out.println("enter your income ");
		income = sc.nextInt();
		
		scannerExample scExample= new scannerExample();
		scExample.setName(name);
		scExample.setGender(Gender);
		scExample.setAge(age);
		scExample.setIncome(income);
		scExample.setMobileNumber(mobileNumber);
		
		
		System.out.println(scExample.getName());
		System.out.println(scExample.getAge());
		System.out.println(scExample.getGender());
		System.out.println(scExample.getIncome());
		
		taxCalc calc= new taxCalc();
		calc.calculateTax(scExample);
		System.out.println("After calculation tax is  :"+ scExample.getTax() );
		//System.out.println(scExample.getTax());
		
		
		
	}
}
