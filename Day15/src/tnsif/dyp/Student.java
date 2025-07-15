package tnsif.dyp;

public class Student {

	private int id;
	private String name;
	private double per;
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", per=" + per + "]";
	}
	public Student() {
		super();
	}
	public Student(int id, String name, double per) {
		super();
		this.id = id;
		this.name = name;
		this.per = per;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPer() {
		return per;
	}
	public void setPer(double per) {
		this.per = per;
	}
}
