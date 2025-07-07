package tnsif.dyp;

public class Person {
	private String name;
	private Address address;
	
	public Person(String name, Address adsress) {
		super();
		this.name = name;
		this.address = adsress;
	}
	public Person() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAdsress() {
		return address;
	}
	public void setAdsress(Address adsress) {
		this.address = adsress;
	}
	
	public void displayInfo()
	{
		System.out.println("Name : "+ name);
		System.out.println("Address :"+ address.getStreet()+","+address.getCity()+","+address.getState()+","+address.getPinCode());
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + "]";
	}
	
	
}
