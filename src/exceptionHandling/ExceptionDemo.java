package exceptionHandling;

public class ExceptionDemo {

	public void showDisplay(int a, int b){
		 try {
			double result = a / b;		
			System.out.println(result);
			}
			 catch (ArithmeticException e) {
				System.out.println("You cant not divide by 0 "+e);			
			}finally {
				System.out.println("This is divide method");
			}
	}	
}

