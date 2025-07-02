package tnsif.dyp;

public class Executor {

	public static void main(String[] args) {
		specifierEg s1=new specifierEg();
		
		s1.defaultMethod();
		s1.protectedMethod();
		s1.publicMethod();
		
		
		s1.defaultVar=11;
		s1.defaultMethod();
		
		s1.protectedVar=100;
		s1.protectedMethod();
		
		s1.publicVar=300;
		s1.publicMethod();
	}

}
