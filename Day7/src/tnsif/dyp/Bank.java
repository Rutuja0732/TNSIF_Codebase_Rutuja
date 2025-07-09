package tnsif.dyp;

public class Bank {


	public static void main(String[] args) {
		RBI rbi=new RBI();
		System.out.println(rbi.getRateofInterest());
		//dynamic binding
		rbi=new SBI();
		System.out.println(rbi.getRateofInterest());
		rbi=new ICICI();
		System.out.println(rbi.getRateofInterest());

	}
}
