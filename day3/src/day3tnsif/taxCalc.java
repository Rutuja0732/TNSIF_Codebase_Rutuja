package day3tnsif;

public class taxCalc {

	public void calculateTax(scannerExample scExample) 
	{
		
		if (scExample.getAge()>65 || scExample.getGender().equalsIgnoreCase("female"))
		{
			scExample.setTax(0);
			System.out.println("There is no Income Tax applied to you!");
		}
		else if (scExample.getIncome()<=160000)
		{
				scExample.setTax(0);
		        System.out.println("There is no Income Tax applied to you!");
		}
		
	   else if (scExample.getIncome() > 160000 && scExample.getIncome()<= 500000)
		   {
			   scExample.setTax((scExample.getIncome()-160000) *10/100);
		   }
	   else if (scExample.getIncome() > 500000 && scExample.getIncome()<= 800000)
	   {
		   scExample.setTax((scExample.getIncome()-500000 )*20/100 + 34000);
	   }
	   else 
	   {
		   scExample.setTax((scExample.getIncome()-800000)*30/100 +94000);
	   }
	}
	
}
		

	
	
	

