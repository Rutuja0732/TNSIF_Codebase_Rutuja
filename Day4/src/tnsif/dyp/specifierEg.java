package tnsif.dyp;

public class specifierEg {

	//variables
	 int defaultVar = 10;          
	 private int privateVar = 20; 
	 public int publicVar = 30;   
	 protected int protectedVar = 40; 
	 
	 
	 void defaultMethod() {
		 System.out.println("defualt access modifier");
	        System.out.println("Default Method: " + defaultVar);
	    }

	    private void privateMethod() {
	    	System.out.println("private access modifier");
	        System.out.println("Private Method: " + privateVar);
	    }

	    public void publicMethod() {
	    	System.out.println("Privatet access modifier");
	        System.out.println("Public Method: " + publicVar);
	    }

	    protected void protectedMethod() {
	    	System.out.println("Protected access modifier");
	        System.out.println("Protected Method: " + protectedVar);
	    }
}
