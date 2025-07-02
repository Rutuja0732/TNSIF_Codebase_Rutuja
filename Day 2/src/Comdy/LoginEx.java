package Comdy;

public class LoginEx {
	 public static void main(String[] args) {

	  
	        String username = "admin";
	        String password = "1234";

	        // Nested if-else if logic
	        if (username.equals("admin")) {
	            if (password.equals("1234")) {
	                System.out.println("Login successful");
	            } else {
	                System.out.println("Incorrect password");
	            }
	        } else if (password.equals("1234")) {
	            System.out.println("Incorrect username");
	        } else {
	            System.out.println("Invalid credentials");
	        }
	    }
}