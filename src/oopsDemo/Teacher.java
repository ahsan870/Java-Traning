package oopsDemo;

public class Teacher extends Person{
	// this is part of polymorphism 
	String subject;
	double salary;
	
	@Override
	public void displayInformation() {
		System.out.println(id);
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(email);
		System.out.println(phone);
		System.out.println(subject);
		System.out.println(salary);
	}

}
