package day3;

public class loopExmpl {

	public static void main(String[] args) {
		
		//1.do while: whether condition is true or false it at least executes once
		 int i = 1;
	        System.out.println("Do-While Loop:");
	        do {
	            System.out.println("Number: " + i);
	            i++;
	        } while (i <= 3);

	        // 2. while loop: executes if only the condition is true
	        int j = 2;
	        System.out.println("\nWhile Loop:");
	        while (j <= 10) {
	            System.out.println("Even: " + j);
	            j += 2;
	        }

	        // 3. for loop: iterations
	        System.out.println("\nFor Loop:");
	        for (int k = 1; k <= 5; k++) {
	            System.out.println("Square of " + k + " is " + (k * k));
	        }

	        // 4. for-each loop: Prints elements of an array
	        int[] numbers = {10, 20, 30, 40, 50};
	        System.out.println("\nFor-Each Loop:");
	        for (int num : numbers) {
	            System.out.println("Array Element: " + num);
	        }
	    }
}