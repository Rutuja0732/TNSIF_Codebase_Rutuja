package tnsif.dyp;



class Vehicle {
 // final method cannot be overridden
 public final void showType() {
     System.out.println("This is a vehicle.");
 }

 public void speed() {
     System.out.println("Speed depends on vehicle type.");
 }
}

//Subclass
class Car extends Vehicle {
 // Trying to override final method will cause compile-time error
 // public void showType() {
 //     System.out.println("This is a car."); // ❌ Error
 // }

 // This is allowed
 @Override
 public void speed() {
     System.out.println("Car speed is 100 km/h.");
 }
}

public class FinalDemo {
	 public static void main(String[] args) {
	     Car myCar = new Car();
	     myCar.showType();  // Calls the final method from Vehicle class
	     myCar.speed();     // Calls the overridden method in Car class
	 }
}
