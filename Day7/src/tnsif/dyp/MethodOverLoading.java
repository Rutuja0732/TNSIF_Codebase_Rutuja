package tnsif.dyp;

public class MethodOverLoading {

	public  static int addition(int a, int b)
	{
		return a+b;
		
		
	}
	public static int addition(int a, int b, int c)
	{
		return a+b+c;
		
		
	}
	public static float addition(float a, float b)
	{
		return a+b;
		
		
	}
	public static void main(String[] args) {
		System.out.println( MethodOverLoading.addition(1,2));
		System.out.println(MethodOverLoading.addition(1,2,3));
		System.out.println(MethodOverLoading.addition(12.5f,13.3f));
	
	}
}
