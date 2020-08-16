package exceptionHandling;

import java.util.Scanner;

public class ExceptionTest {

	    public static void main(String[] args) {	
	 
	    	int firstNumber = 50;
	    	int secondNumber = 10;
	    	
	    	 try {
	  	double result = firstNumber / secondNumber;		
	    		System.out.println(result);
	    		}
	    		 catch (ArithmeticException e) {
	    			System.out.println("You cant not divide by 0 "+e);			
	    		}finally {
	    			System.out.println("This is divide method");
	    		}
    	
	    	ExceptionDemo exception = new ExceptionDemo();
	    	exception.showDisplay(500, 10);
	    	
	    }
}


