package tnsif.dyp;

import java.util.Scanner;

public class UsingThrow {

	
	static int acceptNumber()
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		return n;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int per;
		System.out.println("Enter your percentage...");
		per=acceptNumber();
		
		try {
			if(per<0)
				throw new negativeException();
			else if(per>0)
				throw new greatervalueException();
			else System.out.println("Valid Percentage");
			
		}
		catch(negativeException | greatervalueException e)
		{
			System.err.println("Error: "+e.getMessage());
		}
	}

}