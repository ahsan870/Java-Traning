package methodDemo;

public class CalculatorTest {

	public static void main(String[] args) {
	 Calculator cal = new Calculator();
	int total = cal.addition(10, 20);
	 
	 System.out.println("Addition of two number "+ total);
	 
	int  total1 = cal.addition(150, 75);
	 System.out.println("Addition of two number "+ total1);
	 
	 System.out.println("Addition of two number "+ total1);
	 
	 
	 System.out.println("Using method of all operations ");
	 System.out.println("-----------------------------------------------");
	 System.out.println("Addition of two number "+ cal.addition(75, 125));
	 System.out.println("Sub of two number "+ cal.substraction(175, 25));
	 System.out.println("Multify of two number "+ cal.multify(5, 10));
	 System.out.println("Division of two number "+ cal.divide(100, 5));

	}

}
