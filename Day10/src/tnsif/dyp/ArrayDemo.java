package tnsif.dyp;


import java.util.Arrays;

public class ArrayClassDemo {
	
	public static void main(String[] args) {
		 int arr[]= {2,4,7,6};
		 System.out.println(Arrays.toString(arr));
		 
		 for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+" ");
			}
		 System.out.println("\n");
		 System.out.println(Arrays.binarySearch(arr, 3));
		 
		 System.out.println(Arrays.toString(arr));
		 
		 int arr1[]= {10,20,30};
		 System.out.println(Arrays.toString(arr1));
		 
		 if(Arrays.compare(arr, arr1)==0) {
			 System.out.println("same array");
		 }
		 else {
			 System.out.println("both the array are not same");
		 }
		 
		 int arr2[]=Arrays.copyOf(arr1, 2);
		 System.out.println(Arrays.toString(arr2));
	}

}

