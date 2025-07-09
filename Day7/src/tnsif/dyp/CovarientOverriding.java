package tnsif.dyp;


class Color{
	protected Color getColor() {
		Color c=new Color();
		return c;
	}
} 
class Red extends Color{
	protected Red getColor() {
		Red c=new Red();
		return c;
}
}
class Blue extends Color{
	protected Blue getColor() {
		Blue c=new Blue();
		System.out.println("HI");
		return c;
}	
}
public class CovarientOverriding {

	public static void main(String[] args) {
		
		Blue c=new Blue();
		System.out.println(c);
	}
}
