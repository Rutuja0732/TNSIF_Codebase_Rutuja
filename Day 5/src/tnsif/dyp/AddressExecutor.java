package tnsif.dyp;

public class AddressExecutor {
	
	
	//This is example of has a methodin which you connect two classes : classes including are address,addressExecutor,person

	public static void main(String[] args) {
		
		Address ad= new Address("67/1,fursungi","Pune","Maharashtra","412308");
		
		
		Person p1= new Person("Rutuja",ad);
		p1.displayInfo();
		//System.out.println(p1.getAdsress());

	}

}
