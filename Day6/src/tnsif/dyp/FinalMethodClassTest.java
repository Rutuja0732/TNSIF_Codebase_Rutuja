package tnsif.dyp;

public class FinalMethodClassTest extends FinalMethod {
	
	void display() {
		System.out.println(" this is derived class");
	}
	//compile time error
	//void finalmethod() {
	//	System.out.println("This is final metbhod of Parent class");
	//}

}
