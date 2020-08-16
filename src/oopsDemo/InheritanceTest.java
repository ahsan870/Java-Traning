package oopsDemo;

public class InheritanceTest {
public static void main(String[] args) {
	
	Student student1 = new Student();
	student1.id = 101;
	student1.firstName = "Ahsan";
	student1.lastName = "Ahmed";
	student1.email = "ahsan@gmail.com";
	student1.phone = "123456789";
	student1.subject = "Java";
	student1.fees =  2050.99;
	
	

	student1.displayInformation();
	
	System.out.println("--------------------------");
	Student student2 = new Student();
	student2.id = 102;
	student2.firstName = "Raju";
	student2.lastName = "Ahmed";
	student2.email = "raju@gmail.com";
	student2.phone = "123456789";
	student2.subject = "Java";
	student2.fees =  2050.99;
	student2.displayInformation();
	
	System.out.println("--------------------------");
	Student student3 = new Student();
	student3.id = 103;
	student3.firstName = "Rafi";
	student3.lastName = "Kyum";
	student3.email = "rafi@gmail.com";
	student3.phone = "123456789";
	student3.subject = "Java";
	student3.fees =  2050.99;
	student3.displayInformation();
	System.out.println("--------------------------");
	
	
	Student student4 = new Student();
	student4.id = 104;
	student4.firstName = "Anik";
	student4.lastName = "Khan";
	student4.email = "anik@gmail.com";
	student4.phone = "12345678";
	student4.subject = "java";
	student4.fees = 1099.99;
	student4.displayInformation();
	
	
}
}
