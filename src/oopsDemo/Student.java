package oopsDemo;

public class Student extends Person {
//This is part of Inheritance
//	int id;
//	String firstName;
//	String lastName;
//	String email;
//	String phone;
	String subject;
	double fees;

	
//	@Override
//	public void disPlayInformation() {
//		super.displayInformation();	
//		System.out.println(subject);
//		System.out.println(fees);
//	}
	@Override
	public void displayInformation() {
		System.out.println(id);
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(email);
		System.out.println(phone);	
		System.out.println(subject);
		System.out.println(fees);
	}
	
	
}
