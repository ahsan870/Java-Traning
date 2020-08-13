package encapsulationDemo;

public class StudentTest {

	public static void main(String[] args) {
	
		Student student = new Student();
		student.setRollNumber(101);
		student.setFirstName("Ahsan");
		student.setLastName("Ahmed");
		student.setCourse("Java");
		
		System.out.println(" Roll Number " + student.getRollNumber());
		System.out.println(" First Name " + student.getFirstName());
		System.out.println(" Last Name " + student.getLastName());
		System.out.println(" Course Name " + student.getCourse());
		
		


	}

}
