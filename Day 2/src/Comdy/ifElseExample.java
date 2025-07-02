package Comdy;

public class ifElseExample {
	    public static void main(String[] args) {

	        int marks = 45; // You can change this value to test different outputs

	        //if
	        if (marks > 90) {
	            System.out.println("Excellent");
	        }
	        //else if
	        else if (marks >= 75) {
	            System.out.println("Very Good");
	        }
	        //else if
	        else if (marks >= 50) {
	            System.out.println("Good");
	        }
	        //else with nested if
	        else {
	            if (marks >= 35) {
	                System.out.println("Pass");
	            } else {
	                System.out.println("Fail");
	            }
	        }
	    }
	}



