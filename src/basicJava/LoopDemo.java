package basicJava;

public class LoopDemo {

	public static void main(String[] args) {
		// Loop
		/*
		 * condition statement
		 * 
		 * 
		 * type -> 1. pre Test -1. for loop & while 2. post test - do while
		 * ------------------- 1. for loop 2. while 3. do while
		 * 
		 * i++ - ++i
		 * 
		 * for (initia ; condition; inc/dec) { SOP(Hello World); }
		 * 
		 */
		// for (int i = 0; i <=10; i++)
//		for (int i = 1; i <=100; i++) {
//			System.out.println("Hello World " +i);
//		}

//		int x = 100;
//		for (int i = x; i >=1; i --) {
//		System.out.println("Hello World" + i);
//		}

//		for(int i=10;i>=1;i--) {
//			if (i % 2 == 1) {
//				continue;
//			
//			}
//		System.out.println("Hello World "+ i);
//		}

		for (int i = 10; i >= 1; i--) {
			if (i == 9) {
				break;
			}
			System.out.println("Hello World " + i);
		}
		System.out.println("Out of loop ");

		/*
		 * While loop syntax
		 * 
		 * while (condition- Boolean-Ex){ Statement - SOP }
		 * 
		 * 
		 */
//		int x = 5;
//		
//		while(x <=10) {
//			System.out.println("Hello World " + x);
//			x++;
//		}

		/*
		 * do{ Statement - SOP }while (condition- Boolean-Ex)
		 * 
		 *
		 */
//		int y =10;
//		do {
//			System.out.println("Hello World " + y);
//			y++;
//		}while(y <=9);

	}

}
