package basicJava;

public class IfElseStatement {
	public static void main(String[] args) {
		// maka a eligabe application for movie.
		// Conditions
		// age more than 12
		// price 12 to 15 = $12 - student package
		// price 18 to 64 = $12 - Adult package
		// price age > 65 = $10 - Senior package

		// valirable
		long priceForStudent = 12;
		long priceForAdult = 15;
		long priceForSenior = 10;
		long condition = 12;

		// Input for age
		long age = 20;

		if (age > 0 && age <= 100) {
			if (age >= condition) {
				if (age >= 12 && age < 18) {
					System.out.println(
							"You are eligible to theather! Your ticket price is $" + priceForStudent + "(Student)!");
				} else if (age > 18 && age < 65) {
					System.out.println(
							"You are eligible to theather! Your ticket price is $" + priceForAdult + "  (Adult)!");
				} else {
					System.out.println(
							"You are eligible to theather! Your ticket price is $" + priceForSenior + " (Senior)!");
				}

			} else {
				System.out.println("Sorry, you are not eligible to theather! ");
			}
		} else {
			System.out.println("Age is not valid. Please enter valid age!");
		}

		
		int i = 4;
	      int j = 0;
	      
	      if( i >5){
	          j = 5;
	      }else {
	          j = 10;
	      }
	      System.out.println(" J = "+ j );
	      
	    //   j = i>5?5:10;
	      
	    //   System.out.println(" J = "+ j );
	       
	}
}