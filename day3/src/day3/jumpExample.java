package day3;

public class jumpExample {
public static void main(String[] args) {
	
//continue statement
	for(int k=5; k<15; k++) {
		
		if (k%2 !=0)
			continue;
			System.out.println(k + " ");

	}
	
	
//break statement
  for(int i=5; i<10; i++) {
		
		if (i==5)
			break;
		System.out.println(i);
		System.out.println("Hello  ");
	
}
  //switch case demo
  int ui=1;
  switch(ui)
  {
  case 1:System.out.println("current recharge details");
  break;
  
  case 2:System.out.println("current recharge expiry");
  break;
  
  case 3:System.out.println("New Offers");
  break;
  
  case 4: System.out.println("tal to customer caser");
  break;
  
  default:
	  System.out.println(ui+" is not valid input given by you");
  }
	
 
}
}