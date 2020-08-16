package oopsDemo;

public class PolymorpismTest {
public static void main(String[] args) {
	Teacher teacher = new Teacher();
	teacher.id = 1001;
	teacher.firstName = "Jamal";
	teacher.lastName = "Hasan";
	teacher.email = "jamal@gmail.com";
	teacher.phone = "3473334444";
	teacher.subject = "Programming";
	teacher.salary = 20000;	
	teacher.displayInformation();
	
	System.out.println(" --------------------");
	Teacher teacher1 = new Teacher();
	teacher1.id = 1002;
	teacher1.firstName = "Jaben";
	teacher1.lastName = "Hasan";
	teacher1.email = "jabed@gmail.com";
	teacher1.phone = "3473334444";
	teacher1.subject = "Programming";
	teacher1.salary = 25000;	
	teacher1.displayInformation();
	
	
}
}
