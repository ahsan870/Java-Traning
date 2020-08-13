package methodDemo;

public class StudentTest {
	public static void main(String[] args) {
		
		Students student1 = new Students();
		
		student1.rollNumber = 101;
		student1.firstName = "Raju";
		student1.lastName = "Ahmed";
		student1.email = "raju@gmail.com";
		student1.phone = "3473334444";
		
		student1.displayStudent();
		
		System.out.println("--------------------------");
		
		Students student2 = new Students();
		student2.rollNumber = 102;
		student2.firstName = "Riju";
		student2.lastName = "Hossain";
		student2.email = "riju@gmail.com";
		student2.phone = "3473334454";
		
//		System.out.println("Student Roll Number :" +student2.rollNumber);
//		System.out.println("Student First Name :" +student2.firstName);
//		System.out.println("Student Last Name :" +student2.lastName);
//		System.out.println("Student Email :" +student2.email);
//		System.out.println("Student Phone :" +student2.phone);
		
		student2.displayStudent();
		
	}
}
