package exceptionHandling;

public class ExceptionDemoOne {
	public static void main(String[] args) {
		/*
		 * 3 types exceptions
		 * 
		 *
		 * 
		 */

		int i = 50;
		int j = 0;
		try {
			int total = i / j;
			System.out.println("Division: " + i + " divided by " + j + " = " + total);
		} catch (ArithmeticException e) {
			System.out.println("You can not divide by 0 " +e);
		}

		System.out.println("more code can go... ");
		System.out.println("Expected result " + 10);

	}
}
