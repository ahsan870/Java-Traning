package enumDemo;


 enum Days{
	MONDAY,
	TUESDAY,
	WEDNESDAY,
	THUSDAY,
	FRIDAY,
	SATURDAY,
	SUNDAY
}
/*
 * public static final 
 * public static final String Days = "MONDAY";
 * 
 * String DaysT = "Tuesday";
 * String DaysF = "Friday";
 * 
 * String DaysF  = Days
 * 
 * 
 * */
 
public class EnumDemo {

	public static void main(String[] args) {

		Days days = Days.WEDNESDAY;
		
		String Today = "Sunday";
		
//		System.out.println(days);
//		
//		if (days == Days.SATURDAY || days == Days.SUNDAY) {
//			System.out.println("Todays Weekend! Enjoy");
//		}else {
//			System.out.println("Todays Weekday! Stay Safe");
//		}
		System.out.println("-------------------------------------");
		
		Days dayss = Days.THUSDAY;
		
		switch (dayss) {
		case MONDAY:
			System.out.println("Todays Monday Weekday! Stay Safe");
			break;
		case TUESDAY:
			System.out.println("Todays Weekday! Stay Safe");
			break;
		case WEDNESDAY:
			System.out.println("Todays Weekday! Stay Safe");
			break;
		case THUSDAY:
			System.out.println("Todays Weekday THUSDAY! Stay Safe");
			break;
		case FRIDAY:
			System.out.println("Todays Weekday! Stay Safe");
			break;
		case SATURDAY:
			System.out.println("Todays Weekend! Enjoy");
			break;
		case SUNDAY:
			System.out.println("Todays Weekend! Enjoy");
			break;
		default:
			System.out.println("Invalid");
		}
		
		
	}

}
