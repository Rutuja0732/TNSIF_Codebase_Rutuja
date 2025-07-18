package tnsif.dyp;

public class NestedTryCatch {

	public static void check()
	{
		String str="tns";
		int slength= str.length();
		System.out.println("string length is "+slength);
		String anotherString =null;
		int y=6;
		try {
			
			try 
			{
				System.out.println(str.charAt(y));
			}
			catch(StringIndexOutOfBoundsException e)
			{
				System.out.println(e.getMessage());
			}
			System.out.println("String length is "+ anotherString.length());
		}
		catch(NullPointerException e)
		{
			System.out.println("not found any string");
		}
	}
	public static void main(String[] args) {
		check();
	}
}