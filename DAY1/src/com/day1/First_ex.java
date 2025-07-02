package com.day1;

public class First_ex {
	
       public static void main(String[] args) {
    	   /*Variables
    	    * 1. By using the keywords we can't declare the variables
    	    * 2.should not consist any spaces/ whitespace
    	    * 3.special symbols not allowed while declaring variables only '&' and '-' are allowed
    	    * 4.if joining two words use camelCase
    	    * 5.keywords can be used as variables only if You write them in UpperCase
    	    * 6.
    	    */
    	   String div= "BE-B";
	          System.out.println("Hello Rutuja , your class is "+div);
	          
	          
	          /*starting with the dataTypes
	           * 1.Primitive : These data types have fixed memory spaces and memory ranges.
	           
	            a) Number: Integer
	            1)byte : 1byte
	            2)short : 2bytes
	            3)int   : 4bytes
	            4)long  : 8bytes
	           
	            b)decimal
	            float : 4bytes
	            double: 8bytes
	            
	            c)character: 2bytes
	            
	            d) Boolean : 1byte
	           */
	          
	          //byte: 1 byte = 8bits     2^8
	          byte byteMax=127; 
	          byte byteMin=-128;
	          
	          //short : 2byte  2^16
	          short shortMax=32767;
	          short shortMin=-32768;
	          
	          //int : 4 byte   2^32
	          int maxInt=2147483647;
	          int minInt=-2147483648;
	          
	          
	          //long : 8byte 2^64 
	          //while assigning long value write'l' at the end of value
	         // long maxLong= 9223372036854775807;
	          //long minLong=-922337203854775808;
	          
	          
              //long: 8 byte: while assigning long value write'l' at the end of value
	          long num=2356789l;
	          System.out.println(num);
	          
	          //float : 4 byte: while assigning float value write'f' at the end of value
	          //double: 8 bytes: while assigning double value write'd' at the end of value
	          
	          float f=3234.141243278345f;
	  		  double d=3456.14124512345678902345678914f;

	         
	          
	          
	          //c)character: 2bytes:  it takes a single input and which has to be given in a single inverted coma i.e '  '
	          char xyz='a';
	          System.out.println(xyz);
	          char abc=65;//here it stores number's ASCII value
	          System.out.println(abc);
	          
	          
	        	
	          
	          // Typecasting 
	          //implicit typecasting (widening)
	          
	          byte num1 =1;
	          int i =num1;
	          System.out.println("......Its wideninening or implicit type casting where we convert from smaller to larger datatype"+i);
	          
	          
	          //explicit typecasting (narrowing)
	          
	          double f1= 10.52d;
	          long ll=(long) (f1);
	          System.out.println("........In explicit typecasting or narrowing we convert the larger datatype into smaller one forcefully"+ll);
	          
	          
           
       }
}
