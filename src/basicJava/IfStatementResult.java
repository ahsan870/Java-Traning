package basicJava;

public class IfStatementResult {

	public static void main(String[] args) {

		//<6 = fail
		// Computer Logic
		int marks = 708;
		char gradeDemo = '0';
		if (marks <= 100) {
			if (marks < 60) {
				System.out.println("Sorry! You are fail : F");
				gradeDemo = 'F';
			} else if (marks >= 60 && marks < 69) {
				System.out.println("Congratulation! You grade is : D");
				gradeDemo = 'D';
			} else if (marks >= 70 && marks < 79) {
				System.out.println("Congratulation! You grade is : C");
				gradeDemo = 'C';
			} else if (marks >= 80 && marks < 89) {
				System.out.println("Congratulation! You grade is : B");
				gradeDemo = 'B';
			} else if (marks >= 90 && marks <= 100) {
				System.out.println("Congratulation! You grade is : A");
				gradeDemo = 'A';
			}
		} else {
			System.out.println("Invalid marks!");
		}
		//--------------------------------------------------
		
		
		//char grade = 'M';
		char grade = gradeDemo;
		
		
		switch (grade) {
		case 'A' :
			System.out.println("Excellent ");
		break;
		case 'B' :
			System.out.println("Well done ");
		break;
		case 'C' :
			System.out.println("Very Good ");
		break;
		case 'D' :
			System.out.println("Good ");
		break;
		case 'F' :
			System.out.println("Sorry, Try again ");
		break;
		default:
			System.out.println("No comment ");
		}
	
		
	}

}
