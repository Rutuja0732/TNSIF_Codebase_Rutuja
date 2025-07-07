package tnsif.dyp;

public class Student extends Citizen {

	//inhereting the citizen class here
	//child class
	 private int rollNum;
	 private String collegeName;
	 
	 //non-parameterized constructor
	 public Student() {
		super();
	 }

	 public Student(String name, String adharNo, String address, long phone,int rollNum, String collegeName) {
		super(name,adharNo,address,phone);
	
		this.rollNum = rollNum;
		this.collegeName = collegeName;
		
	 }

	 public int getRollNum() {
		 return rollNum;
	 }

	 public void setRollNum(int rollNum) {
		 this.rollNum = rollNum;
	 }

	 public String getCollegeName() {
		 return collegeName;
	 }

	 public void setCollegeName(String collegeName) {
		 this.collegeName = collegeName;
	 }

	 @Override
	 public String toString() {
		return "Student [rollNum=" + rollNum + ", collegeName=" + collegeName + ", Name()=" + getName()
				+ ", AdharNo()=" + getAdharNo() + ", Address()=" + getAddress() + ", Phone()=" + getPhone()
				+ "]";
	 }
	 
	 
		
		
}
