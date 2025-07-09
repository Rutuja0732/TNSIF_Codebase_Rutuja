package tnsif.dyp;

public class Point {

	//constructor overloading
	private float x;
	private float y;
	
	public Point ()
	{
		x=0.0f;
		y=0.0f;
		System.out.println("Example of constructor overloading./n...............Default Constructor..............");
	}
	
	public Point(float x)
	{
		this.x=x;
		this.y=y;
		System.out.println("Area of Sqaure: "+x*x);
	}
	
	public Point(float x, float y)
	{
		this.x=x;
		this.y=y;
		System.out.println("Area of rectangle :"+x*y);
	}
}
