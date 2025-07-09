package tnsif.dyp;

public class StringOperation{
  public static void main(String[] args) {
		String str=new String(" India ");
		System.out.println(str);
		
		String str1=str.toUpperCase();
		System.out.println(str1);
		
		System.out.println(str.length());
		System.out.println(str.charAt(4));
		
		String str2=str.substring(1, 5);
		System.out.println(str2);
		
		System.out.println(str.isEmpty());
		System.out.println(str.trim());
	
		//== -->object reference check
		//equals -->data
		
	}
}
