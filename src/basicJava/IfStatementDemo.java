package basicJava;

public class IfStatementDemo {

	public static void main(String[] args) {

//		int age = 45;
//
//		if (age > 18 && age <=99) {
//			if (age > 18 && age <=50) {
//				System.out.println("Age is greater than 18 but under 50");
//			}else {
//				System.out.println("Age is greater than 18 but more than 50");
//			}
//			
//		} else if (age >= 100){
//			System.out.println("Congratulation");
//		}
//		
//		else {
//			System.out.println("Age is less than 18");
//		}

//		
//		Write an application for ticket pricing, 
//		Conditions
//		Guest is allowed if age is greater then 18 and not allowed if age is under 18.
//		The ticket price is 50 dollars if guest age is less than 60, 
//		The ticket price is 35 dollars for senior citizen if guest age is more than 60

		// if ( ){
		//
//	}

		int age = 65;

		if (age >= 18) {
			if (age <= 60) {
				System.out.println("Thank you! Your ticket price is $35 ");
			} else {
				System.out.println("Thank you! you got Senior Citizen ticket price, Your ticket price is $50 ");
			}
//			if (age >= 60) {
//				System.out.println("Thank you! you got Senior Citizen ticket price, Your ticket price is $50 ");
//			}else {
//				System.out.println("Thank you! Your ticket price is $35 ");
//			}
		} else {
			System.out.println("Sorry! You not Allowed !");
		}

	}

}
