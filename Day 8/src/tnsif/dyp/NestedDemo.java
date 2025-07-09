package tnsif.dyp;

public class NestedDemo implements OuterInterface,OuterInterface.InnerInterfac{

	@Override
	public void calArea() {
		System.out.println("hello");
	}

	@Override
	public void show() {
		System.out.println("everyone");
		
	}

}
