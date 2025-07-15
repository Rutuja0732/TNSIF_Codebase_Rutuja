package tnsif.dyp;


class JArray{
	static void printArray(int c[ ] [ ] )
	{
		System.out.println("elements of array are as follows:");
		for (int i=0;i<c.length;i++)
		{
			for(int j=0;j<=c[i].length;j++)
			{
			System.out.println(c[i][j]+ " ");	
			}
			System.out.println();
		}
	}
}




public class JaggedArrayDemo {
	
	
public static void main(String[] args) {
		
		int c[][]= {{12,13},{23,24},{25,26,27}};
		
		System.out.println(c.length);
		
		JArray.printArray(c);
		}

}

