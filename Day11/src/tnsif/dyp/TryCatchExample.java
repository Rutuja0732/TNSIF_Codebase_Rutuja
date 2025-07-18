package tnsif.dyp;

public class TryCatchExample {

	static void performDivision(int x, int y) {
		System.out.println("i am in method");
	int z;
	try
	{
		System.out.println("i am in try block");
	    z=x/y;
		System.out.println("result of z is:"+ z);
	}
	catch (ArithmeticException e)
	{
		System.err.println(" I am in catch block ");
	}
}
}
