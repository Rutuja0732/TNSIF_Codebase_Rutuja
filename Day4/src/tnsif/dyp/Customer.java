package tnsif.dyp;

public class Customer {
	
	private String customerName;
	private int customerId;
	private String customerCity;
	
	//default constructor
	public Customer()
	{
		System.out.println("Example of default constructor");
	    }
		
		//parameterized / user defined constructor
	public Customer(String customerName, int customerId, String customerCity) {
		
		System.out.println("Example of parameterized constructor ");
		
		this.customerName = customerName;
		this.customerId = customerId;
		this.customerCity = customerCity;
	}
	
//getter setter
	
	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerCity() {
		return customerCity;
	}

	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}
	
	//toString

	
	@Override
	public String toString() {
	    return "Customer ID: " + customerId +
	           "\nCustomer Name: " + customerName +
	           "\nCustomer City: " + customerCity;
	}




	
	
	
}
