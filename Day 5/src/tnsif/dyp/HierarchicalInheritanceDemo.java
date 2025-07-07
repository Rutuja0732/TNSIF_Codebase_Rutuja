package tnsif.dyp;

public class HierarchicalInheritanceDemo {
    public static void main(String[] args) {
        EmPerson pm=new EmPerson();
        System.out.println(pm);
  
    	EmPerson p= new EmPerson("Rutuja",21,"pune");
    	System.out.println("Person details"+p);
    	
    	p = new Bank("Rutuja", 21,"Pune", "SBI","saving");
    	System.out.println("Bank details"+p);
    	
    	p = new College("Rutuja", 21,"Pune","dyp","computer science engineering");
    	System.out.println("Collge details"+p);
    	
    	p = new Office("Rutuja", 21,"Pune","dyp","computer science engineering");
    	System.out.println("office details"+p);
    }
}
