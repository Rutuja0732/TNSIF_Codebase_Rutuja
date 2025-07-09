package tnsif.dyp;




public class StringComp {
	
	public static void main(String[] args) {
		String s1="TNSIF";
		String s2="TNSIF";
		
		String s3=new String("TNSIF");
		String s4=new String("TNSIF");
		
		System.out.println("Case 1: "+(s1==s2));
		System.out.println("case2 : "+(s1==s3));
		System.out.println("case 3: "+(s2.equals(s1)));
		System.out.println("case 4: "+(s2.equals(s4)));
		System.out.println("case 5: "+(s3==s4));
		
		String s5="jyoti";
		System.out.println(s5.hashCode());
		System.out.println(s3.hashCode());
		
		System.out.println(s1.compareTo(s5));
		System.out.println(s2.compareTo(s1));
	}

}

	